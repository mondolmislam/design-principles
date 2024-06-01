package singleton.question03;

import java.util.ArrayList;
import java.util.List;

public class PrintSpooler {
    private static PrintSpooler instance;
    private List<String> printQueue;
    private List<PrintSpoolerListener> listeners;
    private Thread printThread;

    private PrintSpooler() {
        printQueue = new ArrayList<>();
        listeners = new ArrayList<>();
    }

    public static synchronized PrintSpooler getInstance() {
        if (instance == null) {
            instance = new PrintSpooler();
        }
        return instance;
    }

    public void printDocument(String documentName) {
        printQueue.add(documentName);
    }

    public void addListener(PrintSpoolerListener listener) {
        listeners.add(listener);
    }

    public void startPrinting() {
        printThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!printQueue.isEmpty()) {
                    String documentName = printQueue.remove(0);
                    System.out.println("printing document : " + documentName);
                }
                for (PrintSpoolerListener listener : listeners) {
                    listener.onPrintingFinished();
                }
            }
        });
    }
}
