package commandPattern;

public class SmartHomeApp {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();

        SmartHomeHub hub = new SmartHomeHub();

        hub.setCommand(new LightOn(light));
        System.out.println(hub.pressButton());

        hub.setCommand(new LightOff(light));
        System.out.println(hub.pressButton());

        hub.setCommand(new IncreaseTemp(thermostat));
        System.out.println(hub.pressButton());

        hub.setCommand(new DecreaseTemp(thermostat));
        System.out.println(hub.pressButton());

        hub.setCommand(new PlayMusic(musicPlayer));
        System.out.println(hub.pressButton());

        hub.setCommand(new StopMusic(musicPlayer));
        System.out.println(hub.pressButton());

        hub.setCommand(new IncreaseVol(musicPlayer));
        System.out.println(hub.pressButton());

        hub.setCommand(new DecreaseVol(musicPlayer));
        System.out.println(hub.pressButton());
    }
}
