package avance.pkg2.proyecto;

public class Materias {
    private String codigo;
    private String nombre;
    private Evaluaciones[] listaEvaluaciones;
    private int n_Evaluaciones;

    public Materias(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.listaEvaluaciones = new Evaluaciones[99];
        this.n_Evaluaciones = 0;
    }

    public void agregarEvaluacion(Evaluaciones eval) {
        if (n_Evaluaciones < listaEvaluaciones.length) {
            listaEvaluaciones[n_Evaluaciones] = eval;
            n_Evaluaciones++;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Evaluaciones[] getListaEvaluaciones() {
        return listaEvaluaciones;
    }

    public void setListaEvaluaciones(Evaluaciones[] listaEvaluaciones) {
        this.listaEvaluaciones = listaEvaluaciones;
    }

    public int getN_Evaluaciones() {
        return n_Evaluaciones;
    }
}