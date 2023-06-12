/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package main;

import controllers.PreguntasController;
import java.io.IOException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import modelos.Juego;
import modelos.Pregunta;


/**
 *
 * @author Sergio
 */
public class main extends Application {
    
    public static Stage currentStage;
    
    public static Juego juego;
    
    
    public ArrayList<Pregunta> preguntas; 
    
 
    
    @Override
    public void start(Stage stage) throws Exception {
        
        juego = new Juego();
        
        this.crearPreguntas();
        
        Parent root = FXMLLoader.load(getClass().getResource("../views/Login.fxml"));
        
        Scene scene = new Scene(root, 674, 482);
        
        stage.setScene(scene);
        currentStage = stage;
        stage.show();
        
    }
    
    
    private void crearPreguntas(){
        
        
        
        Pregunta pregunta1 = new Pregunta("¿En qué año colapsó la Unión Soviética?");
        pregunta1.agregarOpcion("1991");
        pregunta1.agregarOpcion("1982");
        pregunta1.agregarOpcion("1998");
        pregunta1.setRespuestaCorrecta(0);
       
        juego.agregarPregunta(pregunta1);
        
        Pregunta pregunta2 = new Pregunta("¿Cuál fue el primer metal que el hombre empleó?");
        pregunta2.agregarOpcion("Oro");
        pregunta2.agregarOpcion("Platino");
        pregunta2.agregarOpcion("Cobre");
        pregunta2.setRespuestaCorrecta(2);
        
        
        
        juego.agregarPregunta(pregunta2);
        
        Pregunta pregunta3 = new Pregunta("¿A través de qué rio africano se alzó el antiguo Egipto?");
        pregunta3.agregarOpcion("Tigris");
        pregunta3.agregarOpcion("Nilo");
        pregunta3.agregarOpcion("Éufrates");
        pregunta3.setRespuestaCorrecta(1);
        
        juego.agregarPregunta(pregunta3);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public static void closeWindow(){
        currentStage.close();
    }
    
}
