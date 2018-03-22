package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CharacterGear
{
    @Id
    private int characterGearID;
    private int gameCharacterID;
    private int gearID;

}
