package cu.edu.rayner.apisinventario.service;

import cu.edu.rayner.apisinventario.dto.EquipamientoDto;

import java.util.ArrayList;

public interface EquipamientoService {
    public void insertar_equipamiento(EquipamientoDto equipamientoDto) throws Exception;
    public void modificar_equipamiento(EquipamientoDto equipamientoDto) throws Exception;
    public void eliminar_equipamiento(EquipamientoDto equipamientoDto) throws Exception;
    public ArrayList<EquipamientoDto> listado_equipamientos() throws Exception;
    public EquipamientoDto obtener_equipamientoes_nombre(EquipamientoDto sec) throws Exception;
}
