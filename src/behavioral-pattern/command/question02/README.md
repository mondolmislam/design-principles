Suppose you are developing a music player application that allows users to play, pause, and stop the music.
The application also allows users to create playlists and add songs to them. You want to implement a feature
where the user can undo their last action, such as adding a song to a playlist. How would you implement this feature
using the command design pattern.

Define Command Interface: Create an interface or abstract class for the command that declares the methods execute() and undo().

Concrete Command Classes: Implement concrete command classes for each action (e.g., AddSongCommand, PlayCommand, PauseCommand, StopCommand). Each of these classes will implement the execute() and undo() methods.

Invoker: The invoker class will be responsible for executing commands and maintaining a history of commands to support undo functionality.

Receiver: The receiver class (e.g., Playlist, MusicPlayer) will perform the actual operations.

Client: The client will create command objects and assign them to the invoker to execute actions.