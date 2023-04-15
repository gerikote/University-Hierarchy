package homework.Task2;


public class Students extends Person {
    private String studentID;

    private String major;

    public Students(String studentID, String firstName, String lastName, String email, String major) {
        super(firstName, lastName, email);
        this.studentID = studentID;
        this.major = major;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }


}

