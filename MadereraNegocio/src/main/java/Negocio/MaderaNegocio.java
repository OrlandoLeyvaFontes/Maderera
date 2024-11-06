
package Negocio;

import dto.MadereraDTO;
import entidades.Maderera;
import java.util.List;
import java.util.stream.Collectors;
import persistencia.IMadereraDAO;

public class MaderaNegocio implements IMadereraNegocio {
    private final IMadereraDAO madereraDAO;
    
    public MaderaNegocio(IMadereraDAO madereraDAO) {
        this.madereraDAO = madereraDAO;
        inicializarDatosPredefinidos();
    }
    
    private void inicializarDatosPredefinidos() {
        // Solo inicializar si el DAO está vacío
        if (madereraDAO.obtenerMaderas().isEmpty()) {
            madereraDAO.agregarMadera(new Maderera(1, "Pino", "Madera de pino tratada", 100, 45.00));
            madereraDAO.agregarMadera(new Maderera(2, "Roble", "Madera de roble maciza", 75, 89.00));
            madereraDAO.agregarMadera(new Maderera(3, "Cedro", "Madera de cedro rojo", 50, 75.00));
            madereraDAO.agregarMadera(new Maderera(4, "Caoba", "Madera de caoba premium", 25, 120.00));
            madereraDAO.agregarMadera(new Maderera(5, "Nogal", "Madera de nogal oscuro", 30, 95.00));
        }
    }

    @Override
    public List<MadereraDTO> obtenerMaderas() {
        List<Maderera> maderas = madereraDAO.obtenerMaderas();
        return maderas.stream()
                     .map(m -> new MadereraDTO(m.getId(), m.getNombre(), m.getDescripcion(), 
                                             m.getCantidad(), m.getPrecioUnitario()))
                     .collect(Collectors.toList());
    }
    
    public double calcularTotal(int id, int cantidad) {
        // Buscar la madera por id
        for (MadereraDTO madera : obtenerMaderas()) {
            if (madera.getId() == id) {
                return madera.getPrecioUnitario() * cantidad;
            }
        }
        return 0.0;
    }

    @Override
    public boolean actualizarInventario(int id, int cantidadCompra) {
        return madereraDAO.actualizarStock(id, cantidadCompra);
    }
}


