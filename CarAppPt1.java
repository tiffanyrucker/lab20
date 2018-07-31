
import java.util.ArrayList;
import java.util.Scanner;


public class CarApp {
    
    // input scanner 
    private Scanner in;
    
    public CarApp() {
        // create the scanner to scan the inputs
        in = new Scanner(System.in);
    }
    
    public static void main(String[] args) {
        // create the CarApp
        CarApp app = new CarApp(); 
        // print the welcome note
        System.out.println("Welcome to the Grand Circus Motors admin console!");
        System.out.print("How many cars are you entering: ");
        // read the user input number
        int carCount = app.in.nextInt();
        
        // to store all the cars
        ArrayList<Car> carList = new ArrayList<>();
        // read all the car details and store them into arrayList
        for (int i = 1; i <= carCount; i++) {
            
            System.out.print("Enter Car #"+i+" Make: ");
            app.in.nextLine();
            String make = app.in.nextLine();
            System.out.print("Enter Car #"+i+" Model: ");
            String model = app.in.nextLine();
            System.out.print("Enter Car #"+i+" Year: ");
            int year = app.in.nextInt();
            System.out.print("Enter Car #"+i+" Price: ");
            double price = app.in.nextDouble();
            
            // create a car and add it to the list
            Car car = new Car(make, model, year, price);
            carList.add(car);
            // empty line
            System.out.println();
        }
        
        
        System.out.println("Current Inventory:");
        // print the table
        for (Car car : carList) {
            // print the data aligning to left
            System.out.println(car);
        }
       
       
    }
}
