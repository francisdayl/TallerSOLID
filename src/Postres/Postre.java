/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import Adicionales.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author Marco
 */
public class Postre {
    protected String sabor;
    protected double precioParcial;
    protected ArrayList<Aderezo> aderezos;

    public Postre(){       
    }
    
    public Postre(String sabor) {
        this.sabor = sabor;
        aderezos = new ArrayList<>();
    }
    
    //funciones similares entre Helado y Postre
    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
        return precioFinal;
    }
    
    public String showPrecioFinal(){
        return "Precio Final: $ " + calcularPrecioFinal();
    }

    //getter and setter -------------------------------------------------------
    
    public double getPrecioParcial() {
        return precioParcial;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setPrecioParcial(double precioParcial) {
        this.precioParcial = precioParcial;
    }

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }

    public void setAderezos(ArrayList<Aderezo> aderezos) {
        this.aderezos = aderezos;
    }
    public static void anadirAderezo(Postre p,Aderezo aderezo){
        p.getAderezos().add(aderezo);
    }
    
    public static void quitarAderezo(Postre p,Aderezo aderezo){
        p.getAderezos().remove(aderezo);
    }
    
    
}
