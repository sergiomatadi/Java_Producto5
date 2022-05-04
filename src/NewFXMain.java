/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class NewFXMain extends Application {
    
    public static final int ESCENA_PRINCIPAL=0;
    public static final int ESCENA_NUEVO_CLIENTE=1;
    
    private static Stage primaryStage;
    private static NewFXMain main;
    
    @Override
    public void start(Stage primaryStage) {
        NewFXMain.primaryStage=primaryStage;
        main=this;
        mostrarEscena(ESCENA_PRINCIPAL);
    }
    
    public static void mostrarEscena(int escena){
        switch(escena){
            case ESCENA_PRINCIPAL:
                setEscena("FXML.fxml");
                break;
            case ESCENA_NUEVO_CLIENTE:
                setEscena("FXMLAnyadirCliente.fxml");
                break;
                
        }
    }
    
    private static void setEscena(String escena){
        try{
            Parent root = FXMLLoader.load(main.getClass().getResource(escena));
            
            Scene scene = new Scene(root);
            
            primaryStage.setTitle("Hello World!");
            primaryStage.setScene(scene);
            primaryStage.show();
            } catch (IOException ex) {
            Logger.getLogger(NewFXMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
