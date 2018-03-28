package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CharacterBackground
{
    @Id
    private int characterBackgroundID;
    private String characterBackgroundName;
    private String backgroundProficiencies;

    public CharacterBackground()
    {

    }

    public CharacterBackground(int characterBackgroundID, String characterBackgroundName, String backgroundProficiencies)
    {
        this.characterBackgroundID = characterBackgroundID;
        this.characterBackgroundName = characterBackgroundName;
        this.backgroundProficiencies = backgroundProficiencies;
    }

    public int getCharacterBackgroundID()
    {
        return characterBackgroundID;
    }

    public void setCharacterBackgroundID(int characterBackgroundID)
    {
        this.characterBackgroundID = characterBackgroundID;
    }

    public String getCharacterBackgroundName()
    {
        return characterBackgroundName;
    }

    public void setCharacterBackgroundName(String characterBackgroundName)
    {
        this.characterBackgroundName = characterBackgroundName;
    }

    public String getBackgroundProficiencies()
    {
        return backgroundProficiencies;
    }

    public void setBackgroundProficiencies(String backgroundProficiencies)
    {
        this.backgroundProficiencies = backgroundProficiencies;
    }
}
