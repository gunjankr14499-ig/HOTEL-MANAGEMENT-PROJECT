//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
//
//public class DbCom{
//    Connection con;
//    Statement s;
//
//
//    public static void main(String[]args){
//
//        try{
//            String url="jdbc:postgresql://localhost:5432/Employee";;
//            String user="postgres";
//            String pwd="gunjan@123";
//            con= DriverManager.getConnection(url,user,pwd);
//            System.out.println("connection ok");
//            s=con.createStatement();
//
//
//        }catch(Exception e){
//            System.out.println(e);
//
//        }
//    }
//}
