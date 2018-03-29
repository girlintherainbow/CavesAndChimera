package controllers;

import models.*;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.homepage;

import javax.inject.Inject;
import javax.persistence.Table;
import java.util.List;

import static javax.swing.text.html.HTML.Tag.SELECT;

public class CharacterController extends Controller
{
    private FormFactory formFactory;
    private JPAApi jpaApi;

    @Inject
    public CharacterController(FormFactory formFactory, JPAApi jpaApi)
    {
        this.formFactory = formFactory;
        this.jpaApi = jpaApi;
    }

    @Transactional(readOnly = true)
    public Result getGameCharacters()
    {

        DynamicForm form = formFactory.form().bindFromRequest();


        List<GameCharacter> characters = jpaApi.em().
                createQuery("SELECT gc FROM GameCharacter gc ").getResultList();

        return ok(views.html.activecharacters.render(characters));
    }


    @Transactional(readOnly = true)
    public Result getGameCharacter(int gameCharacterID)
    {

        String sql = "SELECT NEW models.CharacterDetail(gc.gameCharacterID, gc.characterName, gc.characterLevel," +
                " cr.characterRaceName, cc.characterClassName, " +
                "cb.characterBackgroundName, ca.alignmentName, gc.strength," +
                "gc.strengthMod, gc.dexterity, gc.dexMod, gc.constitution," +
                "gc.conMod, gc.intelligence, gc.intelMod, gc.wisdom," +
                "gc.wisMod, gc.charisma, gc.charMod, gc.passiveWisdomPerception) " +
                "FROM CharacterRace cr " +
                "JOIN GameCharacter gc ON cr.characterRaceID = gc.characterRaceID " +
                "JOIN CharacterClass cc ON cc.characterClassID = gc.characterClassID " +
                "JOIN CharacterBackground cb ON cb.characterBackgroundID = gc.characterBackgroundID " +
                "JOIN CharacterAlignment ca ON ca.alignmentID = gc.alignmentID " +
                "WHERE gameCharacterID = :gameCharacterID ";
        CharacterDetail details = jpaApi.em().
                createQuery(sql, CharacterDetail.class).setParameter("gameCharacterID", gameCharacterID).
                getSingleResult();


        String sqlEquip = "SELECT NEW models.CharacterEquipment(ce.characterEquipmentID, ce.gameCharacterID, " +
                " e.equipmentID, e.equipmentName, e.equipmentCost, " +
                "e.equipmentDamage, e.equipmentWeight, e.equipmentProperties, e.equipmentLocationID) " +
                "From Equipment e JOIN CharacterEquipment ce ON e.equipmentID = ce.equipmentID " +
                "WHERE gameCharacterID = :gameCharacterID ";

        List<CharacterEquipment> equipment = jpaApi.em().
                createQuery(sqlEquip, CharacterEquipment.class)
                .setParameter("gameCharacterID", gameCharacterID).getResultList();

        String sqlGear = "SELECT NEW models.CharacterGear(cg.characterGearID, cg.gameCharacterID, g.gearID," +
                " g.gearName, g.gearCost, g.gearWeight, g.gearClassID) " +
                " FROM Gear g JOIN CharacterGear cg on g.gearID = cg.gearID " +
                "WHERE gameCharacterID = :gameCharacterID ";


        List<CharacterGear> gear = jpaApi.em().
                createQuery(sqlGear, CharacterGear.class).
                setParameter("gameCharacterID", gameCharacterID).getResultList();

        String sqlSpells = "SELECT NEW models.CharacterSpell(cs.characterSpellID, cs.gameCharacterID, " +
                "s.spellID, s.spellName, s.spellLevel, s.castingTime, " +
                "s.duration, s.range_Area, s.attack_Save, s.damage_Effect) " +
                "FROM Spell s JOIN CharacterSpell cs on s.spellID = cs.spellID " +
                "WHERE gameCharacterID = :gameCharacterID ";

        List<CharacterSpell> spell = jpaApi.em().
                createQuery(sqlSpells, CharacterSpell.class).
                setParameter("gameCharacterID", gameCharacterID).getResultList();


        String sqlNotes = "SELECT NEW models.CharacterNotes(characterNoteID, gameCharacterID, " +
                "personalityTraits, ideals, bonds, flaws) " +
                "FROM CharacterNotes WHERE gameCharacterID = :gameCharacterID ";

        List<CharacterNotes> note = jpaApi.em().
                createQuery(sqlNotes, CharacterNotes.class).
                setParameter("gameCharacterID", gameCharacterID).getResultList();

        List<Equipment> equipmentList = jpaApi.em().
                createQuery("SELECT NEW models.Equipment(equipmentID, equipmentName, equipmentCost, equipmentDamage," +
                        "equipmentWeight, equipmentProperties, equipmentClassID, equipmentLocationID) " +
                        "FROM Equipment ORDER BY equipmentName", Equipment.class).getResultList();

        List<Gear> gearList = jpaApi.em().
                createQuery("SELECT NEW models.Gear(gearID, gearName, gearCost, gearWeight, gearClassID)" +
                        "FROM Gear ORDER BY gearName", Gear.class).getResultList();

        List<Spell> spellList = jpaApi.em().
                createQuery("SELECT NEW models.Spell(spellID, spellName, spellLevel, " +
                        "castingTime, duration, range_Area, attack_Save, " +
                        "damage_Effect) FROM Spell ORDER BY spellName", Spell.class).getResultList();

        return ok(views.html.character.render(details, equipment, gear, spell, note, equipmentList, gearList, spellList));
    }

