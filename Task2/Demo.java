package homework.Task2;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        //Creating Graduate Students
        GraduateStudents graduate1 = new GraduateStudents("2025", "John", "Brown", "johnbrown@gmail.com", "Biology", "DNA structure analysis");
        GraduateStudents graduate2 = new GraduateStudents("2628", "Maria", "Foss", "mfos@gmail.com", "Math", "Complex number analysis");
        GraduateStudents graduate3 = new GraduateStudents("2654", "Ryan", "Creed", "rcreed@gmail.com", "Engineer", "Structural mechanics");

        //Creating Undergraduate Students
        UndergraduateStudents undergraduate1 = new UndergraduateStudents("5647", "Diego", "Gonazalez", "dgonzalez@gmail.com", "Business", 1);
        UndergraduateStudents undergraduate2 = new UndergraduateStudents("2569", "Ivan", "Gonazalez", "Igonzalez@gmail.com", "Medical", 2);
        UndergraduateStudents undergraduate3 = new UndergraduateStudents("1238", "Chris", "White", "cwhite@gmail.com", "Physics", 4);

        //Creating an ArrayList of students to enter as an input at University
        ArrayList<Students> studentsList = new ArrayList<>();
        studentsList.add(graduate1);
        studentsList.add(graduate2);
        studentsList.add(graduate3);
        studentsList.add(undergraduate1);
        studentsList.add(undergraduate2);
        studentsList.add(undergraduate3);

        //Creating courses and prerequisites
        Course biology101 = new Course("101", "Biology101", null, 25);
        Course math101 = new Course("101", "Math101", null, 25);

        String[] biology102prerequisites = {"biology101"};
        Course biology102 = new Course("102", "Biology102", biology102prerequisites, 25);

        String[] math102prerequisites = {"biology101"};
        Course math102 = new Course("102", "Math102", biology102prerequisites, 25);

        //Courses arrays
        Course[] bio = {biology101, biology102};
        Course[] mathematics = {math101, math102};

        //Creating Academic Staff
        AcademicStaff professor1 = new AcademicStaff("1", "Clayton", "Tumblerson", "ctamp@gmail.com", bio);
        AcademicStaff professor2 = new AcademicStaff("2", "Tom", "Mullins", "tmullins@gmail.com", null);
        AcademicStaff professor3 = new AcademicStaff("3", "Andrew", "Richards", "arichards@gmail.com", null);

        //Creating responsibilities for Administrative staff
        String[] libraryAssist = {"Librarian duties", "Library organisation", "Reference services", "Instruction and training"};
        String[] labAssist = {"Preparing equipment and materials", "Conducting experiments and tests", "Data collection and analysis"};

        //Creating administrative Staff
        AdministrativeStaff adminStaff1 = new AdministrativeStaff("10", "Tara", "Flowers", "tflowers@gmail.com", libraryAssist);
        AdministrativeStaff adminStaff2 = new AdministrativeStaff("11", "Jack", "Ford", "jford@gmail.com", null);
        AdministrativeStaff adminStaff3 = new AdministrativeStaff("12", "John", "Wig", "jwigg@gmail.com", null);
        AdministrativeStaff labAs1 = new AdministrativeStaff("13", "Carl", "Wig", "carl@gmail.com", labAssist);
        AdministrativeStaff labAs2 = new AdministrativeStaff("14", "Nick", "Wig", "nickw@gmail.com", labAssist);

        //Creating an arrayList for staff to enter as an input at University object
        ArrayList<Staff> staffList = new ArrayList<>();
        staffList.add(professor1);
        staffList.add(professor2);
        staffList.add(professor3);
        staffList.add(adminStaff1);
        staffList.add(adminStaff2);
        staffList.add(adminStaff3);
        staffList.add(labAs1);
        staffList.add(labAs2);

        //Creating lectures
        Lecture math = new Lecture("101", "Math", null, 30, professor1);
        Lecture biology = new Lecture("105", "Biology", null, 30, professor2);
        Lecture physics = new Lecture("106", "Physics", null, 30, professor3);

        //Creating labs
        Lab lab1 = new Lab("101", "Physics", null, 10, labAs1);
        Lab lab2 = new Lab("102", "Biology", null, 10, labAs2);

        //Creating an ArrayList to enter as an input at University
        ArrayList<Course> courseList = new ArrayList<>();
        courseList.add(math);
        courseList.add(biology);
        courseList.add(physics);
        courseList.add(lab1);
        courseList.add(lab2);
        courseList.add(biology101);
        courseList.add(biology102);

        //Creating an object of University class
        University NTUA = new University("National Technical University of Athens", "Athens,Zografu", studentsList, staffList, courseList);

        //Print the University Details
        NTUA.getDetails();

        //Graduate 1 introducing himself
        graduate1.introduceMyself();

        //Undergraduate 1 introducing himself
        undergraduate1.introduceMyself();

        //Professor 1 introducing himself
        professor1.introduceMyself();

        //Lab Assistant introducing himself
        labAs1.introduceMyself();

        //Administrative Staff introducing himself
        adminStaff1.introduceMyself();

        //Creating a Grades object
        Grades grades = new Grades();

        //Enrolling undergraduate1 in math and biology classes
        math.enrollStudent(undergraduate1);
        biology.enrollStudent(undergraduate1);

        //Check the student's grades
        System.out.println(undergraduate1.getGrades());

        //Make the student study hard
        undergraduate1.studyHard();
        undergraduate1.study(math);

        //Calculate GPA
        System.out.println(grades.calculateGPA(undergraduate1));
        System.out.println();

        //Student gives an exam
        undergraduate1.giveExam(math);
    }
}
