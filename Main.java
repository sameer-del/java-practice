// Base class: Person
class Person {
    String name;
    int age;

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class: Employee (inherits from Person)
class Employee extends Person {
    int empId;
    String department;

    // Constructor to initialize Employee details
    public Employee(String name, int age, int empId, String department) {
        super(name, age);  // Call constructor of Person class
        this.empId = empId;
        this.department = department;
    }

    public void displayEmployeeDetails() {
        displayPersonDetails(); // Calling method of Person class
        System.out.println("Employee ID: " + empId);
        System.out.println("Department: " + department);
    }
}

// Derived class: Developer (inherits from Employee)
class Developer extends Employee {
    String[] skills;

    // Constructor to initialize Developer details
    public Developer(String name, int age, int empId, String department, String[] skills) {
        super(name, age, empId, department);  // Call constructor of Employee class
        this.skills = skills;
    }

    public void displayDeveloperDetails() {
        displayEmployeeDetails();  // Call method from Employee class
        System.out.print("Skills: ");
        for (String skill : skills) {
            System.out.print(skill + " ");
        }
        System.out.println();
    }
}

// Derived class: SeniorDeveloper (inherits from Developer)
class SeniorDeveloper extends Developer {
    String projectName;

    // Constructor to initialize Senior Developer details
    public SeniorDeveloper(String name, int age, int empId, String department, String[] skills, String projectName) {
        super(name, age, empId, department, skills);  // Call constructor of Developer class
        this.projectName = projectName;
    }

    public void displaySeniorDeveloperDetails() {
        displayDeveloperDetails();  // Call method from Developer class
        System.out.println("Project: " + projectName);
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        String[] skills = {"Java", "Python", "SQL"};
        
        // Creating a SeniorDeveloper object
        SeniorDeveloper seniorDev = new SeniorDeveloper("Alice", 35, 201, "Software Development", skills, "AI Platform");

        // Display Senior Developer details
        seniorDev.displaySeniorDeveloperDetails();
    }
}
