/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Operaciones;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author santi
 */
public class OperacionController implements Initializable {

    @FXML
    private RadioButton btnSum;
    @FXML
    private RadioButton btnRes;
    @FXML
    private RadioButton btnMul;
    @FXML
    private RadioButton btnDiv;
    @FXML
    private Button btnOpe;
    @FXML
    private TextField txtNum2;
    @FXML
    private TextField txtNum1;
    @FXML
    private TextField txtRes;
    @FXML
    private RadioButton btnMod;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ToggleGroup tg = new ToggleGroup();
        btnSum.setToggleGroup(tg);
        btnRes.setToggleGroup(tg);
        btnMul.setToggleGroup(tg);
        btnDiv.setToggleGroup(tg);
        //Modulo
        btnMod.setToggleGroup(tg);
    }

    @FXML
    private void hacerOperacion(ActionEvent event) {

        try {
            int num1 = Integer.parseInt(this.txtNum1.getText());
            int num2 = Integer.parseInt(this.txtNum2.getText());

            Operaciones ope = new Operaciones(num1, num2);

            int resultado = 0;

            if (this.btnSum.isSelected()) {
                resultado = ope.sumar();
            } else {
                if (this.btnRes.isSelected()) {
                    resultado = ope.restar();
                } else {
                    if (this.btnMul.isSelected()) {
                        resultado = ope.multi();
                    } else {
                        if (this.btnDiv.isSelected()) {
                            if (num2 == 0) {
                                Alert alert2 = new Alert(Alert.AlertType.ERROR);
                                alert2.setHeaderText("Error numero");
                                alert2.setTitle("Error");
                                alert2.setContentText("Debes ingresar un numero entero");
                                alert2.showAndWait();
                            } else {
                                resultado = ope.dividir();
                            }
                        }
                    }
                }
            }
            this.txtRes.setText(Integer.toString(resultado));
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Error numero");
            alert.setTitle("Error");
            alert.setContentText("Debes ingresar un numero entero");
            alert.showAndWait();
        }

    }

}
