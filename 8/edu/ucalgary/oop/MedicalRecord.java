/**
 * @author      Victor Gouttin
 * <a href="mailto:victor.gouttin@ucalgary.ca">victor.gouttin@ucalgary.ca</a>
 * @version     1.2
 * @since       1.0
 */

package edu.ucalgary.oop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MedicalRecord {
    private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;
    // Regular expression for the date format
    private static final String REGEX = "\\d{4}-\\d{2}-\\d{2}";
    private static final Pattern datePattern = Pattern.compile(REGEX);

    // Constructor
    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) throws IllegalArgumentException {
        Matcher match = datePattern.matcher(dateOfTreatment);
        // Check if the date is in the correct format
        if(match.matches()){
            this.dateOfTreatment = dateOfTreatment;
            this.location = location;
            this.treatmentDetails = treatmentDetails;
        }
        
        else {
            // Throw an exception if the date is not in the correct format
            throw new IllegalArgumentException("Invalid date format. Please use YYYY-MM-DD format. Example: 2021-01-01");
        }

    }

    // Getters
    public Location getLocation() { return this.location; }
    public String getTreatmentDetails() { return this.treatmentDetails; }
    public String getDateOfTreatment() { return this.dateOfTreatment; }

    // Setters
    public void setLocation(Location location) { this.location = location; }
    public void setTreatmentDetails(String treatmentDetails) { this.treatmentDetails = treatmentDetails; }
    public void setDateOfTreatment(String dateOfTreatment) throws IllegalArgumentException{
        Matcher match = datePattern.matcher(dateOfTreatment);
        if(match.matches()){
            this.dateOfTreatment = dateOfTreatment;
        }
        else {
            throw new IllegalArgumentException("This format is wrong, please use YYYY-MM-DD format.");
        }
    }
}
