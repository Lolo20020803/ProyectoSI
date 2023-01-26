public class Pruebas {
    public static void main(String[] args) {
        String path = "D:\\ProgramoCosas\\ProyectoSI\\ficheros\\prueba.csv";
        String javaPath = path.replace("\\", "/");
        Equipo prueba = new Equipo(javaPath);
        prueba.mostrar();
    }
}
