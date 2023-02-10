//********************************************************************
//  BoxTest.java       Java Foundations
//
//  Solution to Programming Project 5.6
//********************************************************************
public class BoxTest {
    //-----------------------------------------------------------------
    //  Creates and exercises some Box objects.
    //-----------------------------------------------------------------

    public static void main(String[] args) {
        Box b1 = new Box(4, 10, 7);
        Box b2 = new Box(3, 3, 4);
        Box b3 = new Box(12, 8, 8);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        b1.setHeight(10);
        b2.setWidth(14);
        b3.setDepth(11);
        b2.setFull(true);

        System.out.println();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        if (b1.compareTo(b2) > 0) {
            System.out.println("b1 is greater than b2");
        } else {
            System.out.println("b1 is greater than b2");
        }
    }
}