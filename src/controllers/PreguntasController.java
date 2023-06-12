/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import modelos.Juego;

/**
 * FXML Controller class
 *
 * @author Sergio
 */
public class PreguntasController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    
    
    @FXML
    Label lblpregunta;
    
    @FXML
    ToggleButton btnrespuesta1;
    
    @FXML
    ToggleButton btnrespuesta2;
    
    @FXML
    ToggleButton btnrespuesta3;
    
    @FXML
    Button btnsiguiente;
    
    
    private int respuestaSeleccionada=-1;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        this.llenarDatos();
        
    }    
    @FXML
    public void seleccionarPrimeraRespuesta(ActionEvent actionEvent){
        this.respuestaSeleccionada = 0;
        System.out.println("Respueta seleccionada: "+ this.respuestaSeleccionada);
    }
    @FXML
    public void seleccionarSegundaRespuesta(ActionEvent actionEvent){
       this.respuestaSeleccionada = 1;
       System.out.println("Respueta seleccionada: "+ this.respuestaSeleccionada);
    }
    @FXML
    public void seleccionarTerceraRespuesta(ActionEvent actionEvent){
        this.respuestaSeleccionada = 2;
        System.out.println("Respueta seleccionada: "+ this.respuestaSeleccionada);
    }
    @FXML
    public void siguientePregunta(){
        if(!(this.respuestaSeleccionada>=0 && this.respuestaSeleccionada <=2)){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error");
            alerta.setContentText("Debes seleccionar alguna opción para poder pasar a la siguiente pregunta!");
            alerta.showAndWait();
            return;
        }
            
        main.main.juego.siguientePregunta(respuestaSeleccionada);
        this.llenarDatos();
    }
    
    private void llenarDatos(){
        
        if(!main.main.juego.eljuegotermino()){
            this.respuestaSeleccionada = -1;
            this.lblpregunta.setText(main.main.juego.preguntaActual().getEnunciado());
            this.btnrespuesta1.setText(main.main.juego.preguntaActual().getOpciones().get(0));
            this.btnrespuesta2.setText(main.main.juego.preguntaActual().getOpciones().get(1));
            this.btnrespuesta3.setText(main.main.juego.preguntaActual().getOpciones().get(2));
            this.btnrespuesta1.setSelected(false);
            this.btnrespuesta2.setSelected(false);
            this.btnrespuesta3.setSelected(false);
            
        }else {
            System.out.println("El juego terminó!");
          Alert alert = new Alert(Alert.AlertType.INFORMATION); 
          alert.setTitle("El juego terminó");
          alert.setContentText("Obtuviste "+main.main.juego.jugadorActual().getPuntaje()+" respuestas correctas de "+main.main.juego.getPreguntas().size());
          alert.showAndWait();
          this.btnsiguiente.setDisable(true);
        }
        
        
        
        
        
    }
    
}
