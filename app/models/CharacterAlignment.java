package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CharacterAlignment
{
    @Id
    private int alignmentID;
    private String alignmentName;

    public CharacterAlignment()
    {

    }
    public CharacterAlignment(int alignmentID, String alignmentName)
    {
        this.alignmentID = alignmentID;
        this.alignmentName = alignmentName;
    }

    public int getAlignmentID()
    {
        return alignmentID;
    }

    public void setAlignmentID(int alignmentID)
    {
        this.alignmentID = alignmentID;
    }

    public String getAlignmentName()
    {
        return alignmentName;
    }

    public void setAlignmentName(String alignmentName)
    {
        this.alignmentName = alignmentName;
    }
}
