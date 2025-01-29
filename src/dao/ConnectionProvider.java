
package dao;
import java.sql.Connection; //importar de dónde va a ser el paquete
import java.sql.DriverManager;
/**
 *
 * @author anacl
 */
public class ConnectionProvider {
    
    public static Connection getCon() {
        //intenta conectar con la base de datos
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory_m?useSSL=false","root","21062024");
        return con;
        }
        catch(Exception e) {
            System.out.println(e);
            return null;
            
        }
    }
}
