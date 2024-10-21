/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidades.Maderera;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Oley
 */
public class MadereraTablaDao extends AbstractTableModel {

    private final List<Maderera> maderas;
    private final String[] columnNames = {"ID", "Nombre", "Descripción", "Cantidad"};

    public MadereraTablaDao(List<Maderera> maderas) {
        this.maderas = maderas;
    }

    @Override
    public int getRowCount() {
        return maderas.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Maderera madera = maderas.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return madera.getId();
            case 1:
                return madera.getNombre();
            case 2:
                return madera.getDescripcion();
            case 3:
                return madera.getCantidad();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}
