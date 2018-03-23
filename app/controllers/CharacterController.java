package controllers;

import models.CharacterDetail;
import models.CharacterRace;
import models.GameCharacter;
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



        return ok(views.html.character.render(details));
    }
/*
    @Transactional
    public Result postGameCharacter()
    {
        GameCharacter gameCharacter = jpaApi.em().
                createQuery("SELECT gc FROM GameCharacter gc WHERE", GameCharacter.class).
                getSingleResult();

        DynamicForm form = formFactory.form().bindFromRequest();
         int gameCharacterID = new Integer(form.get("gameCharacterID"));
         String characterName;
         String characterLevel;
         int characterRaceID;
         int characterClassId;
         int characterBackgroundID;
         int alignmentID;
         int strength;
         int strengthMod;
         int dexterity;
         int dexMod;
         int constitution;
         int conMod;
         int intelligence;
         int intelMod;
         int wisdom;
         int wisMod;
         int charisma;
         int charMod;
         int passiveWisdomPerception;

         gameCharacter.setGameCharacterID(gameCharacterID);

         return redirect(routes.CharacterController.getGameCharacters());
    }

   @Transactional
    public Result postGameCharacter(int gameCharacterID)
    {
        GameCharacter gameCharacter =jpaApi.em().
                createQuery("Select gc From GameCharacter gc where gameCharacterID = :gameCharacterID").
                setParameter("gameCharacterID", gameCharacterID).getSingleResult();

        DynamicForm form = formFactory.form().bindFromRequest();
        String characterName = form.get("characterName");

        gameCharacter.setCharacterName(characterName);

    }
*/

}
