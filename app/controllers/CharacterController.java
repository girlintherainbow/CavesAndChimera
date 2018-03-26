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
import java.util.List;

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

    @Transactional (readOnly = true)
    public Result getGameCharacters()
    {

        DynamicForm form = formFactory.form().bindFromRequest();


        List<GameCharacter> characters = jpaApi.em().
                createQuery("SELECT gc FROM GameCharacter gc ").getResultList();

        return ok(views.html.activecharacters.render(characters));
    }


    @Transactional (readOnly = true)
    public Result getGameCharacter(int gameCharacterID)
    {

        String sql ="SELECT NEW models.CharacterDetail(gc.gameCharacterID, gc.characterName, gc.characterLevel," +
                                                        " cr.characterRaceName, cc.characterClassName, " +
                                                        "cb.characterBackgroundName, ca.alignmentName, gc.strength," +
                                                        "gc.strengthMod, gc.dexterity, gc.dexMod, gc.constitution," +
                                                        "gc.conMod, gc.intelligence, gc.intelMod, gc.wisdom," +
                                                        "gc.wisMod, gc.charisma, gc.charMod, gc.passiveWisdomPerception) " +
                "FROM CharacterRace cr " +
                "JOIN GameCharacter gc ON cr.characterRaceID = gc.characterRaceID " +
                "JOIN CharacterClass cc ON cc.characterClassID = gc.characterClassID "+
                "JOIN CharacterBackground cb ON cb.characterBackgroundID = gc.characterBackgroundID "+
                "JOIN CharacterAlignment ca ON ca.alignmentID = gc.alignmentID "+
                "WHERE gameCharacterID = :gameCharacterID " ;
      CharacterDetail details = jpaApi.em().
                createQuery(sql, CharacterDetail.class).setParameter("gameCharacterID", gameCharacterID).
               getSingleResult();



      String sqlEquip ="SELECT NEW models.CharacterEquipment(ce.characterEquipmentID, ce.gameCharacterID, " +
              " e.equipmentID, e.equipmentName, e.equipmentCost, " +
              "e.equipmentDamage, e.equipmentWeight, e.equipmentProperties, e.equipmentLocationID) " +
              "From Equipment e JOIN CharacterEquipment ce ON e.equipmentID = ce.equipmentID " +
              "WHERE gameCharacterID = :gameCharacterID " ;

        List<CharacterEquipment> equipment = jpaApi.em().
                createQuery(sqlEquip,CharacterEquipment.class)
                .setParameter("gameCharacterID",gameCharacterID).getResultList();

        String sqlGear = "SELECT NEW models.CharacterGear(cg.characterGearID, cg.gameCharacterID, g.gearID," +
                " g.gearName, g.gearCost, g.gearWeight, g.gearClassID) " +
                " FROM Gear g JOIN CharacterGear cg on g.gearID = cg.gearID " +
                "WHERE gameCharacterID = :gameCharacterID ";


        List<CharacterGear> gear = jpaApi.em().
                createQuery(sqlGear, CharacterGear.class).
                setParameter("gameCharacterID",gameCharacterID).getResultList();

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


        return ok(views.html.character.render(details,equipment,gear,spell,note));
    }

    @Transactional
    public Result postGameCharacter(int gameCharacterID)
    { String sql ="SELECT NEW models.CharacterDetail(gc.gameCharacterID, gc.characterName, gc.characterLevel," +
            " cr.characterRaceName, cc.characterClassName, " +
            "cb.characterBackgroundName, ca.alignmentName, gc.strength," +
            "gc.strengthMod, gc.dexterity, gc.dexMod, gc.constitution," +
            "gc.conMod, gc.intelligence, gc.intelMod, gc.wisdom," +
            "gc.wisMod, gc.charisma, gc.charMod, gc.passiveWisdomPerception) " +
            "FROM CharacterRace cr " +
            "JOIN GameCharacter gc ON cr.characterRaceID = gc.characterRaceID " +
            "JOIN CharacterClass cc ON cc.characterClassID = gc.characterClassID "+
            "JOIN CharacterBackground cb ON cb.characterBackgroundID = gc.characterBackgroundID "+
            "JOIN CharacterAlignment ca ON ca.alignmentID = gc.alignmentID "+
            "WHERE gameCharacterID = :gameCharacterID " ;
        CharacterDetail details = jpaApi.em().
                createQuery(sql, CharacterDetail.class).setParameter("gameCharacterID", gameCharacterID).
                getSingleResult();

        DynamicForm form = formFactory.form().bindFromRequest();
        String characterName = form.get("characterName");

        details.setCharacterName(characterName);
        jpaApi.em().persist(details);

        return redirect(routes.CharacterController.getGameCharacters());
    }
}
