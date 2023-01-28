public class Pruebas {
    public static void main(String[] args) {
        String path = "D:\\ProgramoCosas\\ProyectoSI\\ficheros\\prueba.csv";
        Equipo equipo1 = new Equipo(path);
        Equipo equipo2 = new Equipo(path);
        Partido encuentro1 = new Partido(equipo1,equipo2);
    }
}
