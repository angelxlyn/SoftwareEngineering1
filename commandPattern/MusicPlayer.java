package commandPattern;

public class MusicPlayer {
    private int volume = 10;

    public String playMusic() {
        return "Playing favorite playlist";
    }

    public String stopMusic(){
        return "Music stopped";
    }

    public String increaseVol() {
        volume++;
        return "Volume increased to " + volume;
    }

    public String decreaseVol(){
        volume--;
        return "Volume decreased to " + volume;
    }
}
