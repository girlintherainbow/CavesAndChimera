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

public CharacterDetail(int gameCharacterID, String characterName,String characterLevel,
                       String characterRaceName, String characterClassName, String characterBackgroundName)
    {
        this.gameCharacterID = gameCharacterID;
        this.characterName = characterName;
        this.characterLevel = characterLevel;
        this.characterRaceName = characterRaceName;
        this.characterClassName = characterClassName;
        this.characterBackgroundName = characterBackgroundName;
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
}
