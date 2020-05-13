/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporizador;

import static java.lang.Thread.sleep;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.binding.Bindings;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author alexy
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Button butMos;
    @FXML
    private Button butPar;
    
    private Tiempo tiempo;

    /**
     * Initializes the controller class.
     */
    
    
   
    
        
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
        
     
        
    }  
    @FXML
    private void show(ActionEvent e){
       tiempo = new Tiempo();
       label.textProperty().bind(tiempo.valueProperty());
       Thread th = new Thread(tiempo);
       th.setDaemon(true);
       th.start();
    }
    
    @FXML
    private void stop(ActionEvent e){
        tiempo.cancel();
    }
}
