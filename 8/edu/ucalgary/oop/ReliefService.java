/**
 * @author      Alex Whelan
 * <a href="mailto:alex.whelan@ucalgary.ca">alex.whelan@ucalgary.ca</a>
 * @version     1.3
 * @since       1.0
 */

package edu.ucalgary.oop;
import java.util.regex.*;

public class ReliefService {
    private Inquirer Inquirer;
    private DisasterVictim missingPerson;
    private String dateOfInquiry;
    private String infoProvided;
    private Location lastKnownLocation;
    // Regular expression for the date format
    private static final String REGEX = "\\d{4}-\\d{2}-\\d{2}";
    private static final Pattern datePattern = Pattern.compile(REGEX);

    //constructor
    public ReliefService(Inquirer Inquirer, DisasterVictim missingPerson, String dateOfInquiry,String infoProvided, 
    Location lastKnownLocation) throws IllegalArgumentException{

        Matcher match = datePattern.matcher(dateOfInquiry);
        if(match.matches()){
            // If the date is in the correct format continue with the constructor
            this.Inquirer = Inquirer;
            this.missingPerson = missingPerson;
            this.dateOfInquiry = dateOfInquiry;
            this.infoProvided = infoProvided;
            this.lastKnownLocation = lastKnownLocation;
        }
        else{
            // If the date is not in the correct format, throw an exception
            throw new IllegalArgumentException("Invalid date format. Please use YYYY-MM-DD format. Example: 2021-01-01");
        }
    }

    // Getters
    public Inquirer getInquirer(){
        return this.Inquirer;
    }

    public DisasterVictim getMissingPerson(){
        return this.missingPerson;
    }

    public String getDateOfInquiry(){
        return this.dateOfInquiry;
    }

    public String getInfoProvided(){
        return this.infoProvided;
    }  

    public Location getLastKnownLocation(){
        return this.lastKnownLocation;
    }
    public String getLogDetails(){
        String result;
        // If the missing person has a last name, include it in the log details
        if (this.missingPerson.getLastName() != null){
            // If the missing person does not have a last name, do not include it in the log details
            result = String.format("Inquirer: %s, Missing Person: %s %s, Date of Inquiry: %s, Info Provided: %s, Last Known Location: %s", this.Inquirer.getFirstName(),
            this.missingPerson.getFirstName(), this.missingPerson.getLastName(), this.getDateOfInquiry(),
            this.getInfoProvided(), this.getLastKnownLocation().getName());
        }
        else{
            result = String.format("Inquirer: %s, Missing Person: %s, Date of Inquiry: %s, Info Provided: %s, Last Known Location: %s", this.Inquirer.getFirstName(),
                this.missingPerson.getFirstName(), this.getDateOfInquiry(),
                this.getInfoProvided(), this.getLastKnownLocation().getName());
        }
        return result;
    }

    // Setters
    public void setInquirer(Inquirer inquirer) {
        this.Inquirer = inquirer;
    }
    
    public void setMissingPerson(DisasterVictim missingPerson) {
        this.missingPerson = missingPerson;
    }
    
    public void setDateOfInquiry(String dateOfInquiry) throws IllegalArgumentException {
        Matcher match = datePattern.matcher(dateOfInquiry);
        if(match.matches()){
            this.dateOfInquiry = dateOfInquiry;
        }
        else{
            // If the date is not in the correct format, throw an exception
            throw new IllegalArgumentException("Invalid date format. Please use YYYY-MM-DD format. Example: 2021-01-01");
        }
    }
    
    public void setInfoProvided(String infoProvided) {
        this.infoProvided = infoProvided;
    }
    
    public void setLastKnownLocation(Location lastKnownLocation) {
        this.lastKnownLocation = lastKnownLocation;
    }

   

}