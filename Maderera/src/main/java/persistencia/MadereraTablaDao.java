
package persistencia;

import entidades.Maderera;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class MadereraTablaDao extends AbstractTableModel {

    private final List<Maderera> maderas;
    private final String[] columnNames = {"ID", "Nombre", "Descripción", "Cantidad", "Precio Unitario"};

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
            case 4:
                return String.format("$%.2f", madera.getPrecioUnitario()); // Precio en decimales, 2 después del punto.
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    // Método para actualizar los datos de la tabla
    public void actualizarDatos(List<Maderera> nuevasMaderas) {
        this.maderas.clear();
        this.maderas.addAll(nuevasMaderas);
        fireTableDataChanged();
    }

    // Método para obtener una madera específica
    public Maderera getMaderaAt(int row) {
        if (row >= 0 && row < maderas.size()) {
            return maderas.get(row);
        }
        return null;
    }

    // Método para actualizar una madera específica
    public void actualizarMadera(int row, Maderera madera) {
        if (row >= 0 && row < maderas.size()) {
            maderas.set(row, madera);
            fireTableRowsUpdated(row, row);
        }
    }
}
