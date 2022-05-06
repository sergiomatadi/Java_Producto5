/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import gnoctua.modelo.Cliente;
import gnoctua.modelo.ClienteDAO;
import gnoctua.modelo.DAOFactory;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
        //tvTipoCliente.setCellValueFactory(new PropertyValueFactory<>("tipo_cliente"));
        table.setItems(FXCollections.observableArrayList(lista));

    }
    
    @FXML
    void btnAtrasClicado(ActionEvent event){
        NewFXMain.mostrarEscena(NewFXMain.ESCENA_PRINCIPAL);
    }
}
