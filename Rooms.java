

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import net.proteanit.sql.*;



public class Rooms extends JFrame implements ActionListener {
    JTable t1;
    JLabel l1,l2,l3,l4,l5,l6;
    JButton b1;

    Rooms(){
        setLayout(null);

        ImageIcon image1=new ImageIcon(ClassLoader.getSystemResource("hotel2.jpg"));
        Image image2=image1.getImage().getScaledInstance(450,600, Image.SCALE_DEFAULT);
        ImageIcon image3=new ImageIcon(image2);
        l1=new JLabel(image3);
        l1.setBounds(450,40,500,600);
        add(l1);

        l2=new JLabel("Rooms number");
        l2.setBounds(10,50,120,30);
        add(l2);

        l3=new JLabel("Availability");
        l3.setBounds(120,50,120,30);
        add(l3);



        l4=new JLabel("Cleaning status");
        l4.setBounds(200,50,120,30);
        add(l4);

        l5=new JLabel("Price");
        l5.setBounds(300,50,120,30);
        add(l5);

        l6=new JLabel("Bad type");
        l6.setBounds(380,50,120,30);
        add(l6);

        b1=new JButton("BACK");
        b1.setBounds(200,600,120,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);





        t1=new JTable();
        t1.setBounds(50,100,400,600);
        add(t1);
        try{
            SelectTest t=new SelectTest();
            ResultSet rs=t.s.executeQuery("select*from addroom");
            t1.setModel(DbUtils.resultSetToTableModel(rs));



        }catch(Exception e){
           
        }

    }
    public void actionPerformed(ActionEvent e){
        setVisible(false);
        Reception reception=new Reception();
        reception.setVisible(true);
        reception.setBounds(300,135,900,700);

    }
    public static void main(String[] args) {
        Rooms r=new Rooms();
        r.setVisible(true);
        r.setBounds(200,100,1000,700);
        r.setDefaultCloseOperation(r.EXIT_ON_CLOSE);
    }
}
