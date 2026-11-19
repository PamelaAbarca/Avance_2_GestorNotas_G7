package avance.pkg2.proyecto;

public class Estudiantes {
    private String id;
    private String nombre;
    private String carrera;
    private Curso[] cursos;
    private int n_Cursos;

    public Estudiantes(String id, String nombre, String carrera) {
        this.id = id;
        this.nombre = nombre;
        this.carrera = carrera;
        this.cursos = new Curso[99];
        this.n_Cursos = 0;
    }

    public void nuevoCurso(Curso curs) {
        if (n_Cursos < cursos.length) {
            cursos[n_Cursos] = curs;
            n_Cursos++;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Curso[] getCursos() {
        return cursos;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }

    public int getN_Cursos() {
        return n_Cursos;
    }
}