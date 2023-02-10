import java.io.*;

public class CarArrayTest {

    public static void main(String[] args) throws IOException {

        Car[] cars = MyTextDataReader.readText("mydata.txt");
        System.out.println("------- before");
        for (Car car : cars) {
            System.out.println("" + car);
        }

        System.out.println("------- after");
        for (Car car : cars) {
            car.speed += 10;
            car.mileage += 100;
            System.out.println("" + car);
        }
        //make mydataOut.txt by FileOutputStream
        try {
            FileOutputStream fstream = new FileOutputStream("mydataOut.txt");
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fstream));
            for (Car car : cars) {
                bw.write(car.name + ",");
                bw.write(car.speed + ",");
                bw.write(car.mileage + ",");
                bw.write(car.color);
                bw.write("\n");
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("------- show mydataOut.txt");
        MyTextDataReader.showTextfile("mydataOut.txt");
    }
}
