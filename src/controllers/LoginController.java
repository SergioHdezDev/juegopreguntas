/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javax.swing.plaf.RootPaneUI;
import main.main;
import modelos.Juego;
import modelos.Jugador;


/**
 *
 * @author Sergio
 */
public class LoginController implements Initializable {
    
    @FXML
    AnchorPane fondo;
    @FXML
    private Label label;
    @FXML
    private Label lblBienvenida;
    @FXML
    private Label lblUsername;
    
    @FXML
    TextField username;
    
    @FXML
    Button botonIniciar;
    
    @FXML
    StackPane panelboton;
    
    Stage ventanaPreguntas = new Stage();
    
    @FXML
    private void iniciarJuego(ActionEvent event) {
           
        if(username.getText().isEmpty()){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText(null);
            alerta.setTitle("Error");
            alerta.setContentText("Debe ingresar un nombre para poder continuar!");
            alerta.showAndWait();
            return;
        }
        try{
            Parent root = FXMLLoader.load(getClass().getResource("../views/Preguntas.fxml"));
            ventanaPreguntas.setTitle("Preguntas!");
            ventanaPreguntas.setScene(new Scene(root,  674, 482));
            ventanaPreguntas.show();
            Jugador jugador = new Jugador(this.username.getText());
            main.juego.agregarJugador(jugador);
            main.currentStage.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        Image imagen = new Image("imagenes/iniciar3.png");
        ImageView imageView = new ImageView(imagen);
        imageView.setFitWidth(100);
        imageView.setFitHeight(100);
        
        botonIniciar.setGraphic(imageView);
      
    }  
    
    
    
    
    
   
    
}
