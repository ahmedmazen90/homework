/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication18.Stage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author MSI GF
 */
public class FXML  extends Stage {
        private Scene convert;

    final Label user;
    final TextField userid;
 final ToggleGroup genderGroup;
    final Label pasid;
    final PasswordField passid;
    final Button btnlogin;
    
    public  void changeSceneToconvert(){
        this.setScene(convert);
    }
    public FXML(){
      user=  new Label("User name : ");
     userid= new TextField();
   pasid  =  new Label("User name : ");
   passid= new PasswordField();
  btnlogin = new Button("Login");
  genderGroup= new ToggleGroup();
  
   btnlogin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    ViewManger.openFXML1();
                } catch (IOException ex) {
                    Logger.getLogger(FXML.class.getName()).log(Level.SEVERE, null, ex);
                }
                ViewManger.closeFXML();
            }

        });
 
   
        HBox hbox = new HBox(30);
   StackPane root = new StackPane();
        root.getChildren().add(hbox);
        
        Scene scene = new Scene(root, 740, 440);
//        stackPane.getStyleClass().add("stackPane");
//        scene.getStylesheets().add("/css/style.css");



        this.setScene(scene);
        this.setTitle("Rigester Page");
        this.setResizable(false);
        this.show();
    }
     
}
