Implement a singleton class PrintSpooler that represent a print spooler. The print
spooler is responsible for managing the printing of documents. The spooler should only
allow on instance of itself to be created, and it should provide a method printDocument(String documentName)
that add a document to a queue for printing. The spooler should also have a method startPrinting()
that starts the printing process, which should run in a separate thread. When the printing
process is finished, the spooler should send a notification to all registered listeners
indicating that the printing is finished.