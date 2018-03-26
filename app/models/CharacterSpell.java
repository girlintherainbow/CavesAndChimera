package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CharacterSpell
{
    @Id
    private int characterSpellID;
    private int gameCharacterID;
    private int spellID;

    public int getCharacterSpellID()
    {
        return characterSpellID;
    }

    public void setCharacterSpellID(int characterSpellID)
    {
        this.characterSpellID = characterSpellID;
    }

    public int getGameCharacterID()
    {
        return gameCharacterID;
    }

    public void setGameCharacterID(int gameCharacterID)
    {
        this.gameCharacterID = gameCharacterID;
    }

    public int getSpellID()
    {
        return spellID;
    }

    public void setSpellID(int spellID)
    {
        this.spellID = spellID;
    }
}
