package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Gear
{
    @Id
    private int gearID;
    private String gearName;
    private String gearCost;
    private int gearWeight;
    private int gearClassID;

    public int getGearID()
    {
        return gearID;
    }

    public String getGearName()
    {
        return gearName;
    }

    public String getGearCost()
    {
        return gearCost;
    }

    public int getGearWeight()
    {
        return gearWeight;
    }

    public int getGearClassID()
    {
        return gearClassID;
    }
}
