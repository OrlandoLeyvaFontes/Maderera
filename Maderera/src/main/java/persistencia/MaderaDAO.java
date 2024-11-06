
package persistencia;

import entidades.Maderera;
import java.util.ArrayList;
import java.util.List;

public class MaderaDAO implements IMadereraDAO {

private List<Maderera> maderas;
    
    //
    public MaderaDAO() {
        this.maderas = new ArrayList<>();
    }

     public void agregarMadera(Maderera madera) {
        // Verificar si la madera ya existe
        boolean existe = maderas.stream()
                .anyMatch(m -> m.getId() == madera.getId());
        
        if (!existe) {
            maderas.add(madera);
        }
    }
     
    public boolean actualizarStock(int id, int cantidadComprada) {
        for (Maderera madera : maderas) {
            if (madera.getId() == id) {
                int nuevoStock = madera.getCantidad() - cantidadComprada;
                if (nuevoStock >= 0) {
                    madera.setCantidad(nuevoStock);
                    return true;
                }
            }
        }
        return false;
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
