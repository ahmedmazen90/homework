/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication18;

import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.ConditionalFeature.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author MSI GF
 */
public class FXML1Controller implements Initializable {

    private static void changeSceneToFXMLController() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
@FXML
private Button logout;
@FXML
private Button convert;

@FXML
private Label usd;
@FXML
private Label nis;
    /**
     * Initializes the controller class.
     */

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
         @FXML
    private void showlogoutPage(ActionEvent event) {
    FXML1Controller.changeSceneToFXMLController();
    }
    
       @FXML
    private void convert(ActionEvent event) {
  try {
            
            double usdAmount = Double.parseDouble(usd.getText());

           
            double nisAmount = usdAmount * 3.5;

           
            nis.setText(String.format("NIS: %.2f", nisAmount));
        } catch (NumberFormatException e) {
           
            nis.setText("Invalid input");
        }
    }
}
