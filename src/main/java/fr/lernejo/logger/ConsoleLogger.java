package main.java.fr.lernejo.logger;

public class ConsoleLogger implements Logger{

    @Override
    public void log(String message){
        System.out.printf(message);
    }
}
