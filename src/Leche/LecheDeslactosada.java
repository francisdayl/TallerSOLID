/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leche;

import Postres.*;

/**
 *
 * @author Pedro Mendoza
 */
public class LecheDeslactosada extends Leche {

    @Override
    public void usarPostre(Object postre) {
        if(postre.getClass()== Pastel.class){
            System.out.println("No se puede usar Leche Deslactosada\nUsando leche Descremada");
        }else{
            System.out.println("Usando Leche Deslactosada");
        }
    }
    
   
        
}
