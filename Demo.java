package homework.Task2;

import homework.Task2.courses.Course;
import homework.Task2.courses.Lab;
import homework.Task2.courses.Lecture;
import homework.Task2.exceptions.InvalidAgeException;
import homework.Task2.exceptions.InvalidEmailException;
import homework.Task2.exceptions.InvalidNameFormatException;
import homework.Task2.exceptions.MaxStudentsReachedException;
import homework.Task2.people.AcademicStaff;
import homework.Task2.people.AdministrativeStaff;
import homework.Task2.people.GraduateStudent;
import homework.Task2.people.UndergraduateStudent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {
    private static final Logger logger = LogManager.getLogger(Demo.class.getName());

    public static void main(String[] args) {
        //Creating an object of University class
        University university = new University("National Technical University of Athens", "Athens,Zografu");

        //Declare student variables outside of try block
        GraduateStudent graduate1 = null;
        GraduateStudent graduate2 = null;
        GraduateStudent graduate3 = null;
        UndergraduateStudent undergraduate1 = null;
        UndergraduateStudent undergraduate2 = null;
        UndergraduateStudent undergraduate3 = null;

        try {
            //Creating Graduate Students
            graduate1 = new GraduateStudent("John", "Brown", "johnbrown@gmail.com", "Biology", "DNA structure analysis", 22);
            graduate2 = new GraduateStudent("Maria", "Foss", "mfos@gmail.com", "Math", "Complex number analysis", 18);
            graduate3 = new GraduateStudent("Ryan", "Creed", "rcreed@gmail.com", "Engineer", "Structural mechanics", 45);

            //Creating Undergraduate Students
            undergraduate1 = new UndergraduateStudent("Diego", "Gonazalez", "dgonzalez@gmail.com", "Business", 1, 23);
            undergraduate2 = new UndergraduateStudent("Ivan", "Gonazalez", "Igonzalez@gmail.com", "Medical", 2, 20);
            undergraduate3 = new UndergraduateStudent("Chris", "White", "cwhite@gmail.com", "Physics", 4, 21);
        } catch (InvalidAgeException | InvalidNameFormatException | InvalidEmailException ex) {
            System.out.println(ex.getMessage());
        }
        //Adding students to University
        university.addStudent(graduate1);
        university.addStudent(graduate2);
        university.addStudent(graduate3);
        university.addStudent(undergraduate1);
        university.addStudent(undergraduate2);
        university.addStudent(undergraduate3);

        //Declare staff variables outside of try block
        AcademicStaff professor1 = null;
        AcademicStaff professor2 = null;
        AcademicStaff professor3 = null;

        AdministrativeStaff adminStaff1 = null;
        AdministrativeStaff adminStaff2 = null;
        AdministrativeStaff adminStaff3 = null;
        AdministrativeStaff labAs1 = null;
        AdministrativeStaff labAs2 = null;

        try {
            //Creating Academic Staff
            professor1 = new AcademicStaff("Clayton", "Tumblerson", "ctamp@gmail.com", 23);
            professor2 = new AcademicStaff("Tom", "Mullins", "tmullins@gmail.com", 23);
            professor3 = new AcademicStaff("Andrew", "Richards", "arichards@gmail.com", 19);

            //Creating administrative Staff
            adminStaff1 = new AdministrativeStaff("Tara", "Flowers", "tflowers@gmail.com", 54);
            adminStaff2 = new AdministrativeStaff("Jack", "Ford", "jford@gmail.com", 65);
            adminStaff3 = new AdministrativeStaff("John", "Wig", "jwigg@gmail.com", 76);
            labAs1 = new AdministrativeStaff("Carl", "Wig", "carl@gmail.com", 29);
            labAs2 = new AdministrativeStaff("Nick", "Wig", "nickw@gmail.com", 35);
        } catch (InvalidAgeException | InvalidNameFormatException | InvalidEmailException ex) {
            System.out.println(ex.getMessage());
        }

        //Adding responsibilities for admin staff
        adminStaff1.addResponsisbility("library organisation");
        labAs1.addResponsisbility("Prepare lab equipment");

        //Adding staff to University
        university.addStaff(professor1);
        university.addStaff(professor2);
        university.addStaff(professor3);
        university.addStaff(adminStaff1);
        university.addStaff(adminStaff2);
        university.addStaff(adminStaff3);
        university.addStaff(labAs1);
        university.addStaff(labAs2);

        //Creating lectures
        Lecture math = new Lecture("101", "Math", professor1);
        Lecture biology = new Lecture("105", "Biology", professor2);
        Lecture physics = new Lecture("106", "Physics", professor3);

        //Creating labs
        Lab physicsLab = new Lab("101", "Physics", labAs1);
        Lab biologyLab = new Lab("102", "Biology", labAs2);

        //Enrolling students in classes
        try {
            math.enrollStudent(undergraduate1);
            math.enrollStudent(undergraduate2);
            math.enrollStudent(undergraduate3);
            biology.enrollStudent(undergraduate1);
            biology.enrollStudent(undergraduate2);
            biology.enrollStudent(undergraduate3);
            physics.enrollStudent(undergraduate1);
            physics.enrollStudent(undergraduate2);

            physicsLab.enrollStudent(undergraduate1);
            biologyLab.enrollStudent(undergraduate2);
        } catch (MaxStudentsReachedException ex) {
            System.out.println("Enrollment exception occurred : " + ex.getMessage());
        }

        //Adding courses to University
        university.addCourse(math);
        university.addCourse(biology);
        university.addCourse(physics);
        university.addCourse(biologyLab);
        university.addCourse(physicsLab);

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
        Grade grade = new Grade();

        //Check the student's grades
        System.out.println(undergraduate1.getGrades());

        //Check the graduate student's thesis progress
        System.out.println();
        graduate1.printThesisProgress();

        //Make the graduate student study hard
        System.out.println();
        graduate1.study();

        //Make the undergraduate student study hard
        //Method Overloading example
        undergraduate1.study();
        undergraduate1.study(math);

        //Calculate GPA
        System.out.println(grade.calculateGPA(undergraduate1));
        System.out.println();

        //Student gives an exam
        undergraduate1.takeExam(math);
        System.out.println();

        //Tuition methods
        undergraduate1.calculateTuition();
        System.out.println();
        undergraduate1.payTuition();

        //calculate revenue
        System.out.println();
        math.printCourseRevenue();

        System.out.println();
        university.getRevenue();

        //Print the University Details
        System.out.println();
        university.printDetails();

        //Average course attendance
        Course.getAverageAttendance();

    }
}
