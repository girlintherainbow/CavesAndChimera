package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EquipmentClass
{
    @Id
    private int equipmentClassID;
    private String equipmentClassName;
}
