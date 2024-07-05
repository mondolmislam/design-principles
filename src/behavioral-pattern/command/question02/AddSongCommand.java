package command.question02;

public class AddSongCommand implements Command{
    private PlayList playlist;
    private Song song;

    public AddSongCommand(PlayList playlist,Song song){
        this.playlist=playlist;
        this.song=song;
    }

    @Override
    public void execute() {
        playlist.add(song);
    }

    @Override
    public void undo() {
        playlist.remove(song);
    }
}
