package homework.Task2;


public abstract class Staff extends Person {
    private static int counter = 0;

    private String staffID;


    public Staff( String firstName, String lastName, String email) {
        super(firstName, lastName, email);
        this.staffID = generateStaffID();
    }

    private final String generateStaffID() {
        counter++;
        String id = String.format("%05d", counter);
        return id;
    }

    public String getStaffID() {
        return staffID;
    }

    public abstract void introduceMyself();

}
