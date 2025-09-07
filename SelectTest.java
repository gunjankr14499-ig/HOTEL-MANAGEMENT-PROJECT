import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectTest  {

        Connection con;
        Statement s;
        ResultSet rs;


           SelectTest(){


                try {
                    String url = "jdbc:postgresql://localhost:5432/login12";
                    String user = "postgres";
                    String password = "gunjan@123";
                    con = DriverManager.getConnection(url, user, password);
                    //  System.out.println("connection ok");
                    s = con.createStatement();


                } catch (Exception e) {
                    System.out.println(e);
                }
            }

    public static void main(String[] args) {

               SelectTest t=new SelectTest();
    }

}
