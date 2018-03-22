package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CharacterRace
{
    @Id
    private int characterRaceID;
    private String characterRaceName;

    public int getCharacterRaceID()
    {
        return characterRaceID;
    }

    public void setCharacterRaceID(int characterRaceID)
    {
        this.characterRaceID = characterRaceID;
    }

    public String getCharacterRaceName()
    {
        return characterRaceName;
    }

    public void setCharacterRaceName(String characterRaceName)
    {
        this.characterRaceName = characterRaceName;
    }
}

