
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class FXMLAnyadirPedidoController implements Initializable {

     @FXML
    private Button btnAceptar;

    @FXML
    private Button btnCancelar;

    @FXML
    private TextField tfCantidadPedido;

    @FXML
    private TextField tfEnviado;

    @FXML
    private TextField tfFechaPedido;

    @FXML
    private TextField tfHoraPedido;

    @FXML
    private TextField tfNumeroPedido;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    void btnACeptarClicado(ActionEvent event) {

    }

    @FXML
    void btnCancelarclicado(ActionEvent event) {
        NewFXMain.mostrarEscena(NewFXMain.ESCENA_PRINCIPAL);
    }

}
