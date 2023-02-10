// ***************************************************************
//   StudentDriver.java									Java Foundations
//
//   Driver class to test Student.java
//   
// ***************************************************************
public class StudentDriver {

    public static void main(String[] args) {
        Student A = new Student("Jason Snyder", "124 Street Rd.", "Computer Science");
        Student B = new Student("Dan Stern", "54 Queens Blvd.");
        Student C = new INTStudent("Dave Scott", "19 Phillies Ln.", "Russian History");

        System.out.println("===========<Before>===========");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        A.setAddress("16 Kristen Dr.");
        B.setMajor("Philosopy");
        C.computeGPA();
        System.out.println("===========<After>============");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}
