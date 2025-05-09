
package flight_booking_system;

import java.util.ArrayList;

public class Booking {

    private String bookingReference;
    private String customer;
    private int flight;
    private Arraylist<Passenger> passenger;
    private int seatSelections;
    private boolean status;
    private String paymentStatus;

    
    public Booking(String customer, int flight, int seatSelections, String paymentStatus) {
        this.customer = customer;
        this.flight = flight;
        this.seatSelections = seatSelections;
        this.paymentStatus = paymentStatus;
        this.bookingReference = null;
        this.status = false;
        this.passenger = null;

    }


    
    public void addPassenger(Passenger passenger){   
    
    }
    
    public void calculateTotalPrice(){
    
    }
    
    
    public void confirmBooking(){   
    
    }
    
    
    public void cancelBooking(){   
    
    }
    
    
    public void generateItinerary(){
        
    }
    
    
}

