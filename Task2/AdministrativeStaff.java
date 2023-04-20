package homework.Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class AdministrativeStaff extends Staff {
    private ArrayList<String> responsibilities;

    public AdministrativeStaff(String staffID, String firstName, String lastName, String email) {
        super(staffID, firstName, lastName, email);
        this.responsibilities = new ArrayList<>();
    }

    public ArrayList<String> getResponsibilities() {
        return responsibilities;
    }

    public void addResponisbility(String responsibility){
        this.responsibilities.add(responsibility);
    }

    @Override
    public void introduceMyself() {
        System.out.println("Hello. My name is " + firstName + " and i am part of the administrative staff. " + "\n"
                + "My responsibilities are " + responsibilities.toString() + "\n");
    }
}

