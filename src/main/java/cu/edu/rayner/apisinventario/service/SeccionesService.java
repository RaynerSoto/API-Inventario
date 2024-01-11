package cu.edu.rayner.apisinventario.service;

import cu.edu.rayner.apisinventario.dto.SeccionesDto;

import java.util.ArrayList;

public interface SeccionesService {
    public void insertar_seccion(SeccionesDto seccionesDto) throws Exception;
    public void modificar_seccion(SeccionesDto seccionesDto) throws Exception;
    public void eliminar_seccion(SeccionesDto seccionesDto) throws Exception;
    public ArrayList<SeccionesDto> listado_secciones() throws Exception;
    public SeccionesDto obtener_secciones_UUID(SeccionesDto sec) throws Exception;
    public SeccionesDto obtener_secciones_nombre(SeccionesDto sec) throws Exception;
}
