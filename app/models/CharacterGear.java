package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CharacterGear
{
    @Id
    private int characterGearID;
    private int gameCharacterID;
    private int gearID;
    private String gearName;
    private String gearCost;
    private int gearWeight;
    private int gearClassID;

    public CharacterGear(int characterGearID, int gameCharacterID,
                         int gearID, String gearName, String gearCost,
                         int gearWeight, int gearClassID)
    {
        this.characterGearID = characterGearID;
        this.gameCharacterID = gameCharacterID;
        this.gearID = gearID;
        this.gearName = gearName;
        this.gearCost = gearCost;
        this.gearWeight = gearWeight;
        this.gearClassID = gearClassID;
    }

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

    public String getGearName()
    {
        return gearName;
    }

    public void setGearName(String gearName)
    {
        this.gearName = gearName;
    }

    public String getGearCost()
    {
        return gearCost;
    }

    public void setGearCost(String gearCost)
    {
        this.gearCost = gearCost;
    }

    public int getGearWeight()
    {
        return gearWeight;
    }

    public void setGearWeight(int gearWeight)
    {
        this.gearWeight = gearWeight;
    }

    public int getGearClassID()
    {
        return gearClassID;
    }

    public void setGearClassID(int gearClassID)
    {
        this.gearClassID = gearClassID;
    }
}
