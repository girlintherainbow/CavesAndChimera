package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CharacterEquipment")
public class CharacterEquipmentLink
{
    @Id
    private int characterEquipmentID;
    private int gameCharacterID;
    private int equipmentID;
    private int equipmentLocationID;

    public int getCharacterEquipmentID()
    {
        return characterEquipmentID;
    }

    public void setCharacterEquipmentID(int characterEquipmentID)
    {
        this.characterEquipmentID = characterEquipmentID;
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
}
