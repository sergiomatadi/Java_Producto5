/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import gnoctua.modelo.ClienteDAO;
import java.net.URL;
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

    


    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }
    
    @FXML
    void btnAtrasClicado(ActionEvent event){
        NewFXMain.mostrarEscena(NewFXMain.ESCENA_PRINCIPAL);
    }
}
