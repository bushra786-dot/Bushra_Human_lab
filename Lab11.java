import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab11 {

    private List<String> cars;

    public Lab11() {
        cars = new ArrayList<>();
    }

    // Method to add a car
    public void addCar(String car) {
        cars.add(car);
        System.out.println(car + " has been added.");
    }

    // Method to remove a car
    public void removeCar(String car) {
        if (cars.remove(car)) {
            System.out.println(car + " has been removed.");
        } else {
            System.out.println(car + " was not found.");
        }
    }

    // Method to display all cars
    public void displayCars() {
        System.out.println("Current cars in the list: " + cars);
    }

    public static void main(String[] args) {
        Lab11 lab = new Lab11();
        Scanner scanner = new Scanner(System.in);
        String input;
        
        // Adding initial cars
        lab.addCar("Volvo");
        lab.addCar("BMW");
        lab.addCar("Ford");
        lab.addCar("Mazda");
        
        // Displaying initial list of cars
        lab.displayCars();

        // Menu for user interaction
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add a car");
            System.out.println("2. Remove a car");
            System.out.println("3. Display all cars");
            System.out.println("4. Exit");
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.print("Enter car name to add: ");
                    String carToAdd = scanner.nextLine();
                    lab.addCar(carToAdd);
                    break;
                case "2":
                    System.out.print("Enter car name to remove: ");
                    String carToRemove = scanner.nextLine();
                    lab.removeCar(carToRemove);
                    break;
                case "3":
                    lab.displayCars();
                    break;
                case "4":
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
