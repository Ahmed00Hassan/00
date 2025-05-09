
package flight_booking_system;

import java.io.*;
import java.util.*;
import java.util.ArrayList;


public class Flight_Booking_system {


    public static void main(String[] args) {
        Customer c =new Customer(1, "ahmed", "pass123", "Ahmed Elsayed"
                ,"xafrotox@gmail.com","01551458947");
        
        Agent a =new Agent(2,"agent22","ag1922","Adam shaker"
                , "adam@gmail.com", "012125500");
        
        Administrator ad =new Administrator(3, "adminx", "super321"
                , "admin one", "admin@gmail.com","001666");
        
        
        FileManager.saveUser(c);
        FileManager.saveUser(a);
        FileManager.saveUser(ad);
        
        System.out.println("all users:");
        for (User u: FileManager.loadUsers()) {
            System.out.println(u.toFileString());
        }
        
        
//        
//        
//        Scanner in = new Scanner(System.in);
//        int option = 0;
//        ArrayList<Flight> flights = new ArrayList<>(); // خليت الـ ArrayList برا الloop
//        ArrayList<Passenger> passengers = new ArrayList<>(); // خليت الـ ArrayList برا الloop
//
//        do {
//            System.out.println("To add a flight with details, click 1 , to add a passenger with information click 2");
//            option = in.nextInt();
//            in.nextLine(); // هتاكل الـ newline بعد nextInt()
//
//            switch (option) {
//                case 1: {
//                    try {
//                        System.out.println("Enter flight ID: ");
//                        String flightID = in.nextLine();
//
//                        System.out.println("Enter airline name: ");
//                        String airline = in.nextLine();
//
//                        System.out.println("Enter source (departure location): ");
//                        String source = in.nextLine();
//
//                        System.out.println("Enter destination: ");
//                        String destination = in.nextLine();
//
//                        System.out.println("Enter departure time: ");
//                        String departureTime = in.nextLine();
//
//                        System.out.println("Enter arrival time: ");
//                        String arrivalTime = in.nextLine();
//
//                        System.out.println("Enter total number of seats: ");
//                        int totalSeats = in.nextInt();
//
//                        System.out.println("Enter number of available seats: ");
//                        int availableSeats = in.nextInt();
//
//                        System.out.println("Enter economy class price: ");
//                        double economyPrice = in.nextDouble();
//
//                        System.out.println("Enter business class price: ");
//                        double businessPrice = in.nextDouble();
//
//                        System.out.println("Enter first class price: ");
//                        double firstClassPrice = in.nextDouble();
//                        in.nextLine(); // تاكل الـ newline بعد nextDouble
//
//                        // إضافة الرحلة للقائمة
//                        flights.add(new Flight(flightID, airline, source, destination,
//                                               departureTime, arrivalTime,
//                                               totalSeats, availableSeats,
//                                               economyPrice, businessPrice, firstClassPrice));
//
//                        // حفظ البيانات في الملف
//                        FileWriter writer = new FileWriter("flights.txt", true); // استخدمنا true هنا عشان نضيف من غير ما نمسح البيانات السابقة
//                        for (Flight flight : flights) {
//                            writer.write(flight.toString() + "\n");
//                        }
//                        writer.close();
//                        System.out.println("Flights saved successfully.");
//                    } catch (IOException e) {
//                        System.out.println("Error while saving flights.");
//                    }
//                    catch(InputMismatchException m){
//                        System.out.println("enter a valid data ");
//                    }
//                }
//                break;
//                case 2: {
//                
//                 System.out.println("Enter passenger ID: ");
//                        int passengerId = in.nextInt();
//                        in.nextLine(); // to consume the newline
//
//                        System.out.println("Enter passenger name: ");
//                        String name = in.nextLine();
//
//                        System.out.println("Enter passport number: ");
//                        int passportNumber = in.nextInt();
//
//                        System.out.println("Enter date of birth (as a numeric simple example :  19901025): ");
//                        int dateOfBirth = in.nextInt();
//
//                        in.nextLine(); // to consume the newline
//                        System.out.println("Enter any special requests: ");
//                        String specialRequests = in.nextLine();
//
//            passengers.add(new Passenger(passengerId, name, passportNumber, dateOfBirth, specialRequests));
//
//    // حفظ بيانات الركاب في الملف
//    try {
//        FileWriter writer = new FileWriter("passenger.txt", true); // استخدمنا true هنا عشان نضيف من غير ما نمسح البيانات السابقة
//        for (Passenger passenger : passengers) {
//            writer.write(passenger.toString() + "\n");
//        }
//        writer.close();
//        System.out.println("Passenger information saved successfully.");
//    } catch (IOException e) {
//        System.out.println("Error while saving passenger information.");
//    }
//                
//                break;
//                }
//                case 10:
//                    System.out.println("Exiting program.");
//                    break;
//                default:
//                    System.out.println("Invalid option. Try again.");
//            }
//        } while (option != 10); // هتوقف لما يكتب 10
//    }

//     ArrayList<String> prefs =new ArrayList<>();
//     prefs.add("window seat");
//     prefs.add("meal");
//     
//     Customer cust1 =new Customer(102,"agamy",prefs,1,"traveler22","Ahmed","ahmed@gmail.com","pass123",true);
//
//     
//     try{
//         File file =new File("customers.txt");
//         PrintWriter writer =new PrintWriter(file);
//         writer.println(cust1.toFileString());
//         writer.close();
//         
//         System.out.println("file stored successfully");
//     }catch(FileNotFoundException e){
//         System.out.println("Error saving file");   
//     }
//     
//     try{
//         File file =new File("customers.txt");
//         Scanner reader =new Scanner(file);
//         
//         System.out.println("reading file: ");
//         
//         while (reader.hasNextLine()) {
//             String line = reader.nextLine();
//             Customer c =Customer.fromFileString(line);
//                System.out.println("Customer loaded:");
//                System.out.println("  ID: " + c.getUserid());
//                System.out.println("  Name: " + c.getName());
//                System.out.println("  Address: " + c.address);
//         }
//         reader.close();
//     }catch (FileNotFoundException e){
//         System.out.println("file not read");
//     }
    }
}

    
