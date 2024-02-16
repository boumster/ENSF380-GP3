/**
 * @author      Victor Gouttin
 * <a href="mailto:victor.gouttin@ucalgary.ca">victor.gouttin@ucalgary.ca</a>
 * @version     1.1
 * @since       1.0
 */

package edu.ucalgary.oop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MedicalRecord {
    private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;
    private static final String REGEX = "\\d{4}-\\d{2}-\\d{2}";
    private static final Pattern datePattern = Pattern.compile(REGEX);

    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) throws IllegalArgumentException {
        Matcher match = datePattern.matcher(dateOfTreatment);
        if(match.matches()){
            this.dateOfTreatment = dateOfTreatment;
            this.location = location;
            this.treatmentDetails = treatmentDetails;
        }
        
        else {
            throw new IllegalArgumentException("This format is wrong, please use YYYY-MM-DD format.");
        }

    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getTreatmentDetails() {
        return this.treatmentDetails;
    }

    public void setTreatmentDetails(String treatmentDetails) {
        this.treatmentDetails = treatmentDetails;
    }

    public String getDateOfTreatment() {
        return this.dateOfTreatment;
    }

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
