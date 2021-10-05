/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import frontend.Principal;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class AnalisisLexico {
    char [] cadena;
    String texto;
    Principal front;
    public static void main(String[] args) {
        Principal front= new Principal();
        front.setVisible(true);
        AnalisisLexico a = new AnalisisLexico();
        a.datos();
    }
    /**
     * Metodo que evalua la cadena de datos.
     */
    public  void datos(){
        texto=front.area.getName();
        cadena=texto.toCharArray();
    }

}
