public class MusicPlayerIncreaseVolumeCommand implements Command {
    private MusicPlayer musicPlayer;

    public MusicPlayerIncreaseVolumeCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.increaseVolume();
    }
}