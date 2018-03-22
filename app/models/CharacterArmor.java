package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CharacterArmor
{
    @Id
    private int characterArmorID;
    private int gameCharacterID;
    private int armorID;
}
