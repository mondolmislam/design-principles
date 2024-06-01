package singleton.question02;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance;
    private FileWriter writer;

    private Logger(){
        try{
            writer=new FileWriter("system.log");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static Logger getInstance(){
        if (instance==null){
            synchronized (Logger.class){
                if (instance==null){
                    instance=new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String msg){
        try {
            writer.write(msg);
            writer.write("\n");
            writer.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
