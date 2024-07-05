package command.question02;

public class Main {
    public static void main(String[] args) {
        PlayList playlist = new PlayList();
        MusicPlayer musicPlayer = new MusicPlayer();
        CommandInvoker invoker = new CommandInvoker();

        Song song1 = new Song("Song 1","Song");
        Command addSongCommand = new AddSongCommand(playlist, song1);
        Command playCommand = new PlayCommand(musicPlayer);
        Command pauseCommand = new PauseCommand(musicPlayer);

        invoker.executeCommand(addSongCommand);
        invoker.executeCommand(playCommand);
        invoker.executeCommand(pauseCommand);
        invoker.undoLastCommand();
        invoker.undoLastCommand();
    }
}
