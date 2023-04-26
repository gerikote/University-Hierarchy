package homework.Task2;


public class Demo {
    public static void main(String[] args) {
        //Creating an object of University class
        University NTUA = new University("National Technical University of Athens", "Athens,Zografu");

        //Creating Graduate Students
        GraduateStudent graduate1 = new GraduateStudent("John", "Brown", "johnbrown@gmail.com", "Biology", "DNA structure analysis");
        GraduateStudent graduate2 = new GraduateStudent("Maria", "Foss", "mfos@gmail.com", "Math", "Complex number analysis");
        GraduateStudent graduate3 = new GraduateStudent("Ryan", "Creed", "rcreed@gmail.com", "Engineer", "Structural mechanics");

        //Creating Undergraduate Students
        UndergraduateStudent undergraduate1 = new UndergraduateStudent("Diego", "Gonazalez", "dgonzalez@gmail.com", "Business", 1);
        UndergraduateStudent undergraduate2 = new UndergraduateStudent("Ivan", "Gonazalez", "Igonzalez@gmail.com", "Medical", 2);
        UndergraduateStudent undergraduate3 = new UndergraduateStudent("Chris", "White", "cwhite@gmail.com", "Physics", 4);

        //Adding students to University
        NTUA.addStudent(graduate1);
        NTUA.addStudent(graduate2);
        NTUA.addStudent(graduate3);
        NTUA.addStudent(undergraduate1);
        NTUA.addStudent(undergraduate2);
        NTUA.addStudent(undergraduate3);


        //Creating Academic Staff
        AcademicStaff professor1 = new AcademicStaff("Clayton", "Tumblerson", "ctamp@gmail.com");
        AcademicStaff professor2 = new AcademicStaff("Tom", "Mullins", "tmullins@gmail.com");
        AcademicStaff professor3 = new AcademicStaff("Andrew", "Richards", "arichards@gmail.com");


        //Creating administrative Staff
        AdministrativeStaff adminStaff1 = new AdministrativeStaff("Tara", "Flowers", "tflowers@gmail.com");
        AdministrativeStaff adminStaff2 = new AdministrativeStaff("Jack", "Ford", "jford@gmail.com");
        AdministrativeStaff adminStaff3 = new AdministrativeStaff("John", "Wig", "jwigg@gmail.com");
        AdministrativeStaff labAs1 = new AdministrativeStaff("Carl", "Wig", "carl@gmail.com");
        AdministrativeStaff labAs2 = new AdministrativeStaff("Nick", "Wig", "nickw@gmail.com");

        //Adding responsibilities for admin staff
        adminStaff1.addResponsisbility("library organisation");
        labAs1.addResponsisbility("Prepare lab equipment");

        //Adding staff to University
        NTUA.addStaff(professor1);
        NTUA.addStaff(professor2);
        NTUA.addStaff(professor3);
        NTUA.addStaff(adminStaff1);
        NTUA.addStaff(adminStaff2);
        NTUA.addStaff(adminStaff3);
        NTUA.addStaff(labAs1);
        NTUA.addStaff(labAs2);

        //Creating lectures
        Lecture math = new Lecture("101", "Math", professor1);
        Lecture biology = new Lecture("105", "Biology", professor2);
        Lecture physics = new Lecture("106", "Physics", professor3);

        //Creating labs
        Lab physicsLab = new Lab("101", "Physics", labAs1);
        Lab biologyLab = new Lab("102", "Biology", labAs2);

        //Enrolling students in classes
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

        //Adding courses to University
        NTUA.addCourse(math);
        NTUA.addCourse(biology);
        NTUA.addCourse(physics);
        NTUA.addCourse(biologyLab);
        NTUA.addCourse(physicsLab);

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
        NTUA.getRevenue();

        //Print the University Details
        System.out.println();
        NTUA.printDetails();

        //Average course attendance
        Course.averageAttendance();


    }
}
