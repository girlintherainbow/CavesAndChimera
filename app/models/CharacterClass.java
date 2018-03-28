package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CharacterClass
{
    @Id
    private int characterClassID;
    private String characterClassName;
    private String characterClassStartingGold;

    public CharacterClass()
    {
    }

    public CharacterClass(int characterClassID, String characterClassName, String characterClassStartingGold)
    {
        this.characterClassID = characterClassID;
        this.characterClassName = characterClassName;
        this.characterClassStartingGold = characterClassStartingGold;
    }

    public int getCharacterClassID()
    {
        return characterClassID;
    }

    public void setCharacterClassID(int characterClassID)
    {
        this.characterClassID = characterClassID;
    }

    public String getCharacterClassName()
    {
        return characterClassName;
    }

    public void setCharacterClassName(String characterClassName)
    {
        this.characterClassName = characterClassName;
    }

    public String getCharacterClassStartingGold()
    {
        return characterClassStartingGold;
    }

    public void setCharacterClassStartingGold(String characterClassStartingGold)
    {
        this.characterClassStartingGold = characterClassStartingGold;
    }
}
