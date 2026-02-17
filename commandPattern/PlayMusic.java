package commandPattern;

public class PlayMusic implements Command {
    private MusicPlayer musicPlayer;

    public PlayMusic(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public String execute() {
        return musicPlayer.playMusic();
    }
}
