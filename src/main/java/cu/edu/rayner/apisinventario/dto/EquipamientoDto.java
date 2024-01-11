package cu.edu.rayner.apisinventario.dto;

import cu.edu.rayner.apisinventario.enums.Colores;
public class EquipamientoDto extends ProductoDto{
    public EquipamientoDto() {
    }

    public EquipamientoDto(Double tamanno, Colores colores, Double precio, boolean fragile, String envase, long lote, String nombre_seccion) {
        super(tamanno, colores, precio, fragile, envase, lote, nombre_seccion);
    }
}
