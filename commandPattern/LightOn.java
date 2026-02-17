package commandPattern;

public class LightOn implements Command {
    private Light light;

    public LightOn(Light light) {
        this.light = light;
    }

    public String execute(){
        return light.switchOn();
    }
}
