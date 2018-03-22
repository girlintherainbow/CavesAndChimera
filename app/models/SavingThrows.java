package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SavingThrows
{
    @Id
    private int savingThrowID;
    private int strengthSaving;
    private int dexteritySaving;
    private int constitutionSaving;
    private int intelligenceSaving;
    private int wisdomSaving;
    private int charismaSaving;

}
