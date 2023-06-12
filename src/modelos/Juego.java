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
public class Juego {
    
    public ArrayList<Pregunta> preguntas = new ArrayList();
    public ArrayList<Jugador> jugadores = new ArrayList(); 
    public int indexPreguntaActual=0; 
    public int indexJugadorActual;
    
    public Juego(){
        this.indexPreguntaActual=0;
    }
    
    public ArrayList<Pregunta> getPreguntas(){
        return this.preguntas;
    }
    
    public ArrayList<Jugador> getJugadores(){
        return this.jugadores;
    }
    
    public void agregarPregunta(Pregunta pregunta){
        preguntas.add(pregunta);
    }
    
    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
        this.indexJugadorActual = jugadores.size()-1;
    }
    
    public int siguientePregunta(int respuesta){
        Pregunta preguntaActual = this.preguntas.get(this.indexPreguntaActual);
        Jugador jugadorActual = this.jugadores.get(this.indexJugadorActual);
        
        if(preguntaActual.esCorrecta(respuesta)){
            jugadorActual.incrementarPuntaje(1);
        }
        
        
        this.indexPreguntaActual = this.indexPreguntaActual+1; 
        return this.indexPreguntaActual;
    }
    
    public boolean eljuegotermino(){
        return this.indexPreguntaActual==this.preguntas.size();
    }
    
    public Pregunta preguntaActual(){
        return this.preguntas.get(this.indexPreguntaActual);
    }
    
    public Jugador jugadorActual(){
        return this.jugadores.get(indexJugadorActual);
    }
    
}
