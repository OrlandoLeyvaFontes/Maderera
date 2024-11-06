
package persistencia;

import entidades.Maderera;
import java.util.List;

public interface IMadereraDAO {
    void agregarMadera(Maderera maderera);
    List<Maderera> obtenerMaderas();
    boolean actualizarStock(int id, int cantidadComprada);
}
