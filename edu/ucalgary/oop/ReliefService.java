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
    private static final String REGEX = "\\d{4}-\\d{2}-\\d{2}";
    private static final Pattern datePattern = Pattern.compile(REGEX);

    //constructor
    public ReliefService(Inquirer Inquirer, DisasterVictim missingPerson, String dateOfInquiry,String infoProvided, 
    Location lastKnownLocation) throws IllegalArgumentException{

        Matcher match = datePattern.matcher(dateOfInquiry);
        if(match.matches()){
            this.Inquirer = Inquirer;
            this.missingPerson = missingPerson;
            this.dateOfInquiry = dateOfInquiry;
            this.infoProvided = infoProvided;
            this.lastKnownLocation = lastKnownLocation;
        }
        else{
            throw new IllegalArgumentException("Invalid Argument Passed");
        }
    }

    //getters
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
        if (this.missingPerson.getLastName() != null){
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

    //setters
    public void setInquierer(Inquirer Inquirer) throws IllegalArgumentException{
        if(Inquirer instanceof Inquirer){
            this.Inquirer = Inquirer;
        }
        else{
            throw new IllegalArgumentException("Invalid Argument Passed");
        }
    }

    public void setMissingPerson(DisasterVictim missingPerson) throws IllegalArgumentException{
        if(missingPerson instanceof DisasterVictim){
            this.missingPerson = missingPerson;
        }
        else{
            throw new IllegalArgumentException("Invalid Argument Passed");
        }
        
    }

    public void setDateOfInquiry(String dateOfInquiry) throws IllegalArgumentException{
        Matcher match = datePattern.matcher(dateOfInquiry);
        if(match.matches() && dateOfInquiry instanceof String){
            this.dateOfInquiry = dateOfInquiry;
        }
        else{
            throw new IllegalArgumentException("Invalid Argument Passed");
        }
    }

    public void setInfoProvided(String infoProvided) throws IllegalArgumentException{
        if(infoProvided instanceof String){
            this.infoProvided = infoProvided;
        }
        else{
            throw new IllegalArgumentException("Invalid Argument Passed");
        }
        
    }

    public void setLastKnownLocation(Location lastKnownLocation) throws IllegalArgumentException{
        if(lastKnownLocation instanceof Location){
            this.lastKnownLocation = lastKnownLocation;
        }
        else{
            throw new IllegalArgumentException("Invalid Argument Passed");
        }
    }

   

}