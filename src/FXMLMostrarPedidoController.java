/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import gnoctua.modelo.PedidoDAO;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


public class FXMLMostrarPedidoController implements Initializable {

    @FXML
    private TableView<PedidoDAO> tablePedido;

    @FXML
    private TableColumn<PedidoDAO, Integer> tvCantidadPedido;

    @FXML
    private TableColumn<PedidoDAO, Integer> tvCodigoPedido;

    @FXML
    private TableColumn<PedidoDAO, Boolean> tvEnviadoPedido;

    @FXML
    private TableColumn<PedidoDAO, LocalDate> tvFechaPedido;

    @FXML
    private TableColumn<PedidoDAO, LocalTime> tvHoraPedido;

    @FXML
    private TableColumn<PedidoDAO, String> tvNifPedido;

    @FXML
    private TableColumn<PedidoDAO, Integer> tvNumeroPedido;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    void btnAtrasClicado(ActionEvent event) {
        NewFXMain.mostrarEscena(NewFXMain.ESCENA_PRINCIPAL);

    }

}
