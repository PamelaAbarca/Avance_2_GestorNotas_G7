package avance.pkg2.proyecto;

import javax.swing.JOptionPane;

public class GestorNotas {

    private static final String TITULO = "Gestor de Notas Académicas";

    // Poner en true cuando ya exista seleccionarEstudiante() funcional.
    // Mientras sea false se puede navegar por todos los menús para probarlos.
    private static final boolean EXIGIR_ESTUDIANTE_ACTIVO = false;

    private static String estudianteActivo = null;

    //Arreglos principales del sistema (integración de modelos)
    private static Estudiantes[] listaEstudiantes = new Estudiantes[99];
    private static int totalEstudiantes = 0;
    private static Materias[] listaMaterias = new Materias[99];
    private static int totalMaterias = 0;
    
    // Nombres de los menús
    private static final String[] MENU_PRINCIPAL = {
        "1. Gestión de Estudiantes",
        "2. Materias y Evaluaciones",
        "3. Calificaciones",
        "4. Reportes y Diagnóstico",
        "5. Salir del sistema"
    };

    private static final String[] MENU_ESTUDIANTES = {
        "1. Registrar nuevo estudiante",
        "2. Listar estudiantes",
        "3. Seleccionar estudiante activo",
        "4. Modificar datos del estudiante activo",
        "5. Eliminar estudiante",
        "6. Volver al menú principal"
    };

    private static final String[] MENU_MATERIAS = {
        "1. Registrar materia",
        "2. Agregar evaluación a una materia",
        "3. Consultar materias y evaluaciones",
        "4. Eliminar materia",
        "5. Volver al menú principal"
    };

    private static final String[] MENU_CALIFICACIONES = {
        "1. Ingresar nota de una evaluación",
        "2. Modificar nota de una evaluación",
        "3. Eliminar nota de una evaluación",
        "4. Volver al menú principal"
    };

    private static final String[] MENU_REPORTES = {
        "1. Promedio ponderado por materia",
        "2. Promedio general",
        "3. Estado de aprobación por materia",
        "4. Reporte completo de notas",
        "5. Volver al menú principal"
    };

    public static void main(String[] args) {
        menuPrincipal();
    }

    // MENÚS 
    private static void menuPrincipal() {
        boolean salir = false;
        do {
            int opcion = mostrarMenu("Menú principal", MENU_PRINCIPAL);
            switch (opcion) {
                case 0:
                    menuEstudiantes();
                    break;
                case 1:
                    if (hayEstudianteActivo()) {
                        menuMaterias();
                    }
                    break;
                case 2:
                    if (hayEstudianteActivo()) {
                        menuCalificaciones();
                    }
                    break;
                case 3:
                    if (hayEstudianteActivo()) {
                        menuReportes();
                    }
                    break;
                case 4: // Opción 5: Salir del sistema
                    salir = confirmarSalida();
                    break;
                default: // Cancelar o cerrar la ventana
                    salir = false;
                    break;
            }
        } while (!salir);
    }

    private static void menuEstudiantes() {
        boolean volver = false;
        do {
            int opcion = mostrarMenu("Gestión de Estudiantes", MENU_ESTUDIANTES);
            switch (opcion) {
                case 0 ->
                    registrarEstudiante();
                case 1 ->
                    listarEstudiantes();
                case 2 ->
                    seleccionarEstudiante();
                case 3 ->
                    modificarEstudiante();
                case 4 ->
                    eliminarEstudiante();
                default ->
                    volver = true;
            }
        } while (!volver);
    }

    private static void menuMaterias() {
        boolean volver = false;
        do {
            int opcion = mostrarMenu("Materias y Evaluaciones", MENU_MATERIAS);
            switch (opcion) {
                case 0 ->
                    registrarMateria();
                case 1 ->
                    agregarEvaluacion();
                case 2 ->
                    consultarMaterias();
                case 3 ->
                    eliminarMateria();
                default ->
                    volver = true;
            }
        } while (!volver);
    }

