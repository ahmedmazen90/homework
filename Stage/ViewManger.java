/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication18.Stage;

import java.io.IOException;

/**
 *
 * @author MSI GF
 */
public class ViewManger {
     public static FXML fxml;
    public static FXML1 fxml1;
    
    
    private ViewManger(){   
    }
    
    public static void openFXML(){
        if (fxml == null) {
            fxml = new FXML();
            fxml.show();
        } else {
            fxml.show();
        }
        
    }
    public static void closeFXML(){
        if(fxml != null)
            fxml.close();
    }
    
    public static void openFXML1() throws IOException{
        if (fxml1 == null) {
            fxml1 = new FXML1();
            fxml1.show();
        } else {
            fxml1.show();
        }
        
    }
    public static void closeFXML1(){
        if(fxml1 != null)
            fxml.show();
    }
}

