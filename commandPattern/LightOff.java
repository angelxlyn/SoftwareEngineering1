package commandPattern;

public class LightOff implements Command {
    private Light light;

    public LightOff(Light light) {
        this.light = light;
    }

    public String execute(){
        return light.switchOff();
    }
}
