package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EquipmentLocation
{
    @Id
    private int equipmentLocationID;
    private String equipmentLocationName;
}
