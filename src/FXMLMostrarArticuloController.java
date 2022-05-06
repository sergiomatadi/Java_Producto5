/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import gnoctua.modelo.ArticuloDAO;
import gnoctua.modelo.DAOFactory;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

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
       ArticuloDAO dao=DAOFactory.createArticuloDAO();
       ArrayList<ArticuloDAO> lista = new ArrayList<>();
       lista = (ArrayList<ArticuloDAO>) (dao.listar());
      
        tvCodigoArticulo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        tvDescripcionArticulo.setCellValueFactory(new PropertyValueFactory<>("descripcion"));
        tvGastosEnvioArticulo.setCellValueFactory(new PropertyValueFactory<>("gastosEnvio"));
        tvPrecioVentaArticulo.setCellValueFactory(new PropertyValueFactory<>("precioVenta"));
        tvTiempoEnvioArticulo.setCellValueFactory(new PropertyValueFactory<>("tiempoEnvio"));
        
        //tvTipoCliente.setCellValueFactory(new PropertyValueFactory<>("tipo_cliente"));
        tableArticulo.setItems(FXCollections.observableArrayList(lista));
    }    
    
    @FXML
    void btnAtrasMostrarArticuloClicado(ActionEvent event) {
        NewFXMain.mostrarEscena(NewFXMain.ESCENA_PRINCIPAL);
    }
}
