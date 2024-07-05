package command.question02;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private List<Song> songs;

    public PlayList() {
        songs = new ArrayList<>();
    }

    public void add(Song song) {
        songs.add(song);
    }

    public void remove(Song song) {
        songs.remove(song);
    }
}
