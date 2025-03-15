class Employee{
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary){
        System.out.println("Calling Employee Constructor");
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("Employee Type: " + this.getClass().getSimpleName());
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
class Manager extends Employee {
    int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        System.out.println("Calling Manager Constructor");
        this.teamSize = teamSize;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        System.out.println("Calling Developer Constructor");
        this.programmingLanguage = programmingLanguage;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    int duration; // in months

    public Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        System.out.println("Calling Intern Constructor");
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration + " months");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee manager = new Manager("Naman", 101, 80000, 5);

        manager.displayDetails();
        System.out.println();

        Employee developer = new Developer("NMG", 102, 60000, "Java");

        developer.displayDetails();
        System.out.println();

        Employee intern = new Intern("Arjun", 103, 20000, 6);
        intern.displayDetails();
    }
}
