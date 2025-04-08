/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

import javax.swing.JButton;

/**
 *
 * @author JABER
 */
public class BotonContador extends JButton  {
    // Propiedades
private int pulsaciones;

// Constructor
public BotonContador() {
    pulsaciones = 0;
}

// Métodos

// Asigna una cantidad de pulsaciones
public void setPulsaciones(int p) {
    pulsaciones = p;
}

// Devuelve las pulsaciones del botón
public int getPulsaciones() {
    return pulsaciones;
}

// Incrementa en uno las pulsaciones
public void incrementa() {
    pulsaciones++;
}

// Decrementa en uno las pulsaciones
public void decrementa() {
    
        pulsaciones--;
    
}

// Pone las pulsaciones a cero
public void reiniciar() {
    pulsaciones = 0;
}

// Aumenta las pulsaciones en una cantidad c
public void aumenta(int c) {
   
        pulsaciones += c;
    
}

// Disminuye las pulsaciones en una cantidad c
public void disminuye(int c) {
   
        pulsaciones -= c;
    
} 
    
}
