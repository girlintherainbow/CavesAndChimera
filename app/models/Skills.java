package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Skills
{
    @Id
    private int skillsID;
    private int acrobatic_Dex;
    private int arcana_Intel;
    private int animalHandling_Wis;
    private int athletics_Intel;
    private int deception_Cha;
    private int history_Intel;
    private int insight_Wis;
    private int intimidation_Cha;
    private int investigation_Intel;
    private int medicine_Wis;
    private int nature_Intel;
    private int perception_Wis;
    private int performance_Cha;
    private int persuasion_Cha;
    private int religion_Intel;
    private int sleightOfHand_Dex;
    private int stealth_Dex;
    private int survival_Wis;

}
