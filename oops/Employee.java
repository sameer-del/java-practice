class Employee {
    String name;
    int yearOfJoining;
    String address;

    
    Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    
    void displayDetails() {
        System.out.printf("%-15s %-20d %s\n", name, yearOfJoining, address);
    }

    
    public static void main(String[] args) {
       
        Employee emp1 = new Employee("Robert", 1994, "64C- WallsStreat");
        Employee emp2 = new Employee("Sam", 2000, "68D- WallsStreat");
        Employee emp3 = new Employee("John", 1999, "26B- WallsStreat");

        System.out.printf("%-15s %-20s %s\n", "Name", "Year of joining", "Address");
        System.out.println("--------------------------------------------------------");

        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}
