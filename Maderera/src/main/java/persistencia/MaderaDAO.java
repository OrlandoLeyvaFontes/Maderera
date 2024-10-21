/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidades.Maderera;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oley
 */
public class MaderaDAO implements IMadereraDAO {

    private List<Maderera> maderas;

    public MaderaDAO() {
        maderas = new ArrayList<>();
    }

    public void agregarMadera(Maderera madera) {
        maderas.add(madera);
    }

    public List<Maderera> obtenerMaderas() {
        return maderas;
    }
}
