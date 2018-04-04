package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CharacterDetail
{
    @Id
    private int gameCharacterID;
    private String characterName;
    private String characterLevel;
    private String characterRaceName;
    private String characterClassName;
    private String characterBackgroundName;
    private String alignmentName;

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


    public CharacterDetail(int gameCharacterID, String characterName,String characterLevel,
                       String characterRaceName, String characterClassName,
                           String characterBackgroundName, String alignmentName,
                           int strength, int strengthMod, int dexterity, int dexMod,
                           int constitution, int conMod, int intelligence, int intelMod,
                           int wisdom, int wisMod, int charisma, int charMod, int passiveWisdomPerception)
    {
        this.gameCharacterID = gameCharacterID;
        this.characterName = characterName;
        this.characterLevel = characterLevel;
        this.characterRaceName = characterRaceName;
        this.characterClassName = characterClassName;
        this.characterBackgroundName = characterBackgroundName;
        this.alignmentName = alignmentName;
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

    public void setGameCharacterID(int gameCharacterID)
    {
        this.gameCharacterID = gameCharacterID;
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

    public void setCharacterLevel(String characterLevel)
    {
        this.characterLevel = characterLevel;
    }

    public String getCharacterRaceName()
    {
        return characterRaceName;
    }

    public void setCharacterRaceName(String characterRaceName)
    {
        this.characterRaceName = characterRaceName;
    }

    public String getCharacterClassName()
    {
        return characterClassName;
    }

    public void setCharacterClassName(String characterClassName)
    {
        this.characterClassName = characterClassName;
    }

    public String getCharacterBackgroundName()
    {
        return characterBackgroundName;
    }

    public void setCharacterBackgroundName(String characterBackgroundName)
    {
        this.characterBackgroundName = characterBackgroundName;
    }

    public String getAlignmentName()
    {
        return alignmentName;
    }

    public void setAlignmentName(String alignmentName)
    {
        this.alignmentName = alignmentName;
    }

    public int getStrength()
    {
        return strength;
    }

    public void setStrength(int strength)
    {
        this.strength = strength;
    }

    public int getStrengthMod()
    {
        return strengthMod;
    }

    public void setStrengthMod(int strengthMod)
    {
        this.strengthMod = strengthMod;
    }

    public int getDexterity()
    {
        return dexterity;
    }

    public void setDexterity(int dexterity)
    {
        this.dexterity = dexterity;
    }

    public int getDexMod()
    {
        return dexMod;
    }

    public void setDexMod(int dexMod)
    {
        this.dexMod = dexMod;
    }

    public int getConstitution()
    {
        return constitution;
    }

    public void setConstitution(int constitution)
    {
        this.constitution = constitution;
    }

    public int getConMod()
    {
        return conMod;
    }

    public void setConMod(int conMod)
    {
        this.conMod = conMod;
    }

    public int getIntelligence()
    {
        return intelligence;
    }

    public void setIntelligence(int intelligence)
    {
        this.intelligence = intelligence;
    }

    public int getIntelMod()
    {
        return intelMod;
    }

    public void setIntelMod(int intelMod)
    {
        this.intelMod = intelMod;
    }

    public int getWisdom()
    {
        return wisdom;
    }

    public void setWisdom(int wisdom)
    {
        this.wisdom = wisdom;
    }

    public int getWisMod()
    {
        return wisMod;
    }

    public void setWisMod(int wisMod)
    {
        this.wisMod = wisMod;
    }

    public int getCharisma()
    {
        return charisma;
    }

    public void setCharisma(int charisma)
    {
        this.charisma = charisma;
    }

    public int getCharMod()
    {
        return charMod;
    }

    public void setCharMod(int charMod)
    {
        this.charMod = charMod;
    }

    public int getPassiveWisdomPerception()
    {
        return passiveWisdomPerception;
    }

    public void setPassiveWisdomPerception(int passiveWisdomPerception)
    {
        this.passiveWisdomPerception = passiveWisdomPerception;
    }
}
