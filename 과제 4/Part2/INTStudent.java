import java.util.Random;

//INTStudet is child class of Student class
public class INTStudent extends Student {

    private String type;

    public INTStudent(String newName, String newAddress, String newMajor) {
        super(newName, newAddress, newMajor);
        computeGPA();
        type = "International";
    }
//method computes GPA, 0.5<GPA<8.0
    public void computeGPA() {
        Random rand = new Random();
        GPA = 0.5 + (rand.nextDouble() * 7.5);
    }
//override toString, return type
    public String toString() {
        return super.toString() + "type : " + type;
    }

}