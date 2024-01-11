package cu.edu.rayner.apisinventario.dto;

import cu.edu.rayner.apisinventario.enums.Colores;
public class HerramientasDto extends ProductoDto{
    public HerramientasDto() {
    }

    public HerramientasDto(Double tamanno, Colores colores, Double precio, boolean fragile, String envase, long lote, String nombre_seccion) {
        super(tamanno, colores, precio, fragile, envase, lote, nombre_seccion);
    }

    public HerramientasDto(Long id, Double tamanno, Colores colores, Double precio, boolean fragile, String envase, long lote, String nombre_seccion) {
        super(id, tamanno, colores, precio, fragile, envase, lote, nombre_seccion);
    }
}
