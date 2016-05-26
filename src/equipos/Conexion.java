package equipos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



    public class Conexion {
        
    
    public String bd = "epastoriza";
    public String url = "jdbc:mysql://10.0.0.254/" + bd;
    public String user = "epastoriza";
    public String pass = "epastoriza";

    Connection con = null;

    public Connection Conectar() {

        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            con = (Connection) DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null, "Conectado con la base de datos");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se ha podido conectar" + e.getMessage());
        }
        return con;

    }
    }
    


