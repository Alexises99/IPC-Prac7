/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporizador;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javafx.concurrent.Service;
import javafx.concurrent.Task;

/**
 *
 * @author alexy
 */
public class Tiempo extends Task<String> {
    private LocalDateTime ldt;
    public Tiempo(){
        ldt = LocalDateTime.now();
    }

    @Override
    protected String call() throws Exception {
        while(true){
            if(isCancelled()) break;
            ldt = LocalDateTime.now();
            updateValue(ldt.toLocalTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                if(isCancelled())break;
            }
        }
        return null;
    }

    
    
}
