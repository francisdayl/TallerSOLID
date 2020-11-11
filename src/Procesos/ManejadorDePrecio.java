/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Postres.Postre;
import Postres.Helado;
import Postres.Pastel;
/**
 *
 * @author erick
 */
public class ManejadorDePrecio {

    public static double calcularPrecioFinal(Object Postre){
        if(Postre.getClass() == Helado.class){
            Helado iceCone = (Helado)Postre;
            return (iceCone.getPrecioParcial()+(iceCone.getPrecioParcial()*0.12)) + (iceCone.getAderezos().size()*0.50);
        }else if(Postre.getClass() == Pastel.class){
            Pastel cake = (Pastel)Postre;
            return (cake.getPrecioParcial()+(cake.getPrecioParcial()*0.12)) + (cake.getAderezos().size()*0.50);
        }else{
            return 0;
        }
    }
    
    public static String showPrecioFinal(Object Postre){
        if(Postre != null){
            return "Precio Final: $ " + calcularPrecioFinal(Postre);
        }else{
            return "Precio Final: $error";
        }
    }
}
