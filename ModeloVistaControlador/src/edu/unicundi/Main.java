/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi;

import Modelo.Modelo;
import Vista.Vista;
import controlador.Controlador;

/**
 *
 * @author Dairo Estiben Beltrán
 *
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instancia de cada objeto
        Modelo mod = new Modelo();
        Vista view = new Vista();
        
        Controlador ctrl = new Controlador(view, mod);
        ctrl.iniciar();
        view.setVisible(true);
    }
    
}
