package cu.edu.rayner.apisinventario.dto;

import cu.edu.rayner.apisinventario.enums.Colores;
public class CerrajeriaDto extends ProductoDto{
    public CerrajeriaDto() {
    }

    public CerrajeriaDto(Double tamanno, Colores colores, Double precio, boolean fragile, String envase, long lote, String nombre_seccion) {
        super(tamanno, colores, precio, fragile, envase, lote, nombre_seccion);
    }
}
