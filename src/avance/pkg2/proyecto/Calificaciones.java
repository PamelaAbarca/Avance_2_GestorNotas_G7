package avance.pkg2.proyecto;

public class Calificaciones {
    private Evaluaciones evaluacion;
    private double nota;

    public Calificaciones(Evaluaciones evaluacion, double nota) {
        this.evaluacion = evaluacion;
        this.nota = nota;
    }

    public Evaluaciones getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(Evaluaciones evaluacion) {
        this.evaluacion = evaluacion;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 100) {
            this.nota = nota;
        }
    }
}