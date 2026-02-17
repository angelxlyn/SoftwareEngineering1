package adapterPattern;

public class DeviceManagerApp {
    public static void main(String[] args){
        Laptop laptop = new Laptop();
        PowerOutlet laptopAdapter = new LaptopAdapter(laptop);
        
        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
        
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        PowerOutlet smartphoneAdapter = new SmartphoneAdapter(smartphoneCharger);
        
        System.out.println(laptopAdapter.plugIn());
        System.out.println(refrigeratorAdapter.plugIn());
        System.out.println(smartphoneAdapter.plugIn());
    }
}