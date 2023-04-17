package homework.Task2;

import java.util.Arrays;

public class AdministrativeStaff extends Staff {
    private String[] responsibilities;

    public AdministrativeStaff(String staffID, String firstName, String lastName, String email, String[] responsibilities) {
        super(staffID, firstName, lastName, email);
        this.responsibilities = responsibilities;
    }

    public String[] getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String[] responsibilities) {
        this.responsibilities = responsibilities;
    }

    public void introduceMyself() {
        System.out.println("Hello. My name is " + firstName + " and i am part of the administrative staff. " + "\n"
                + "My responsibilities are " + Arrays.toString(responsibilities) + "\n");
    }
}

