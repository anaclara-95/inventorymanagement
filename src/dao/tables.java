package dao;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author anacl
 */
public class tables {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;    //statement se usa para ejecutar las consultas sql
        try {
            con = ConnectionProvider.getCon(); //de a clase ConnectionProvider
            st = con.createStatement();
            //las líneas comentadas ya fueron ejecutadas

            //st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key, userRole varchar(50), name varchar(200), mobileNumber varchar(50),email varchar(100),password varchar(50), address varchar(200), status varchar(50))"); //ejecutar la consulta
            //st.executeUpdate("insert into appuser(userRole, name, mobileNumber, email, password, address, status) values('SuperAdmin', 'Super Admin', '12345', 'superadmin@testemail.com', 'admin', 'Argentina', 'Active')");
            //st.executeUpdate("create table category(category_pk int AUTO_INCREMENT primary key, name varchar(200))");
            //st.executeUpdate("create table product(product_pk int AUTO_INCREMENT primary key, name varchar(200), quantity int, price int, description varchar(500), category_fk int)");
            //st.executeUpdate("create table customer(customer_pk int AUTO_INCREMENT primary key, name varchar(200), mobileNumber varchar(50), email varchar(200))");
            st.executeUpdate("create table orderDetail(order_pk int AUTO_INCREMENT primary key, orderId varchar(200), customer_fk int, orderDate varchar(200), totalPaid int)");

            JOptionPane.showMessageDialog(null, "Table created successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {

            try {
                con.close();
                st.close();

            } catch (Exception e) {

            }
        }
    }
}
