package facadePattern;

public class Valet implements HotelService {
    @Override
    public void provideService() {
        System.out.println("Valet service is ready.");
    }
    
    public void pickUpVehicle(String plateNumber) {
        System.out.println("Valet is picking up vehicle with plate number " + plateNumber + ".");
    }
}