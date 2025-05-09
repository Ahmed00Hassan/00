
package flight_booking_system;

import java.io.*;
import java.util.*;


public class FileManager {
    
    public static final String USERS_FILE ="users.txt";
    public static final String FLIGHTS_FILE ="flights.txt";
    public static final String BOOKINGS_FILE ="bookings.txt";
    public static final String PASSENGERS_FILE ="passengers.txt";
    
    
    //save users type
    public static void saveUser(User user){
        try (PrintWriter writer =new PrintWriter(new FileWriter(USERS_FILE,true))){
            String userType =user.getClass().getSimpleName();
            writer.println(userType+","+user.toFileString());
        }catch(IOException e){
            System.out.println("error saving user");
        }
    }
        
        
        public static List<User> loadUsers(){
           List<User> users =new ArrayList<>();
           try(Scanner scanner =new Scanner(new File(USERS_FILE))){
                while (scanner.hasNextLine()) {
                   String line =scanner.nextLine();
                   String[] parts =line.split(",",2);
                   
                   String type = parts[0];
                   String data = parts[1];
                   
                   switch (type){
                       case "Customer":
                           users.add(Customer.fromFileString(data));
                           break;
                       case "Agent":
                           users.add(Agent.fromFileString(data));
                           break;
                       case "Administrator":
                           users.add(Administrator.fromFileString(data));
                           break;
                       default:
                           System.out.println("unknown user type");
                   }
               }
           }catch (IOException e){
               System.out.println("error loading users");
           }
           return users;
        }
        
    // Save flight
    public static void saveFlight(Flight flight) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FLIGHTS_FILE, true))) {
            writer.println(flight.toFileString());
        } catch (IOException e) {
            System.out.println("Error saving flight");
        }
    }

    // Load flights
    public static List<Flight> loadFlights() {
        List<Flight> flights = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(FLIGHTS_FILE))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                flights.add(Flight.fromFileString(line));
            }
        } catch (IOException e) {
            System.out.println("Error loading flights");
        }
        return flights;
    }

    // Save booking
    public static void saveBooking(Booking booking) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(BOOKINGS_FILE, true))) {
            writer.println(booking.toFileString());
        } catch (IOException e) {
            System.out.println("Error saving booking");
        }
    }

    // Load bookings
    public static List<Booking> loadBookings() {
        List<Booking> bookings = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(BOOKINGS_FILE))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                bookings.add(Booking.fromFileString(line));
            }
        } catch (IOException e) {
            System.out.println("Error loading bookings");
        }
        return bookings;
    }

    // Save passenger
    public static void savePassenger(Passenger passenger) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(PASSENGERS_FILE, true))) {
            writer.println(passenger.toFileString());
        } catch (IOException e) {
            System.out.println("Error saving passenger");
        }
    }

    // Load passengers
    public static List<Passenger> loadPassengers() {
        List<Passenger> passengers = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(PASSENGERS_FILE))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                passengers.add(Passenger.fromFileString(line));
            }
        } catch (IOException e) {
            System.out.println("Error loading passengers");
        }
        return passengers;
    }

}

