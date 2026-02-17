package commandPattern;

public class DecreaseVol implements Command {
    private MusicPlayer musicPlayer;

    public DecreaseVol(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public String execute() {
        return musicPlayer.decreaseVol();
    }
}
