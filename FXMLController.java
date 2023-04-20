/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication18;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafxapplication18.Stage.FXML1;
import javafxapplication18.Stage.ViewManger;
//import static javafxapplication18.Stage.Operation.FXML1;
/**
 * FXML Controller class
 *
 * @author MSI GF
 */
public class FXMLController implements Initializable {

    
    

    
    
@FXML
private Button btnlogin;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
           @FXML
    private void login(ActionEvent event) {
    Class<javafxapplication18.Stage.FXML> aClass = javafxapplication18.Stage.FXML.class;
    }
       
    
}
