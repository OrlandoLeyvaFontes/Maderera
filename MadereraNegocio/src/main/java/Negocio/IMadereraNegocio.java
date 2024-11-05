/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Negocio;

import dto.MadereraDTO;
import entidades.Maderera;
import java.util.List;

/**
 *
 * @author Oley
 */
public interface IMadereraNegocio {

    public Maderera agregarMadera(MadereraDTO madereraDTO);

    public List<MadereraDTO> obtenerMaderas();
}
