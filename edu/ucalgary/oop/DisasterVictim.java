/**
 * @author      Phoenix Bouma 
 * <a href="mailto:phoenix.bouma@ucalgary.ca">phoenix.bouma@ucalgary.ca</a>
 * @version     1.3
 * @since       1.0
 */

package edu.ucalgary.oop;

import java.util.regex.*;
import java.util.ArrayList;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private final int ASSIGNED_SOCIAL_ID;
    private ArrayList<MedicalRecord> medicalRecords;
    private ArrayList<FamilyRelation> familyConnections;
    private final String ENTRY_DATE;
    private ArrayList<Supply> personalBelongings;
    private String gender;
    private static int counter = 0;
    private static final String REGEX = "\\d{4}-\\d{2}-\\d{2}";
    private static final Pattern datePattern = Pattern.compile(REGEX);

    public DisasterVictim(String firstName, String ENTRY_DATE) throws IllegalArgumentException{
        // Check if the date is in the correct format
        Matcher match = datePattern.matcher(ENTRY_DATE);
        if(match.matches()){
            // Set the date of birth if the date is in the correct format
            // Set the first name
            this.ENTRY_DATE = ENTRY_DATE;
            this.firstName = firstName;
            this.counter += 1;
            this.ASSIGNED_SOCIAL_ID = counter;
            this.personalBelongings = new ArrayList<Supply>(); // Initialize as empty array
            this.familyConnections = new ArrayList<FamilyRelation>(); // Initialize as empty array
            this.medicalRecords = new ArrayList<MedicalRecord>(); // Initialize as empty array
        }
        else{
            // Throw an exception if the date is not in the correct format
            throw new IllegalArgumentException("Invalid date format. Please use YYYY-MM-DD format. Example: 2021-01-01");
        }
    }

    // Getters
    public String getFirstName(){ return this.firstName; }
    public String getLastName(){ return this.lastName; }
    public String getDateOfBirth(){ return this.dateOfBirth; }
    public String getComments(){ return this.comments; }
    public ArrayList<MedicalRecord> getMedicalRecords(){ return this.medicalRecords; }
    public String getEntryDate(){ return this.ENTRY_DATE; }
    public int getAssignedSocialID(){ return this.ASSIGNED_SOCIAL_ID; }
    public ArrayList<Supply> getPersonalBelongings(){ return this.personalBelongings; }
    public ArrayList<FamilyRelation> getFamilyConnections(){ return this.familyConnections; }
    public String getGender(){ return this.gender; }

    // Setters

    public void setFirstName(String firstName){ this.firstName = firstName; }
    public void setLastName(String lastName){ this.lastName = lastName; }
    public void setDateOfBirth(String dateOfBirth) throws IllegalArgumentException{
        // Check if the date is in the correct format
        Matcher match = datePattern.matcher(dateOfBirth);
        if(match.matches()){
            // Set the date of birth if the date is in the correct format
            this.dateOfBirth = dateOfBirth;
        }
        else{
            // Throw an exception if the date is not in the correct format
            throw new IllegalArgumentException("Invalid date format. Please use YYYY-MM-DD format. Example: 2021-01-01");
        }
    }
    public void setComments(String comments){ this.comments = comments; }
    public void setMedicalRecords(ArrayList<MedicalRecord> medicalRecords){ this.medicalRecords = medicalRecords; }
    public void setPersonalBelongings(ArrayList<Supply> personalBelongings){ this.personalBelongings = personalBelongings; }
    public void setFamilyConnections(ArrayList<FamilyRelation> familyConnections){ this.familyConnections = familyConnections; }
    public void setGender(String gender) { this.gender = gender; }

    // Add and Remove
    public void addPersonalBelonging(Supply supply){
        // Add the supply to the personal belongings array
        this.personalBelongings.add(supply);
    }
    public void removePersonalBelonging(Supply supply) {
            // Remove the supply from the personal belongings array
            this.personalBelongings.remove(supply);
    }
    public void addFamilyConnection(FamilyRelation familyRelation){
        // Add the family relation to the family connections array
        this.familyConnections.add(familyRelation);
    }
    public void removeFamilyConnection(FamilyRelation familyRelation){
        // Remove the family relation from the family connections array
        this.familyConnections.remove(familyRelation);
    }
    public void addMedicalRecord(MedicalRecord medicalRecord){
        // Add the medical record to the medical records array
        this.medicalRecords.add(medicalRecord);
    }
}
