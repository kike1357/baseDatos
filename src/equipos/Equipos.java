package equipos;

public class Equipos {

    
    public static void main(String[] args) {
       Conexion obx = new Conexion();
       obx.Conectar();
       Interfaz it = new Interfaz();
       it.setVisible(true);
    }
    
}
