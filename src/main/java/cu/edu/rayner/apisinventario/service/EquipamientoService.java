package cu.edu.rayner.apisinventario.service;

import cu.edu.rayner.apisinventario.dto.EquipamientoDto;

import java.util.ArrayList;

public interface EquipamientoService {
    public void insertar_equipamiento(EquipamientoDto equipamientoDto) throws Exception;

    public void modificar_equipamiento(EquipamientoDto equipamientoDto) throws Exception;

    public void eliminar_equipamiento(Long id) throws Exception;

    public ArrayList<EquipamientoDto> listado_equipamientos() throws Exception;

    public ArrayList<EquipamientoDto> listado_equipamientos_seccion(String nombre_seccion) throws Exception;

    ArrayList<EquipamientoDto> listado_equipamientos_lote_mayor(Long valor) throws Exception;

    ArrayList<EquipamientoDto> listado_equipamientos_fragile(Boolean fragile) throws Exception;

    ArrayList<EquipamientoDto> listado_equipamientos_color(String color) throws Exception;

    ArrayList<EquipamientoDto> listado_equipamientos_color(Double minimo, Double maximo) throws Exception;

    ArrayList<EquipamientoDto> listado_equipamientos_envase(String envase) throws Exception;
}
