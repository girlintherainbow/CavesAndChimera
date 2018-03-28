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

   public Equipment ()
   {

   }

   public Equipment(int equipmentID, String equipmentName, String equipmentCost, String equipmentDamage, int equipmentWeight, String equipmentProperties, int equipmentClassID, int equipmentLocationID)
   {
      this.equipmentID = equipmentID;
      this.equipmentName = equipmentName;
      this.equipmentCost = equipmentCost;
      this.equipmentDamage = equipmentDamage;
      this.equipmentWeight = equipmentWeight;
      this.equipmentProperties = equipmentProperties;
      this.equipmentClassID = equipmentClassID;
      this.equipmentLocationID = equipmentLocationID;
   }

   public int getEquipmentID()
   {
      return equipmentID;
   }

   public void setEquipmentID(int equipmentID)
   {
      this.equipmentID = equipmentID;
   }

   public String getEquipmentName()
   {
      return equipmentName;
   }

   public void setEquipmentName(String equipmentName)
   {
      this.equipmentName = equipmentName;
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

   public int getEquipmentClassID()
   {
      return equipmentClassID;
   }

   public void setEquipmentClassID(int equipmentClassID)
   {
      this.equipmentClassID = equipmentClassID;
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
