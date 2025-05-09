
package flight_booking_system;

import java.io.*;
import java.util.*;


public class FileManager {
    
    public static final String FILE_NAME ="users.txt";
    
    
    //save users type
    public static void saveUser(User user){
        try (PrintWriter writer =new PrintWriter(new FileWriter(FILE_NAME,true))){
            String userType =user.getClass().getSimpleName();
            writer.println(userType+","+user.toFileString());
        }catch(IOException e){
            System.out.println("error saving user");
        }
    }
        
        
        public static List<User> loadUsers(){
           List<User> users =new ArrayList<>();
           try(Scanner scanner =new Scanner(new File(FILE_NAME))){
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
        
        
        public static void saveFlight(Flight flight){
            
        }
}

