/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import gnoctua.modelo.ArticuloDAO;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class FXMLMostrarArticuloController implements Initializable {

    @FXML
    private Button btnAtras;
    
    @FXML
    private TableView<ArticuloDAO> tableArticulo;


    @FXML
    private TableColumn<ArticuloDAO, Integer> tvCodigoArticulo;

    @FXML
    private TableColumn<ArticuloDAO, String> tvDescripcionArticulo;

    @FXML
    private TableColumn<ArticuloDAO, Double> tvGastosEnvioArticulo;

    @FXML
    private TableColumn<ArticuloDAO, Double> tvPrecioVentaArticulo;

    @FXML
    private TableColumn<ArticuloDAO, LocalDate> tvTiempoEnvioArticulo;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    void btnAtrasMostrarArticuloClicado(ActionEvent event) {
        NewFXMain.mostrarEscena(NewFXMain.ESCENA_PRINCIPAL);
    }
}
