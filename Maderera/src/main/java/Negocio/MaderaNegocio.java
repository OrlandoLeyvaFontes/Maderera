/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import dto.MadereraDTO;
import entidades.Maderera;
import java.util.List;
import java.util.stream.Collectors;
import persistencia.IMadereraDAO;

/**
 *
 * @author Oley
 */
public class MaderaNegocio implements IMadereraNegocio {

    private IMadereraDAO iMadereraDAO;

    public MaderaNegocio(IMadereraDAO iMadereraDAO) {
        this.iMadereraDAO = iMadereraDAO;
    }

    public void agregarMadera(MadereraDTO madereraDTO) {
        Maderera maderera = new Maderera();
        maderera.setId(madereraDTO.getId());
        maderera.setNombre(madereraDTO.getNombre());
        maderera.setDescripcion(madereraDTO.getDescripcion());
        maderera.setCantidad(madereraDTO.getCantidad());
        iMadereraDAO.agregarMadera(maderera);
    }

    public List<MadereraDTO> obtenerMaderas() {
        List<Maderera> maderas = iMadereraDAO.obtenerMaderas();
        return maderas.stream()
                .map(m -> new MadereraDTO(m.getId(), m.getNombre(), m.getDescripcion(), m.getCantidad()))
                .collect(Collectors.toList());
    }

}
