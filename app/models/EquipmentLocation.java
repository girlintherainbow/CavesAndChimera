package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EquipmentLocation
{
    @Id
    private int equipmentLocationID;
    private String equipmentLocationName;

    public int getEquipmentLocationID()
    {
        return equipmentLocationID;
    }

    public void setEquipmentLocationID(int equipmentLocationID)
    {
        this.equipmentLocationID = equipmentLocationID;
    }

    public String getEquipmentLocationName()
    {
        return equipmentLocationName;
    }

    public void setEquipmentLocationName(String equipmentLocationName)
    {
        this.equipmentLocationName = equipmentLocationName;
    }
}
