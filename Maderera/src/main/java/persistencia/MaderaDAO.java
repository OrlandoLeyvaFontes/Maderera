/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidades.Maderera;
import java.util.ArrayList;
import java.util.List;
import persistencia.IMadereraDAO;

/**
 *
 * @author Oley
 */
public class MaderaDAO implements IMadereraDAO {

private static List<Maderera> maderas = new ArrayList<>();
    
    //
    public MaderaDAO() {
        
    }

     public void agregarMadera(Maderera madera) {
        // Verificar si la madera ya existe
        boolean existe = maderas.stream()
                .anyMatch(m -> m.getId() == madera.getId());
        
        if (!existe) {
            maderas.add(madera);
        }
    }

    public List<Maderera> obtenerMaderas() {
        // Retornar una copia de la lista 
        return new ArrayList<>(maderas);
    }
    
     public void imprimirMaderas() {
        System.out.println("Maderas en la lista:");
        for (Maderera madera : maderas) {
            System.out.println("ID: " + madera.getId() + 
                             ", Nombre: " + madera.getNombre() + 
                             ", Cantidad: " + madera.getCantidad());
        }    
    } 
}
