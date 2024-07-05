package command.question02;

public class PauseCommand implements Command{
    public PauseCommand(MusicPlayer musicPlayer){
        this.musicPlayer=musicPlayer;
    }
    private MusicPlayer musicPlayer;
    @Override
    public void execute() {
        musicPlayer.pause();
    }

    @Override
    public void undo() {
musicPlayer.play();
    }
}
