package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CharacterEquipment
{
    @Id
    private int characterEquipmentID;
    private int gameCharacterID;
    private int equipmentID;
    private String equipmentName;
    private String equipmentCost;
    private String equipmentDamage;
    private int equipmentWeight;
    private String equipmentProperties;
    private int equipmentLocationID;

    public CharacterEquipment(int characterEquipmentID, int gameCharacterID,
                              int equipmentID, String equipmentName, String equipmentCost,
                              String equipmentDamage, int equipmentWeight, String equipmentProperties,
                              int equipmentLocationID)
    {
        this.characterEquipmentID = characterEquipmentID;
       this.gameCharacterID = gameCharacterID;
        this.equipmentID = equipmentID;
        this.equipmentName = equipmentName;
        this.equipmentCost = equipmentCost;
        this.equipmentDamage = equipmentDamage;
        this.equipmentWeight = equipmentWeight;
        this.equipmentProperties = equipmentProperties;
        this.equipmentLocationID = equipmentLocationID;
    }

    public int getCharacterEquipmentID()
    {
        return characterEquipmentID;
    }

    public void setCharacterEquipmentID(int characterEquipmentID)
    {
        this.characterEquipmentID = characterEquipmentID;
    }

    public String getEquipmentName()
    {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName)
    {
        this.equipmentName = equipmentName;
    }

    public int getGameCharacterID()
    {
        return gameCharacterID;
    }

    public void setGameCharacterID(int gameCharacterID)
    {
        this.gameCharacterID = gameCharacterID;
    }

    public int getEquipmentID()
    {
        return equipmentID;
    }

    public void setEquipmentID(int equipmentID)
    {
        this.equipmentID = equipmentID;
    }

    public int getEquipmentLocationID()
    {
        return equipmentLocationID;
    }

    public void setEquipmentLocationID(int equipmentLocationID)
    {
        this.equipmentLocationID = equipmentLocationID;
    }

    public String getEquipmentCost()
    {
        return equipmentCost;
    }

    public void setEquipmentCost(String equipmentCost)
    {
        this.equipmentCost = equipmentCost;
    }

    public String getEquipmentDamage()
    {
        return equipmentDamage;
    }

    public void setEquipmentDamage(String equipmentDamage)
    {
        this.equipmentDamage = equipmentDamage;
    }

    public int getEquipmentWeight()
    {
        return equipmentWeight;
    }

    public void setEquipmentWeight(int equipmentWeight)
    {
        this.equipmentWeight = equipmentWeight;
    }

    public String getEquipmentProperties()
    {
        return equipmentProperties;
    }

    public void setEquipmentProperties(String equipmentProperties)
    {
        this.equipmentProperties = equipmentProperties;
    }
}
