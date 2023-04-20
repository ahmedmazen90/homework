/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication18.Stage;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author MSI GF
 */
public class FXML1 extends Stage {
    private Scene login;

     public FXML1() throws IOException {
         FXMLLoader loginLoader = new FXMLLoader(getClass().getResource("javafxapplication18.View/FXML.fxml"));
         Parent usersRoot = loginLoader.load();     
        login = new Scene(usersRoot);
          this.setScene(login);
        this.setTitle("Admin Dasboard");
        
     }
      public  void changeSceneToCreateUser(){
        this.setScene(login);
    }

    
}
