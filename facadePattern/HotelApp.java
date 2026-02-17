package facadePattern;

public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();
        
        frontDesk.handleServiceRequest("ALV-2903", 314, 2);
    }
}