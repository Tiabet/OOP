import java.util.ArrayList;
import java.io.*;

public class MyTextDataReader {

    public static void main(String[] args) {
        MyTextDataReader.showTextfile("mydata.txt");
    }

    public static Car[] readText(String fileName) {
        ArrayList<Car> cars = new ArrayList<>();
        try {
            FileInputStream fstream = new FileInputStream(fileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                String[] token = strLine.split(",");
                for (int i = 0; i < token.length; i++) {
                    token[i] = token[i].replace(" ", "");
                }//method to handle whitespace

                try {
                    int speed = Integer.parseInt(token[1]);
                    int mileage = Integer.parseInt(token[2]);
                    cars.add(new Car(token[0], speed, mileage, token[3]));
                } catch (NumberFormatException e) {

                }//Automatically skip when a string is entered
            }
            fstream.close();

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        Car[] arrcars = cars.toArray(new Car[0]);
        return arrcars;
    }

    public static void showTextfile(String fileName) {
        try {
            FileInputStream fstream = new FileInputStream(fileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;

            //Read File Line By Line
            while ((strLine = br.readLine()) != null) {
                System.out.println(strLine);
            }
            //Close the input stream
            fstream.close();
        } catch (Exception e) {//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
    }

}
