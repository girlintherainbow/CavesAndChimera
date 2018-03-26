package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Spells
{
    @Id
    private int spellID;
    private String spellName;
    private int spellLevel;
    private String castingTime;
    private String duration;
    private String range_Area;
    private String attack_Save;
    private String damage_Effect;

    public int getSpellID()
    {
        return spellID;
    }

    public void setSpellID(int spellID)
    {
        this.spellID = spellID;
    }

    public String getSpellName()
    {
        return spellName;
    }

    public void setSpellName(String spellName)
    {
        this.spellName = spellName;
    }

    public int getSpellLevel()
    {
        return spellLevel;
    }

    public void setSpellLevel(int spellLevel)
    {
        this.spellLevel = spellLevel;
    }

    public String getCastingTime()
    {
        return castingTime;
    }

    public void setCastingTime(String castingTime)
    {
        this.castingTime = castingTime;
    }

    public String getDuration()
    {
        return duration;
    }

    public void setDuration(String duration)
    {
        this.duration = duration;
    }

    public String getRange_Area()
    {
        return range_Area;
    }

    public void setRange_Area(String range_Area)
    {
        this.range_Area = range_Area;
    }

    public String getAttack_Save()
    {
        return attack_Save;
    }

    public void setAttack_Save(String attack_Save)
    {
        this.attack_Save = attack_Save;
    }

    public String getDamage_Effect()
    {
        return damage_Effect;
    }

    public void setDamage_Effect(String damage_Effect)
    {
        this.damage_Effect = damage_Effect;
    }
}
