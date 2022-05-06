

import gnoctua.modelo.DAOFactory;
import gnoctua.modelo.PedidoDAO;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


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
       PedidoDAO dao=DAOFactory.createPedidoDAO();
       ArrayList<PedidoDAO> lista = new ArrayList<>();
       lista = (dao.listar());
      
        tvCantidadPedido.setCellValueFactory(new PropertyValueFactory<>("cantidad"));
        tvCodigoPedido.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        tvEnviadoPedido.setCellValueFactory(new PropertyValueFactory<>("enviado"));
        tvFechaPedido.setCellValueFactory(new PropertyValueFactory<>("fechaPedido"));
        tvHoraPedido.setCellValueFactory(new PropertyValueFactory<>("hora"));
        tvNifPedido.setCellValueFactory(new PropertyValueFactory<>("nif"));
        tvNumeroPedido.setCellValueFactory(new PropertyValueFactory<>("numero"));
       
        tablePedido.setItems(FXCollections.observableArrayList(lista));
    }    
    
    @FXML
    void btnAtrasClicado(ActionEvent event) {
        NewFXMain.mostrarEscena(NewFXMain.ESCENA_PRINCIPAL);

    }

}
