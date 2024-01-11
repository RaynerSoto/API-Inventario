package cu.edu.rayner.apisinventario.dto;

import java.util.UUID;

public class SeccionesDto {
    private UUID identificador;
    private String nombre_seccion;
    private Double metros_cuadrados;

    public SeccionesDto() {
    }

    public SeccionesDto(UUID identificador, String nombre_seccion, Double metros_cuadrados) {
        this.identificador = identificador;
        this.nombre_seccion = nombre_seccion;
        this.metros_cuadrados = metros_cuadrados;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public void setIdentificador(UUID identificador) {
        this.identificador = identificador;
    }

    public String getNombre_seccion() {
        return nombre_seccion;
    }

    public void setNombre_seccion(String nombre_seccion) {
        this.nombre_seccion = nombre_seccion;
    }

    public Double getMetros_cuadrados() {
        return metros_cuadrados;
    }

    public void setMetros_cuadrados(Double metros_cuadrados) {
        this.metros_cuadrados = metros_cuadrados;
    }
}
