package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CharacterBackground
{
    @Id
    private int characterBackgroundID;
    private String characterBackgroundName;
    private String backgroundProficiencies;
}
