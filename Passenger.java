
package flight_booking_system;


public class Passenger {

    private int passengerId;
    private String name;
    private int passportNumber;
    private int dateOfBirth;
    private String specialRequests;

    public Passenger(int passengerId, String name, int passportNumber, int dateOfBirth, String specialRequests) {
        this.passengerId = passengerId;
        this.name = name;
        this.passportNumber = passportNumber;
        this.dateOfBirth = dateOfBirth;
        this.specialRequests = specialRequests;
    }
    
    public String toString() {
        return passengerId + "," + name + "," + passportNumber + "," + dateOfBirth + "," +
               specialRequests;
    } 

    
    public void updateinfo(){
        
    }


    public void getPassengerDetails(){
        System.out.println("name: "+name);
        System.out.println("passenger Id: "+passengerId);
        System.out.println("passport number: "+passportNumber);
        System.out.println("date of birth: "+dateOfBirth);
        System.out.println("special requests: "+specialRequests);
    }
}
