package edu.ucalgary.oop;

import java.util.regex.*;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private int ASSIGNED_SOCIAL_ID;
    private MedicalRecord [] medicalRecords;
    private FamilyRelation [] familyConnections;
    private String ENTRY_DATE;
    private Supply [] personalBelongings;
    private String gender;
    private int counter;
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
        }
        else{
            // Throw an exception if the date is not in the correct format
            throw new IllegalArgumentException("Invalid date format. Please use YYYY-MM-DD format. Example: 2021-01-01");
        }
    }

    public String getFirstName(){ return this.firstName; }
    public String getLastName(){ return this.lastName; }
    public String getDateOfBirth(){ return this.dateOfBirth; }
    public String getComments(){ return this.comments; }
    public MedicalRecord[] getMedicalRecords(){ return this.medicalRecords; }
    public String getENTRY_DATE(){ return this.ENTRY_DATE; }
    public int getAssignedSocialID(){ return this.ASSIGNED_SOCIAL_ID; }
    public Supply[] getPersonalBelongings(){ return this.personalBelongings; }
    public FamilyRelation[] getFamilyConnections(){ return this.familyConnections; }
    public String getGender(){ return this.gender; }
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
    public void setMedicalRecords(MedicalRecord[] medicalRecords){ this.medicalRecords = medicalRecords; }
    public void setPersonalBelongings(Supply[] personalBelongings){ this.personalBelongings = personalBelongings; }
    public void setFamilyConnections(FamilyRelation[] familyConnections){ this.familyConnections = familyConnections; }
    public void setGender(String gender) { this.gender = gender; }
    public void addPersonalBelonging(Supply supply){
        // Add the supply to the personal belongings array
        // Create a new array of size + 1
        Supply[] setter = new Supply[this.personalBelongings.length + 1];
        // Copy the old array to the new array
        System.arraycopy(this.personalBelongings, 0, setter, 0, this.personalBelongings.length);
        // Add the new supply to the new array
        setter[this.personalBelongings.length] = supply;
    }
    public void removePersonalBelonging(Supply supply) {
            // Remove the supply from the personal belongings array
            // Create a new array of size - 1
            Supply[] setter = new Supply[this.personalBelongings.length - 1];
            // Index of new array
            int j = 0;
            boolean found = false;
            for (int i = 0; i < this.personalBelongings.length; i++) {
                if (this.personalBelongings[i] != supply) {
                    if (j == setter.length) {
                        break;
                    }
                    setter[j] = this.personalBelongings[i];
                    j++;
                } else {
                    found = true;
            }

            if (found) {
                // Set the new array to the personal belongings array if the supply is found
                this.personalBelongings = setter;
            } else {
                System.out.println("Supply not found");
            }
        }
    }
    public void addFamilyConnection(FamilyRelation familyRelation){
        // Add the family relation to the family connections array
        // Create a new array of size + 1
        FamilyRelation[] setter = new FamilyRelation[this.familyConnections.length + 1];
        // Copy the old array to the new array
        System.arraycopy(this.familyConnections, 0, setter, 0, this.familyConnections.length);
        // Add the new family relation to the new array
        setter[this.familyConnections.length] = familyRelation;
    }
    public void removeFamilyConnection(FamilyRelation familyRelation){
        // Remove the family relation from the family connections array
        // Create a new array of size - 1
        FamilyRelation[] setter = new FamilyRelation[this.familyConnections.length - 1];
        // Index of new array
        int j = 0;
        boolean found = false;
        for (int i = 0; i < this.familyConnections.length; i++) {
            if (this.familyConnections[i] != familyRelation) {
                if (j == setter.length) {
                    break;
                }
                setter[j] = this.familyConnections[i];
                j++;
            } else {
                found = true;
            }
        }
        if (found) {
            // Set the new array to the family connections array if the family relation is found
            this.familyConnections = setter;
        } else {
            System.out.println("Family relation not found");
        }
    }
    public void addMedicalRecord(MedicalRecord medicalRecord){
        // Add the medical record to the medical records array
        // Create a new array of size + 1
        MedicalRecord[] setter = new MedicalRecord[this.medicalRecords.length + 1];
        // Copy the old array to the new array
        System.arraycopy(this.medicalRecords, 0, setter, 0, this.medicalRecords.length);
        // Add the new medical record to the new array
        setter[this.medicalRecords.length] = medicalRecord;
    }
}
