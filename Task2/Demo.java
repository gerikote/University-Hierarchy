package homework.Task2;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        //Creating Graduate Students
        GraduateStudents graduate1 = new GraduateStudents("2025", "John", "Brown", "johnbrown@gmail.com", "Biology", "DNA structure analysis");
        GraduateStudents graduate2 = new GraduateStudents("2628", "Maria", "Foss", "mfos@gmail.com", "Math", "Complex number analysis");
        GraduateStudents graduate3 = new GraduateStudents("2654", "Ryan", "Creed", "rcreed@gmail.com", "Engineer", "Structural mechanics");

        graduate1.introduceMyself();


        //Creating Undergraduate Students
        UndergraduateStudents undergraduate1 = new UndergraduateStudents("5647", "Diego", "Gonazalez", "dgonzalez@gmail.com", "Business", 1);
        UndergraduateStudents undergraduate2 = new UndergraduateStudents("2569", "Ivan", "Gonazalez", "Igonzalez@gmail.com", "Medical", 2);
        UndergraduateStudents undergraduate3 = new UndergraduateStudents("1238", "Chris", "White", "cwhite@gmail.com", "Physics", 4);

        undergraduate1.introduceMyself();

        ArrayList<Students> studentsList = new ArrayList<>();
        studentsList.add(graduate1);
        studentsList.add(graduate2);
        studentsList.add(graduate3);
        studentsList.add(undergraduate1);
        studentsList.add(undergraduate2);
        studentsList.add(undergraduate3);


        //Creating courses
        Course biology101 = new Course("101", "Biology101", null, 25);
        String[] biology102prerequisites = {"biology101"};
        Course biology102 = new Course("102", "Biology102", biology102prerequisites, 25);
        Course math101 = new Course("101", "Math101", null, 25);

        String[] math102prerequisites = {"biology101"};
        Course math102 = new Course("102", "Math102", biology102prerequisites, 25);

        //Courses arrays
        Course[] bio = {biology101, biology102};

        //Creating Academic Staff
        AcademicStaff professor1 = new AcademicStaff("1", "Clayton", "Tumblerson", "ctamp@gmail.com", bio);
        AcademicStaff professor2 = new AcademicStaff("2", "Tom", "Mullins", "tmullins@gmail.com", null);
        AcademicStaff professor3 = new AcademicStaff("3", "Andrew", "Richards", "arichards@gmail.com", null);

        professor1.introduceMyself();


        //Creating administrative Staff
        AdministrativeStaff adminStaff1 = new AdministrativeStaff("10", "Tara", "Flowers", "tflowers@gmail.com", null);
        AdministrativeStaff adminStaff2 = new AdministrativeStaff("11", "Jack", "Ford", "jford@gmail.com", null);
        AdministrativeStaff adminStaff3 = new AdministrativeStaff("12", "John", "Wig", "jwigg@gmail.com", null);
        AdministrativeStaff labAs1 = new AdministrativeStaff("13", "Carl", "Wig", "carl@gmail.com", null);
        AdministrativeStaff labAs2 = new AdministrativeStaff("14", "Nick", "Wig", "nickw@gmail.com", null);

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

        ArrayList<Course> courseList = new ArrayList<>();
        courseList.add(math);
        courseList.add(biology);
        courseList.add(physics);
        courseList.add(lab1);
        courseList.add(lab2);
        courseList.add(biology101);
        courseList.add(biology102);

        University NTUA = new University("National Technical Univarsity of Athens", "Athens,Zografu", studentsList, staffList, courseList);
        /** System.out.println(NTUA.getCourses());
         *System.out.println(NTUA.getStudents());
         */System.out.println(NTUA.getStaff());

        NTUA.getDetails();

    }
}
