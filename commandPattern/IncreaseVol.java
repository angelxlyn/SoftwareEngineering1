package commandPattern;

public class IncreaseVol implements Command {
    private MusicPlayer musicPlayer;

    public IncreaseVol(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public String execute() {
        return musicPlayer.increaseVol();
    }
}