    private static void menuCalificaciones() {
        boolean volver = false;
        do {
            int opcion = mostrarMenu("Calificaciones", MENU_CALIFICACIONES);
            switch (opcion) {
                case 0 ->
                    ingresarNota();
                case 1 ->
                    modificarNota();
                case 2 ->
                    eliminarNota();
                default ->
                    volver = true;
            }
        } while (!volver);
    }

    private static void menuReportes() {
        boolean volver = false;
        do {
            int opcion = mostrarMenu("Reportes y Diagnóstico", MENU_REPORTES);
            switch (opcion) {
                case 0 ->
                    promedioPorMateria();
                case 1 ->
                    promedioGeneral();
                case 2 ->
                    estadoAprobacion();
                case 3 ->
                    reporteCompleto();
                default ->
                    volver = true;
            }
        } while (!volver);
    }

    // MÓDULO 1: GESTIÓN DE ESTUDIANTES
    private static void registrarEstudiante() {
        pendiente("Registrar nuevo estudiante");
    }

    private static void listarEstudiantes() {
        pendiente("Listar estudiantes");
    }

    private static void seleccionarEstudiante() {
        // Al terminar, debe asignar estudianteActivo.
        pendiente("Seleccionar estudiante activo");
    }

    private static void modificarEstudiante() {
        pendiente("Modificar datos del estudiante activo");
    }

    private static void eliminarEstudiante() {
        pendiente("Eliminar estudiante");
    }

    // MÓDULO 2: REGISTRO DE EVALUACIONES (materias y notas del estudiante activo)
    private static void registrarMateria() {
        pendiente("Registrar materia");
    }

    private static void agregarEvaluacion() {
        pendiente("Agregar evaluación a una materia");
    }

    private static void consultarMaterias() {
        pendiente("Consultar materias y evaluaciones");
    }

    private static void eliminarMateria() {
        pendiente("Eliminar materia");
    }

    private static void ingresarNota() {
        pendiente("Ingresar nota de una evaluación");
    }

    private static void modificarNota() {
        pendiente("Modificar nota de una evaluación");
    }

    private static void eliminarNota() {
        pendiente("Eliminar nota de una evaluación");
    }

    // MÓDULO 3: DIAGNÓSTICO Y REPORTES // 
    private static void promedioPorMateria() {
        pendiente("Promedio ponderado por materia");
    }

    private static void promedioGeneral() {
        pendiente("Promedio general");
    }

    private static void estadoAprobacion() {
        pendiente("Estado de aprobación por materia");
    }

    private static void reporteCompleto() {
        pendiente("Reporte completo de notas");
    }

    // AUXILIARES DE MENÚ
    /**
     * Muestra la lista desplegable y devuelve el índice elegido, o -1 si
     * cancela.
     */
    private static int mostrarMenu(String subtitulo, String[] opciones) {
        String activo = (estudianteActivo == null) ? "(ninguno)" : estudianteActivo;
        String mensaje = "Estudiante activo: " + activo + "\n\nSeleccione una opción:";

        Object seleccion = JOptionPane.showInputDialog(
                null,
                mensaje,
                TITULO + " | " + subtitulo,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);

        if (seleccion == null) {
            return -1;
        }
        for (int i = 0; i < opciones.length; i++) {
            if (opciones[i].equals(seleccion)) {
                return i;
            }
        }
        return -1;
    }

    private static boolean hayEstudianteActivo() {
        if (!EXIGIR_ESTUDIANTE_ACTIVO || estudianteActivo != null) {
            return true;
        }
        JOptionPane.showMessageDialog(
                null,
                "Primero registre o seleccione un estudiante\nen el menú Gestión de Estudiantes.",
                TITULO,
                JOptionPane.WARNING_MESSAGE);
        return false;
    }

    private static boolean confirmarSalida() {
        int respuesta = JOptionPane.showConfirmDialog(
                null,
                "¿Desea salir del sistema?",
                TITULO,
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (respuesta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Gracias por usar el sistema.", TITULO,
                    JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        return false;
    }

    private static void pendiente(String funcionalidad) {
        JOptionPane.showMessageDialog(
                null,
                "Funcionalidad: " + funcionalidad + "\nSe implementará en los siguientes avances.",
                TITULO,
                JOptionPane.INFORMATION_MESSAGE);
    }
}
