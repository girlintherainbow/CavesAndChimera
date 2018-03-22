package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Equipment
{
   @Id
    private int equipmentID;
   private String equipmentName;
   private String equipmentCost;
   private String equipmentDamage;
   private int equipmentWeight;
   private String equipmentProperties;
   private int equipmentClassID;
   private int equipmentLocationID;
}
