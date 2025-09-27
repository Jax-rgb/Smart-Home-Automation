public class MusicPlayerDecreaseVolumeCommand implements Command {
    private MusicPlayer musicPlayer;

    public MusicPlayerDecreaseVolumeCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.decreaseVolume();
    }
}