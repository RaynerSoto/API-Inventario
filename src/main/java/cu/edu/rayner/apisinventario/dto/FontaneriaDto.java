package cu.edu.rayner.apisinventario.dto;

import cu.edu.rayner.apisinventario.enums.Colores;
import cu.edu.rayner.apisinventario.enums.Envase;

public class FontaneriaDto extends ProductoDto{
    private Double medidas;

    public FontaneriaDto() {
    }

    public FontaneriaDto(Double tamanno, Colores colores, Double precio, boolean fragile, Envase envase, long lote, String nombre_seccion) {
        super(tamanno, colores, precio, fragile, envase, lote, nombre_seccion);
    }

    public FontaneriaDto(Double medidas) {
        this.medidas = medidas;
    }

    public FontaneriaDto(Double tamanno, Colores colores, Double precio, boolean fragile, Envase envase, long lote, String nombre_seccion, Double medidas) {
        super(tamanno, colores, precio, fragile, envase, lote, nombre_seccion);
        this.medidas = medidas;
    }

    public Double getMedidas() {
        return medidas;
    }

    public void setMedidas(Double medidas) {
        this.medidas = medidas;
    }
}