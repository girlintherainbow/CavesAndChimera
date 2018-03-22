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
    private int equipmentLocationID;
}
