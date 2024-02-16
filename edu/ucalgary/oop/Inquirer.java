/**
 * @author      Alex Whelan
 * <a href="mailto:alex.whelan@ucalgary.ca">alex.whelan@ucalgary.ca</a>
 * @version     1.3
 * @since       1.0
 */


package edu.ucalgary.oop;

public class Inquirer {
    private final String FIRST_NAME;
    private final String LAST_NAME;
    private final String INFO;
    private final String SERVICES_PHONE;


    public Inquirer(String FIRST_NAME, String LAST_NAME, String INFO, String SERVICES_PHONE){
            this.FIRST_NAME = FIRST_NAME;
            this.LAST_NAME = LAST_NAME;
            this.INFO = INFO;
            this.SERVICES_PHONE = SERVICES_PHONE;
    }

    public String getFirstName() {
        return FIRST_NAME;
    }

    public String getLastName() {
        return LAST_NAME;
    }

    public String getInfo() {
        return INFO;
    }

    public String getServicesPhone() {
        return SERVICES_PHONE;
    }

}
