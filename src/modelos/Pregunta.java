package modelos;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sergio
 */
public class Pregunta {
    
    public String enunciado; 
    public ArrayList opciones = new ArrayList<String>(); 
    public int respuestaCorrecta;

    public Pregunta(String enunciado){
        this.enunciado = enunciado;
    }
    public Pregunta(String enunciado, ArrayList<String> opciones, int respuestaCorrecta) {
        this.enunciado = enunciado;
        this.opciones = opciones;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public ArrayList<String> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<String> opciones) {
        this.opciones = opciones;
    }
    
    public void agregarOpcion(String nuevaopcion){
        this.opciones.add(nuevaopcion);
    }

    public int getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(int respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }
    
    public boolean esCorrecta(int respuesta){
        return respuesta == this.respuestaCorrecta;
    }

    
    
    
}
