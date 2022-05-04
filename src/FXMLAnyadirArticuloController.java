/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class FXMLAnyadirArticuloController implements Initializable {

    
    @FXML
    private Button btnAceptar;

    @FXML
    private Button btnArticuloCancelar;

    @FXML
    private TextField tfCodigoArticulo;

    @FXML
    private TextField tfDescripcionArticulo;

    @FXML
    private TextField tfGastosEnvioArticulo;

    @FXML
    private TextField tfPrecioVentaArticulo;

    @FXML
    private TextField tfTiempoEnvioArticulo;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    void btnAceptarArticuloClicado(ActionEvent event) {

    }

    @FXML
    void btnCancelarClicado(ActionEvent event) {
        NewFXMain.mostrarEscena(NewFXMain.ESCENA_PRINCIPAL);
    }
    
}