    @Transactional
    public Result postGameCharacter(int gameCharacterID)
    {
        String sql = "SELECT NEW models.CharacterDetail(gc.gameCharacterID, gc.characterName, gc.characterLevel," +
                " cr.characterRaceName, cc.characterClassName, " +
                "cb.characterBackgroundName, ca.alignmentName, gc.strength," +
                "gc.strengthMod, gc.dexterity, gc.dexMod, gc.constitution," +
                "gc.conMod, gc.intelligence, gc.intelMod, gc.wisdom," +
                "gc.wisMod, gc.charisma, gc.charMod, gc.passiveWisdomPerception) " +
                "FROM CharacterRace cr " +
                "JOIN GameCharacter gc ON cr.characterRaceID = gc.characterRaceID " +
                "JOIN CharacterClass cc ON cc.characterClassID = gc.characterClassID " +
                "JOIN CharacterBackground cb ON cb.characterBackgroundID = gc.characterBackgroundID " +
                "JOIN CharacterAlignment ca ON ca.alignmentID = gc.alignmentID " +
                "WHERE gameCharacterID = :gameCharacterID ";
        CharacterDetail details = jpaApi.em().
                createQuery(sql, CharacterDetail.class).setParameter("gameCharacterID", gameCharacterID).
                getSingleResult();

        DynamicForm form = formFactory.form().bindFromRequest();
        String equipmentName = form.get("equipmentName");

        details.setCharacterName(equipmentName);
        jpaApi.em().persist(details);

        return redirect(routes.CharacterController.getGameCharacters());
    }

    @Transactional
    public Result postAddWeapon()
    {
        DynamicForm form = formFactory.form().bindFromRequest();
        int equipmentID = new Integer(form.get("equipmentID"));
        int gameCharacterID = new Integer(form.get("gameCharacterID"));

        CharacterEquipmentLink characterEquipmentLink = new CharacterEquipmentLink();

        characterEquipmentLink.setEquipmentID(equipmentID);
        characterEquipmentLink.setGameCharacterID(gameCharacterID);

        characterEquipmentLink.setEquipmentLocationID(2);

        jpaApi.em().persist(characterEquipmentLink);


        return redirect(routes.CharacterController.getGameCharacter(gameCharacterID));

    }

    @Transactional
    public Result postAddGear()
    {
        DynamicForm form = formFactory.form().bindFromRequest();
        int gearID = new Integer(form.get("gearID"));
        int gameCharacterID = new Integer(form.get("gameCharacterID"));

        CharacterGearLink characterGearLink = new CharacterGearLink();

        characterGearLink.setGearID(gearID);
        characterGearLink.setGameCharacterID(gameCharacterID);

        jpaApi.em().persist(characterGearLink);

        return redirect(routes.CharacterController.getGameCharacter(gameCharacterID));
    }

    @Transactional
    public Result postAddSpell()
    {
        DynamicForm form = formFactory.form().bindFromRequest();

        int spellID = new Integer(form.get("spellID"));
        int gameCharacterID = new Integer(form.get("gameCharacterID"));

        CharacterSpellLink characterSpellLink = new CharacterSpellLink();


        characterSpellLink.setSpellID(spellID);
        characterSpellLink.setGameCharacterID(gameCharacterID);

        jpaApi.em().persist(characterSpellLink);

        return redirect(routes.CharacterController.getGameCharacter(gameCharacterID));
    }

