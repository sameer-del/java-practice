public class Studenttwoobject {
    int roll_no;
    String name;
    int phonenum;
    String address;

    Studenttwoobject(int roll_no, String name, String address,int phonenum){
        this.roll_no = roll_no;
        this.name = name;
        this.phonenum = phonenum;
        this.address = address;
    }
     void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Phone No: " + phonenum);
        System.out.println("Address: " + address);
        System.out.println();
    }
    public static void main(String[] args) {
        Studenttwoobject student1 = new Studenttwoobject(1,"sam","thiruvarur",987654321);
        Studenttwoobject student2 = new Studenttwoobject(2,"john","thanjavur",987654321);

        // Displaying the details of each student
        student1.displayDetails();
        student2.displayDetails();
    }
}
