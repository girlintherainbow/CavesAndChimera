package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ArmorType
{
    @Id
    private int armorTypeID;
    private String armorTypeName;

    public int getArmorTypeID()
    {
        return armorTypeID;
    }

    public void setArmorTypeID(int armorTypeID)
    {
        this.armorTypeID = armorTypeID;
    }

    public String getArmorTypeName()
    {
        return armorTypeName;
    }


    public void setArmorTypeName(String armorTypeName)
    {
        this.armorTypeName = armorTypeName;
    }
}
