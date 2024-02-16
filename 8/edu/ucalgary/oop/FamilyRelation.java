/**
 * @author      Younnus Iman
 * <a href="mailto:younnus.iman@ucalgary.ca">younnus.iman@ucalgary.ca</a>
 * @version     1.3
 * @since       1.0
 */

package edu.ucalgary.oop;

public class FamilyRelation {
    private DisasterVictim personOne;
    private DisasterVictim personTwo;
    private String relationshipTo;

    // Constructor
    public FamilyRelation(DisasterVictim personOne, String relationshipTo, DisasterVictim personTwo) {
        this.personOne = personOne;
        this.personTwo = personTwo;
        this.relationshipTo = relationshipTo;
    }

    // Getters
    public DisasterVictim getPersonOne() {
        return personOne;
    }

    public DisasterVictim getPersonTwo() {
        return personTwo;
    }

    public String getRelationshipTo() {
        return relationshipTo;
    }

    // Setters
    public void setPersonOne(DisasterVictim personOne) {
        this.personOne = personOne;
    }

    public void setPersonTwo(DisasterVictim personTwo) {
        this.personTwo = personTwo;
    }

    public void setRelationshipTo(String relationshipTo) {
        this.relationshipTo = relationshipTo;
    }
}
