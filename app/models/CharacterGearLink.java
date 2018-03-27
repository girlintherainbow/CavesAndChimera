package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CharacterGear")
public class CharacterGearLink
{
    @Id
    private int characterGearID;
    private int gameCharacterID;
    private int gearID;

    public int getCharacterGearID()
    {
        return characterGearID;
    }

    public void setCharacterGearID(int characterGearID)
    {
        this.characterGearID = characterGearID;
    }

    public int getGameCharacterID()
    {
        return gameCharacterID;
    }

    public void setGameCharacterID(int gameCharacterID)
    {
        this.gameCharacterID = gameCharacterID;
    }

    public int getGearID()
    {
        return gearID;
    }

    public void setGearID(int gearID)
    {
        this.gearID = gearID;
    }
}
