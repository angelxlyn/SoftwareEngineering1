package commandPattern;

public class IncreaseTemp implements Command {
    private Thermostat thermostat;

    public IncreaseTemp(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    public String execute() {
        return thermostat.increaseTemp();
    }
}
