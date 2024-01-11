package cu.edu.rayner.apisinventario.dto;

import cu.edu.rayner.apisinventario.enums.Colores;
public class Materiales_electricosDto extends ProductoDto{
    private double voltage;

    public Materiales_electricosDto() {
    }

    public Materiales_electricosDto(Double tamanno, Colores colores, Double precio, boolean fragile, String envase, long lote, String nombre_seccion) {
        super(tamanno, colores, precio, fragile, envase, lote, nombre_seccion);
    }

    public Materiales_electricosDto(double voltage) {
        this.voltage = voltage;
    }

    public Materiales_electricosDto(Double tamanno, Colores colores, Double precio, boolean fragile, String envase, long lote, String nombre_seccion, double voltage) {
        super(tamanno, colores, precio, fragile, envase, lote, nombre_seccion);
        this.voltage = voltage;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }
}
