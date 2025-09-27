public class MusicPlayer {
    private int volume = 50;
    private String currentPlaylist = "Default";

    public void turnOn() {
        System.out.println("Music Player is ON, playing playlist: " + currentPlaylist);
    }

    public void turnOff() {
        System.out.println("Music Player is OFF");
    }

    public void increaseVolume() {
        volume += 10;
        System.out.println("Music Player volume increased to " + volume);
    }

    public void decreaseVolume() {
        volume = Math.max(0, volume - 10);
        System.out.println("Music Player volume decreased to " + volume);
    }

    public void playPlaylist(String playlist) {
        currentPlaylist = playlist;
        System.out.println("Music Player playing playlist: " + playlist);
    }
}