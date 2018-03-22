package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GearClass
{
    @Id
    private int gearClassID;
    private String gearClassName;


}
