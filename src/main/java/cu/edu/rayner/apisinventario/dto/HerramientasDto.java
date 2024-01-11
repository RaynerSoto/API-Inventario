package cu.edu.rayner.apisinventario.dto;

import cu.edu.rayner.apisinventario.enums.Colores;
import cu.edu.rayner.apisinventario.enums.Envase;

public class HerramientasDto extends ProductoDto{
    public HerramientasDto() {
    }

    public HerramientasDto(Double tamanno, Colores colores, Double precio, boolean fragile, Envase envase, long lote, String nombre_seccion) {
        super(tamanno, colores, precio, fragile, envase, lote, nombre_seccion);
    }
}
