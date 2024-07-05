The Command Pattern is a behavioral design pattern that encapsulates a request as an object, thereby allowing the request to be treated as a first-class citizen. This allows requests to be passed as arguments to methods, stored as properties, or returned as the result of a method. The Command Pattern decouples the object that issues a request from the object that actually performs the request.

The main components of the Command Pattern are:

    Command: Defines the interface for all commands.

    Concrete Command: Implements the Command interface and specifies the receiver of the command.

    Receiver: Receives requests and performs the required actions.

    Invoker: Sends requests to the appropriate Concrete Command object.

    Client: Creates and configures Concrete Command objects, and sets the receiver for each command.

Here's how the Command Pattern works:

    The Client creates a Concrete Command object and sets the Receiver object for that command.

    The Invoker object receives the Concrete Command object and stores it.

    The Client sends a request to the Invoker object, which invokes the appropriate Concrete Command object.

    The Concrete Command object sends a request to the Receiver object to perform an action.

    The Receiver object performs the requested action.

The Command Pattern allows requests to be queued, logged, and otherwise manipulated. It can also be used to implement undo and redo functionality by maintaining a history of executed commands. Overall, the Command Pattern makes it easy to decouple the requester and receiver of a command, and provides a flexible way to configure an application's behavior at runtime.