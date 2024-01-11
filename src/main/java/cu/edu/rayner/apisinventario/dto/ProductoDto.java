package cu.edu.rayner.apisinventario.dto;

import cu.edu.rayner.apisinventario.enums.Colores;
import cu.edu.rayner.apisinventario.enums.Envase;
import org.springframework.lang.NonNull;

import java.util.UUID;

public abstract class ProductoDto {
    @NonNull
    private Double tamanno;
    @NonNull
    private Colores colores;
    @NonNull
    private Double precio;
    @NonNull
    private boolean fragile;
    @NonNull
    private Envase envase;
    @NonNull
    private long lote;// No tenìa muy asumido que era un lote, por tanto asumì que era la cantidad

    private String nombre_seccion;

    public ProductoDto() {
    }

    public ProductoDto(Double tamanno, Colores colores, Double precio, boolean fragile, Envase envase, long lote,String nombre_seccion) {
        this.tamanno = tamanno;
        this.colores = colores;
        this.precio = precio;
        this.fragile = fragile;
        this.envase = envase;
        this.lote = lote;
        this.nombre_seccion = nombre_seccion;
    }



    public Double getTamanno() {
        return tamanno;
    }

    public void setTamanno(Double tamanno) {
        this.tamanno = tamanno;
    }

    public Colores getColores() {
        return colores;
    }

    public void setColores(Colores colores) {
        this.colores = colores;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public boolean isFragile() {
        return fragile;
    }

    public void setFragile(boolean fragile) {
        this.fragile = fragile;
    }

    public Envase getEnvase() {
        return envase;
    }

    public void setEnvase(Envase envase) {
        this.envase = envase;
    }

    public long getLote() {
        return lote;
    }

    public void setLote(long lote) {
        this.lote = lote;
    }

    public String getNombre_seccion() {
        return nombre_seccion;
    }

    public void setNombre_seccion(String nombre_seccion) {
        this.nombre_seccion = nombre_seccion;
    }
}
