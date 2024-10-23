/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

import Negocio.IMadereraNegocio;
import Negocio.MaderaNegocio;
import persistencia.IMadereraDAO;
import persistencia.MaderaDAO;

/**
 *
 * @author Oley
 */
public class Main {

    public static void main(String[] args) {
        IMadereraDAO iMadereraDAO = new MaderaDAO();
        IMadereraNegocio iMadereraNegocio = new MaderaNegocio(iMadereraDAO);

        InicioSesion inicioSesion = new InicioSesion(iMadereraNegocio);
        inicioSesion.setVisible(true);
        
    }
}
