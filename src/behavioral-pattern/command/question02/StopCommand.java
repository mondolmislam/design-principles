package command.question02;

public class StopCommand implements Command{
    private MusicPlayer musicPlayer;
    @Override
    public void execute() {
        musicPlayer.stop();
    }

    @Override
    public void undo() {
        musicPlayer.play();
    }
}
