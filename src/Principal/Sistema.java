/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Adicionales.Crema;
import Adicionales.Frutilla;
import Postres.*;
import Procesos.*;
import Leche.*;
import static Postres.Postre.anadirAderezo;
import java.util.ArrayList;
/**
 *
 * @author djurado
 */
public class Sistema {
//    public static void main(String [ ] args){
//        // Producir un helado de vainilla y una torta de chocolate, 
//        // a ambos agregarles CREMA y FRUTILLAS
//        // y cambiar el tipo de leche por Leche Descremada
//        // Finalmente mostrar el precio final de cada uno
//        Leche leche = new LecheDeslactosada();
//        ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
//        
//        // Producir Helado
//        Helado helado_vainilla = new Helado("Vainilla");
//        Postre.anadirAderezo(helado_vainilla, Aderezo.CREMA);
//         Postre.anadirAderezo(helado_vainilla, Aderezo.FRUTILLA);
//        System.out.println(helado_vainilla);
//        mnj_leche.cambiarTipoLeche(leche, helado_vainilla);
//        System.out.println(ManejadorDePrecio.showPrecioFinal(helado_vainilla));
//        
//        // Producir Pastel
//        Pastel pastel_chocolate = new Pastel("Chocolate");
//        System.out.println(pastel_chocolate);
//        Postre.anadirAderezo(pastel_chocolate, Aderezo.CREMA);
//        System.out.println(pastel_chocolate);
//        mnj_leche.cambiarTipoLeche(leche, pastel_chocolate);
//        System.out.println(ManejadorDePrecio.showPrecioFinal(pastel_chocolate));
        
    public static void main(String[] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Deslactosada
        ArrayList<Postre> arrPostres = new ArrayList<>();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
        //Cambiar tipo de leche
        mnj_leche.cambiarTipoLeche(new LecheDeslactosada(), arrPostres);
        // Producir Helado
        Postre helado_vainilla = new Helado("Vainilla");
        arrPostres.add(helado_vainilla);
        // Producir Pastel
        Postre pastel_chocolate = new Pastel("Chocolate");
        arrPostres.add(pastel_chocolate);
        
        arrPostres.forEach(postre -> {
            anadirAderezo(postre, new Crema());
            anadirAderezo(postre, new Frutilla());
            System.out.println(postre);
            mnj_leche.cambiarTipoLeche(new LecheDeslactosada(),postre);
            System.out.println(ManejadorDePrecio.showPrecioFinal(postre));
        });        
        
    }

        
        
    }