    @Transactional(readOnly = true)
    public Result getNewCharacter()
    {


        List<CharacterRace> races = jpaApi.em().
                createQuery("SELECT cr FROM CharacterRace cr" +
                        " ORDER BY characterRaceName").getResultList();

        List<CharacterClass> classes = jpaApi.em().
                createQuery("SELECT cc FROM CharacterClass cc " +
                        "ORDER BY characterClassName").getResultList();


        List<CharacterBackground> backgrounds = jpaApi.em().
                createQuery("SELECT cb FROM CharacterBackground cb " +
                        "ORDER BY characterBackgroundName").getResultList();

        List<CharacterAlignment> alignments = jpaApi.em().
                createQuery("SELECT ca FROM CharacterAlignment ca " +
                        "ORDER BY alignmentID").getResultList();

        List<Equipment> equipments = jpaApi.em().
                createQuery("SELECT e FROM Equipment e " +
                        "ORDER BY equipmentName").getResultList();

        List<Gear> gears = jpaApi.em().
                createQuery("SELECT g FROM Gear g " +
                        "ORDER BY gearName").getResultList();

        List<Spell> spells = jpaApi.em().
                createQuery("SELECT s FROM Spell s " +
                        "ORDER BY spellName").getResultList();

        return ok(views.html.newcharacter.render(races, classes, backgrounds, alignments, equipments, gears, spells));
    }

    @Transactional
    public Result postNewCharacter()
    {

        GameCharacter gameCharacter = new GameCharacter();

        DynamicForm form = formFactory.form().bindFromRequest();
        String characterName = form.get("characterName");
        String characterLevel = form.get("characterLevel");
        int characterRaceID = new Integer(form.get("characterRaceID"));
        int characterClassID = new Integer(form.get("characterClassID"));
        int characterBackgroundID = new Integer(form.get("characterBackgroundID"));
        int alignmentID = new Integer(form.get("alignmentID"));


        int strength = new Integer(form.get("strength"));
        int strengthMod = new Integer(form.get("strengthMod"));
        int dexterity = new Integer(form.get("dexterity"));
        int dexMod = new Integer(form.get("dexterityMod"));
        int constitution = new Integer(form.get("constitution"));
        int conMod = new Integer(form.get("conMod"));
        int intelligence = new Integer(form.get("intelligence"));
        int intelMod = new Integer(form.get("intelMod"));
        int wisdom = new Integer(form.get("wisdom"));
        int wisMod = new Integer(form.get("wisMod"));
        int charisma = new Integer(form.get("charisma"));
        int charMod = new Integer(form.get("charMod"));
        int passiveWisdomPerception = new Integer(form.get("passiveWisdomPerception"));


        String personalityTraits = form.get("personalityTraits");
        String ideals = form.get("ideals");
        String bonds = form.get("bonds");
        String flaws = form.get("flaws");

        gameCharacter.setCharacterName(characterName);
        gameCharacter.setCharacterLevel(characterLevel);
        gameCharacter.setCharacterRaceID(characterRaceID);
        gameCharacter.setCharacterClassID(characterClassID);
        gameCharacter.setCharacterBackgroundID(characterBackgroundID);
        gameCharacter.setAlignmentID(alignmentID);

        gameCharacter.setStrength(strength);
        gameCharacter.setStrengthMod(strengthMod);
        gameCharacter.setDexterity(dexterity);
        gameCharacter.setDexMod(dexMod);
        gameCharacter.setConstitution(constitution);
        gameCharacter.setConMod(conMod);
        gameCharacter.setIntelligence(intelligence);
        gameCharacter.setIntelMod(intelMod);
        gameCharacter.setWisdom(wisdom);
        gameCharacter.setWisMod(wisMod);
        gameCharacter.setCharisma(charisma);
        gameCharacter.setCharMod(charMod);
        gameCharacter.setPassiveWisdomPerception(passiveWisdomPerception);


        jpaApi.em().persist(gameCharacter);


        CharacterEquipmentLink characterEquipment = new CharacterEquipmentLink();

        int characterEquipmentID = new Integer(form.get("characterEquipmentLink"));
        characterEquipment.setCharacterEquipmentID(characterEquipmentID);

        jpaApi.em().persist(characterEquipment);


        return redirect(routes.CharacterController.getGameCharacters());
    }
}
