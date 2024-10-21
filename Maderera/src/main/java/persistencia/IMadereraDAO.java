/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import entidades.Maderera;
import java.util.List;

/**
 *
 * @author Oley
 */
public interface IMadereraDAO {

    public void agregarMadera(Maderera madera);

    public List<Maderera> obtenerMaderas();

}
