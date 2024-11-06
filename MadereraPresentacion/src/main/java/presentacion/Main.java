
package presentacion;

import Negocio.IMadereraNegocio;
import Negocio.MaderaNegocio;
import persistencia.IMadereraDAO;
import persistencia.MaderaDAO;

public class Main {

    public static void main(String[] args) {
        IMadereraDAO iMadereraDAO = new MaderaDAO();
        IMadereraNegocio iMadereraNegocio = new MaderaNegocio(iMadereraDAO);

        InicioSesion inicioSesion = new InicioSesion(iMadereraNegocio);
        inicioSesion.setVisible(true);
        
    }
}
