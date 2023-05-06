package app.service;

import org.springframework.stereotype.Service;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class ServerResponseService {
    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    //private
    public boolean conductOperation(String comType, int timeDelay, boolean result) {
        System.out.print(ZonedDateTime.now(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.println("\tOperation started, " + comType);
        wait(timeDelay);
        System.out.print(ZonedDateTime.now(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.println("\tOperation finished: " + (result?"success":"fail"));
        return result;
    }
}
