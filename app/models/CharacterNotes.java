package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CharacterNotes
{
    @Id
    private int characterNoteID;
    private int gameCharacterID;
    private String personalityTraits;
    private String ideals;
    private String bonds;
    private String flaws;

    public CharacterNotes(int characterNoteID, int gameCharacterID, String personalityTraits, String ideals, String bonds, String flaws)
    {
        this.characterNoteID = characterNoteID;
        this.gameCharacterID = gameCharacterID;
        this.personalityTraits = personalityTraits;
        this.ideals = ideals;
        this.bonds = bonds;
        this.flaws = flaws;
    }

    public int getCharacterNoteID()
    {
        return characterNoteID;
    }

    public void setCharacterNoteID(int characterNoteID)
    {
        this.characterNoteID = characterNoteID;
    }

    public int getGameCharacterID()
    {
        return gameCharacterID;
    }

    public void setGameCharacterID(int gameCharacterID)
    {
        this.gameCharacterID = gameCharacterID;
    }

    public String getPersonalityTraits()
    {
        return personalityTraits;
    }

    public void setPersonalityTraits(String personalityTraits)
    {
        this.personalityTraits = personalityTraits;
    }

    public String getIdeals()
    {
        return ideals;
    }

    public void setIdeals(String ideals)
    {
        this.ideals = ideals;
    }

    public String getBonds()
    {
        return bonds;
    }

    public void setBonds(String bonds)
    {
        this.bonds = bonds;
    }

    public String getFlaws()
    {
        return flaws;
    }

    public void setFlaws(String flaws)
    {
        this.flaws = flaws;
    }
}
