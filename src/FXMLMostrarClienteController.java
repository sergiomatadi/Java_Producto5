

import gnoctua.modelo.ClienteDAO;
import gnoctua.modelo.DAOFactory;
import java.net.URL;
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
public class FXMLMostrarClienteController implements Initializable {

    @FXML
    private TableView<ClienteDAO> table;

    @FXML
    private TableColumn<ClienteDAO, String> tvDomicilio;

    @FXML
    private TableColumn<ClienteDAO, String> tvEmail;

    @FXML
    private TableColumn<ClienteDAO, String> tvNif;

    @FXML
    private TableColumn<ClienteDAO, String> tvNombre;

    @FXML
    private TableColumn<ClienteDAO, String> tvTipoCliente;
    
    @FXML
    private Button btnAtras;

    
    //ObservableList<ClienteDAO> oblist = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       ClienteDAO dao=DAOFactory.createClienteDAO();
       ArrayList<ClienteDAO> lista = new ArrayList<>();
       lista = (dao.listar());
      
        tvDomicilio.setCellValueFactory(new PropertyValueFactory<>("domicilio"));
        tvEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        tvNif.setCellValueFactory(new PropertyValueFactory<>("nif"));
        tvNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        table.setItems(FXCollections.observableArrayList(lista));

    }
    
    @FXML
    void btnAtrasClicado(ActionEvent event){
        NewFXMain.mostrarEscena(NewFXMain.ESCENA_PRINCIPAL);
    }
}
