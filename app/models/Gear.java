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

    public Gear()
    {

    }

    public Gear(int gearID, String gearName, String gearCost, int gearWeight, int gearClassID)
    {
        this.gearID = gearID;
        this.gearName = gearName;
        this.gearCost = gearCost;
        this.gearWeight = gearWeight;
        this.gearClassID = gearClassID;
    }

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
