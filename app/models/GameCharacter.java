package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GameCharacter
{
    @Id
    private int gameCharacterID;
    private String characterName;
    private String characterLevel;
    private int characterRaceID;
    private int characterClassID;
    private int characterBackgroundID;
    private int alignmentID;
    private int strength;
    private int strengthMod;
    private int dexterity;
    private int dexMod;
    private int constitution;
    private int conMod;
    private int intelligence;
    private int intelMod;
    private int wisdom;
    private int wisMod;
    private int charisma;
    private int charMod;
    private int passiveWisdomPerception;

    public GameCharacter()
    {

    }

    public GameCharacter(int gameCharacterID, String characterName, String characterLevel,
                         int characterRaceID, int characterClassID, int characterBackgroundID,
                         int alignmentID, int strength, int strengthMod, int dexterity,
                         int dexMod, int constitution, int conMod, int intelligence,
                         int intelMod, int wisdom, int wisMod, int charisma, int charMod,
                         int passiveWisdomPerception)
    {
        this.gameCharacterID = gameCharacterID;
        this.characterName = characterName;
        this.characterLevel = characterLevel;
        this.characterRaceID = characterRaceID;
        this.characterClassID = characterClassID;
        this.characterBackgroundID = characterBackgroundID;
        this.alignmentID = alignmentID;
        this.strength = strength;
        this.strengthMod = strengthMod;
        this.dexterity = dexterity;
        this.dexMod = dexMod;
        this.constitution = constitution;
        this.conMod = conMod;
        this.intelligence = intelligence;
        this.intelMod = intelMod;
        this.wisdom = wisdom;
        this.wisMod = wisMod;
        this.charisma = charisma;
        this.charMod = charMod;
        this.passiveWisdomPerception = passiveWisdomPerception;
    }

    public int getGameCharacterID()
    {
        return gameCharacterID;
    }

    public String getCharacterName()
    {
        return characterName;
    }

    public void setCharacterName(String characterName)
    {
        this.characterName = characterName;
    }

    public String getCharacterLevel()
    {
        return characterLevel;
    }

    public int getCharacterRaceID()
    {
        return characterRaceID;
    }

    public int getCharacterClassID()
    {
        return characterClassID;
    }

    public int getCharacterBackgroundID()
    {
        return characterBackgroundID;
    }

    public int getAlignmentID()
    {
        return alignmentID;
    }

    public int getStrength()
    {
        return strength;
    }

    public int getStrengthMod()
    {
        return strengthMod;
    }

    public int getDexterity()
    {
        return dexterity;
    }

    public int getDexMod()
    {
        return dexMod;
    }

    public int getConstitution()
    {
        return constitution;
    }

    public int getConMod()
    {
        return conMod;
    }

    public int getIntelligence()
    {
        return intelligence;
    }

    public int getIntelMod()
    {
        return intelMod;
    }

    public int getWisdom()
    {
        return wisdom;
    }

    public int getWisMod()
    {
        return wisMod;
    }

    public int getCharisma()
    {
        return charisma;
    }

    public int getCharMod()
    {
        return charMod;
    }

    public int getPassiveWisdomPerception()
    {
        return passiveWisdomPerception;
    }

    public void setGameCharacterID(int gameCharacterID)
    {
        this.gameCharacterID = gameCharacterID;
    }

    public void setCharacterLevel(String characterLevel)
    {
        this.characterLevel = characterLevel;
    }

    public void setCharacterRaceID(int characterRaceID)
    {
        this.characterRaceID = characterRaceID;
    }

    public void setCharacterClassID(int characterClassID)
    {
        this.characterClassID = characterClassID;
    }

    public void setCharacterBackgroundID(int characterBackgroundID)
    {
        this.characterBackgroundID = characterBackgroundID;
    }

    public void setAlignmentID(int alignmentID)
    {
        this.alignmentID = alignmentID;
    }

    public void setStrength(int strength)
    {
        this.strength = strength;
    }

    public void setStrengthMod(int strengthMod)
    {
        this.strengthMod = strengthMod;
    }

    public void setDexterity(int dexterity)
    {
        this.dexterity = dexterity;
    }

    public void setDexMod(int dexMod)
    {
        this.dexMod = dexMod;
    }

    public void setConstitution(int constitution)
    {
        this.constitution = constitution;
    }

    public void setConMod(int conMod)
    {
        this.conMod = conMod;
    }

    public void setIntelligence(int intelligence)
    {
        this.intelligence = intelligence;
    }

    public void setIntelMod(int intelMod)
    {
        this.intelMod = intelMod;
    }

    public void setWisdom(int wisdom)
    {
        this.wisdom = wisdom;
    }

    public void setWisMod(int wisMod)
    {
        this.wisMod = wisMod;
    }

    public void setCharisma(int charisma)
    {
        this.charisma = charisma;
    }

    public void setCharMod(int charMod)
    {
        this.charMod = charMod;
    }

    public void setPassiveWisdomPerception(int passiveWisdomPerception)
    {
        this.passiveWisdomPerception = passiveWisdomPerception;
    }
}
