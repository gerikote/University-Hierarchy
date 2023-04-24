package homework.Task2;

import java.util.ArrayList;

public final class AdministrativeStaff extends Staff implements WageCalculator {
    private ArrayList<String> responsibilities;

    public AdministrativeStaff( String firstName, String lastName, String email) {
        super( firstName, lastName, email);
        this.responsibilities = new ArrayList<>();
    }

    public ArrayList<String> getResponsibilities() {
        return responsibilities;
    }

    public void addResponisbility(String responsibility) {
        this.responsibilities.add(responsibility);
    }

    @Override
    public void introduceMyself() {
        System.out.println("Hello. My name is " + firstName + " and i am part of the administrative staff. " + "\n"
                + "My responsibilities are " + responsibilities.toString() + "\n");
    }

    @Override
    public double calculateWage() {
        double bonus = responsibilityBonus * (responsibilities.size());
        double totalWage = baseWage + bonus;
        System.out.println("The staff member's " + firstName + " " + lastName + " total wage is " + totalWage + "$"
                + "\n" + "Base pay is " + baseWage + "$" + " and responsibility bonus is " + bonus + "$");
        return totalWage;
    }
}

