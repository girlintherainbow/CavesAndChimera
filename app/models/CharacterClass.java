package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CharacterClass
{
    @Id
    private int characterClassID;
    private String characterClassName;
    private String characterClassStartingGold;
}
