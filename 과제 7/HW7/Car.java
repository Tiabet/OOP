import java.io.*;

public class Car implements Serializable{
	public String name; 
	public int speed; 
	public int mileage; 
	public String color; 

	public Car() {		
		this("none", 0, 1, "red");
	}

	public Car(String tpName, int tpSpeed, int tpmileasge, String toColor) {		
		name = tpName;
		speed = tpSpeed;
		mileage = tpmileasge;
		color = toColor;
	}

        @Override
	public String toString() {
		return "name: " + name + " speed: " + speed + " mileage: " + mileage + " color: " + color;
	}
}