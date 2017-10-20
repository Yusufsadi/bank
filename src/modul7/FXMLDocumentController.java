/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul7;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Yusuf
 */
public class FXMLDocumentController implements Initializable {

    String pinn="";
    String PIN="1234";
    int kesempatan=3;
    int tmp;
    
            
    @FXML
    private JFXButton buttom1;
    @FXML
    private JFXButton buttom2;
    @FXML
    private JFXButton buttom3;
    @FXML
    private JFXButton buttom4;
    @FXML
    private JFXButton buttom5;
    @FXML
    private JFXButton buttom6;
    @FXML
    private JFXButton buttom7;
    @FXML
    private JFXButton buttom8;
    @FXML
    private JFXButton buttom9;
    @FXML
    private JFXButton buttomc;
    @FXML
    private JFXButton buttomok;
    @FXML
    private JFXButton buttom0;
    @FXML
    private JFXPasswordField pin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void tombol1(ActionEvent event) {
        pinn += "1";
        pin.setText(pinn);
        }

    @FXML
    private void tombol2(ActionEvent event) {
        pinn += "2";
        pin.setText(pinn);
    }

    @FXML
    private void tombol3(ActionEvent event) {
        pinn += "3";
        pin.setText(pinn);
    }

    @FXML
     void tombol4(ActionEvent event) {
        pinn += "4";
        pin.setText(pinn);
    }

    @FXML
     void tombol5(ActionEvent event) {
        pinn += "5";
        pin.setText(pinn);
        
    }

    @FXML
     void tombol6(ActionEvent event) {
        pinn += "6";
        pin.setText(pinn);
    }

    @FXML
     void tombol7(ActionEvent event) {
        pinn += "7";
        pin.setText(pinn);
    }

    @FXML
     void tombol8(ActionEvent event) {
        pinn += "8";
        pin.setText(pinn);
    }

    @FXML
     void tombol9(ActionEvent event) {
        pinn += "9";
        pin.setText(pinn);
    }

    @FXML
     void tombolc(ActionEvent event) {
        pinn = "";
        pin.setText(pinn);
    }

    @FXML
     void tombolok(ActionEvent event) {
        if(pinn.equals(PIN)){
             try {
           
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
          
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("penarikan.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 830, 450);
            
        
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Menu Awal");
            stage.show();
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
        } else{
            kesempatan -=1;
            JOptionPane.showMessageDialog(null,"PIN salah \n Tersisia "+kesempatan+" Kesempatan lagi !!");
            pin.setText("");
            pinn = "";
            if (kesempatan == 0){
                System.exit(0);
            }
        }
    }

    @FXML
     void tombol0(ActionEvent event) {
        pinn += "0";
        pin.setText(pinn);
    }
    
}
