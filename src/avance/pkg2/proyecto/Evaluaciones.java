package avance.pkg2.proyecto;

public class Evaluaciones {
    private String item;
    private double porcentaje;

    public Evaluaciones(String item, double porcentaje) {
        this.item = item;
        this.porcentaje = porcentaje;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 100) {
            this.porcentaje = porcentaje;
        }
    }
}