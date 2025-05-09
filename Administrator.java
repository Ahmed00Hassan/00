
package flight_booking_system;


public class Administrator extends User {
    private String adminId;
    private String securityLevel;
    
    public Administrator() {
    }

    public Administrator(int userId, String userName, String name, String email, String password, String contactInfo) {
        super(userId, userName, name, email, password, contactInfo);
    }

    public static Administrator fromFileString(String line) {
        String[] parts = line.split(",");
        return new Administrator(
            Integer.parseInt(parts[0]),
            parts[1],
            parts[2],
            parts[3],
            parts[4],
            parts[5]
        );
    }
    public String toString(){
        return getUserId()+","+getUserName()+","+getName()+","+getEmail();
    }
        
    
    
}
