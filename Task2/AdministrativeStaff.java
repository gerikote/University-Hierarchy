package homework.Task2;

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
}

