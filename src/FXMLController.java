

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


public class FXMLController implements Initializable {

    @FXML
    private Button btnAnyadirCliente;
    
    @FXML
    private Button btnMostrarClientes;
    
    @FXML
    private Button btnMostrarArticulo;
      
    @FXML
    private Button btnAnyadirArticulo;
    
    @FXML
    private Button btnAnyadirPedido;
         
    @FXML
    private Button btnMostrarPedido;
    
    @FXML
    private Button btnSalir;
    
    
          
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void btnAnyadirClienteClicado(ActionEvent evt){
        NewFXMain.mostrarEscena(NewFXMain.ESCENA_NUEVO_CLIENTE);
    }
   

    @FXML
    public void btnMostrarClientesClicado(ActionEvent evt){
        System.out.println("Hola");
    }
    
    @FXML
    public void btnAnyadirArticuloClicado(ActionEvent evt){
        System.out.println("Hola");
    }
    
    @FXML
    public void btnMostrarArticuloClicado(ActionEvent evt){
        System.out.println("Hola");
    }  
   
   
    @FXML
    public void btnAnyadirPedidoClicado(ActionEvent evt){
        System.out.println("Hola");
    }
   
    @FXML
    public void btnMostrarPedidoCliclado(ActionEvent evt){
        System.out.println("Hola");
    }
    
     @FXML
    public void btnSalirCliclado(ActionEvent evt){
        System.out.println("Hola");
    }
    
    
   
    
}