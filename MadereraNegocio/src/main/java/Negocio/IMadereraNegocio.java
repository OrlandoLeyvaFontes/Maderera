
package Negocio;

import dto.MadereraDTO;
import java.util.List;

public interface IMadereraNegocio {
    List<MadereraDTO> obtenerMaderas();
    double calcularTotal(int id, int cantidad);
    boolean actualizarInventario(int id, int cantidadCompra);
}
