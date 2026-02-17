package commandPattern;

public class DecreaseTemp implements Command {
    private Thermostat thermostat;

    public DecreaseTemp(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    public String execute() {
        return thermostat.decreaseTemp();
    }
}
