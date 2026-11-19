package avance.pkg2.proyecto;

public class Curso {
    private Estudiantes estudiante;
    private Materias materia;
    private Calificaciones[] listaCalificaciones;
    private int n_Calif;

    public Curso(Estudiantes estudiante, Materias materia) {
        this.estudiante = estudiante;
        this.materia = materia;
        this.listaCalificaciones = new Calificaciones[99];
        this.n_Calif = 0;
    }

    public void nuevaCalificacion(Calificaciones calif) {
        if (n_Calif < listaCalificaciones.length) {
            listaCalificaciones[n_Calif] = calif;
            n_Calif++;
        }
    }

    public Estudiantes getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiantes estudiante) {
        this.estudiante = estudiante;
    }

    public Materias getMateria() {
        return materia;
    }

    public void setMateria(Materias materia) {
        this.materia = materia;
    }

    public Calificaciones[] getListaCalificaciones() {
        return listaCalificaciones;
    }

    public void setListaCalificaciones(Calificaciones[] listaCalificaciones) {
        this.listaCalificaciones = listaCalificaciones;
    }

    public int getN_Calif() {
        return n_Calif;
    }
}