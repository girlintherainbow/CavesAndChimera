package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Armor
{
    @Id
    private int armorID;
    private int armorTypeID;
    private String armorName;
    private String armorCost;
    private String acArmorClass;
    private String armorStrength;
    private int armorWeight;

    public int getArmorID()
    {
        return armorID;
    }

    public int getArmorTypeID()
    {
        return armorTypeID;
    }

    public String getArmorName()
    {
        return armorName;
    }

    public String getArmorCost()
    {
        return armorCost;
    }

    public String getAcArmorClass()
    {
        return acArmorClass;
    }

    public String getArmorStrength()
    {
        return armorStrength;
    }

    public int getArmorWeight()
    {
        return armorWeight;
    }
}
