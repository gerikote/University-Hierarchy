package homework.Task2;


public class Staff extends Person {
    private String staffID;


    public Staff(String staffID, String firstName, String lastName, String email) {
        super(firstName, lastName, email);
        this.staffID = staffID;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

}
