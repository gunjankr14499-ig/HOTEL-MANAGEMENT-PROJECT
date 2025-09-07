import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//import static jdk.internal.org.jline.utils.Colors.s;


public class Login12 extends JFrame implements ActionListener  {



    JLabel l1,l2,l3;
        JTextField f1,f2;
        JButton b1,b2;

        Login12(){
            setLayout(null);
            getContentPane().setBackground(Color.YELLOW);
            JLabel l1=new JLabel("USERNAME");
            l1.setBounds(100,20,100,30);
            l1.setForeground(Color.BLUE);
            add(l1);
             f1=new JTextField();
            f1.setBounds(200,20,100,30);
            f1.setBackground(Color.BLUE);
            f1.setForeground(Color.WHITE);
            add(f1);


            JLabel l2=new JLabel("PASSWORD");
            l2.setBounds(100,80,100,30);
            l2.setForeground(Color.BLUE);
            //  l2.setBackground(Color.WHITE);
            add(l2);

            f2=new JTextField();
            f2.setBounds(200,80,100,30);
            f2.setBackground(Color.BLUE);
            f2.setForeground(Color.WHITE);
            add(f2);

            b1=new JButton("LOGIN");
            b1.setBounds(180,150,100,30);
            b1.setBackground(Color.BLACK);
            b1.setForeground(Color.WHITE);
            b1.addActionListener(this);
          // b1.addActionListener(new Animal());
        //   b1.addActionListener(new Login());
            add(b1);

             b2=new JButton("CANCEL");
            b2.setBounds(360,150,100,30);
            b2.setBackground(Color.BLACK);
            b2.setForeground(Color.WHITE);
            b2.addActionListener(this);
          //  b2.addActionListener(new Animal1());
          //  b2.addActionListener(new Login());
            add(b2);

            ImageIcon i=new ImageIcon("user.jpeg");
            JLabel l3=new JLabel(i);
            l3.setBounds(450,20,120,120);
            add(l3);
        }
    public  void actionPerformed(ActionEvent e) {

          if(e.getSource()==b1){
              String s1=f1.getText();
              String s2=f2.getText();
              try{
                 SelectTest t= new SelectTest();



                  String query="select*from login where username= '"+s1+"' and password='"+s2+"' " ;
                ResultSet rs=  t.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new DashBoard();


               JOptionPane.showMessageDialog(null,"sucessfull");
                    System.out.println(rs.getString("username"));




                }
                else{
                    JOptionPane.showMessageDialog(null,"invalid username or password");
                    setVisible(false);
                }


              }catch(Exception e1){

              }

          }
          else if(e.getSource()==b2){
              setVisible(false);

          }

    }


    //    class Login  implements ActionListener {



            //@Override
//            public void actionPerformed(ActionEvent e) {
//                Statement s;
//                ResultSet rs;
//                Connection con;
//
//
//                if (e.getSource() == b1) {
//                    String s1 = f1.getText();
//                    String s2 = f2.getText();
//
//                    try {
//                        String url = "jdbc:postgresql://localhost:5432/log12";
//                        ;
//                        String user = "postgres";
//                        String pwd = "gunjan@123";
//                        con = DriverManager.getConnection(url, user, pwd);
//                        System.out.println("connection ok");
//                        s = con.createStatement();
//                        rs = s.executeQuery("select*from log12");
//                        while (rs.next()) {
//                            System.out.println(rs.getString("username"));
//
//
//                        }
//
//                    } catch (Exception e1) {
//                        System.out.println(e1);
//
//                    }
//
//
//                }
//            }





//        class Animal implements ActionListener{
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//
//                String s1=f1.getText();
//                String s2=f2.getText();
//
//                if(s1.equals("")){
//                    JOptionPane.showMessageDialog(null,"please enter username");
//                    System.out.println("login");
//                }
//                else if(s2.equals("")){
//                    JOptionPane.showMessageDialog(null,"please enter your password");
//
//                }
//                else{
//                    JOptionPane.showMessageDialog(null,"login sucessfull");
//                    System.out.println("login sucessfull");
//                }
//            }
//        }
//        class Animal1 implements ActionListener{
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                f1.setText("");
//                f2.setText("");
//
//                JOptionPane.showMessageDialog(null,"remove sucessfull");
//
//            }
//        }
//

                public static void main (String[]args){
                    Login12 log = new Login12();
                    Connection con;
                    Statement s;
                    ResultSet rs;
                    log.setBounds(500, 200, 600, 300);
                    log.setVisible(true);
                    log.setDefaultCloseOperation(log.EXIT_ON_CLOSE);
                }
            }





