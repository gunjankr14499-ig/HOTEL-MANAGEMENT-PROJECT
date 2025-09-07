import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import net.proteanit.sql.*;

public class Department extends JFrame implements ActionListener {

    JLabel l1,l2,l3,l4,l5,l6;
    JTable t1;
    JButton b1;


    Department(){
        setLayout(null);
        l1=new JLabel("Department");
        l1.setBounds(100,20,120,30);
        add(l1);

        l2=new JLabel("Budget");
        l2.setBounds(600,20,120,30);
        add(l2);

        t1=new JTable();
        t1.setBounds(10,50,900,100);
        add(t1);

        b1=new JButton("BACK");
        b1.setBounds(400,600,120,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener( this);
        add(b1);





        try{
            SelectTest t=new SelectTest();
            ResultSet rs=t.s.executeQuery("select*from department");
            t1.setModel(DbUtils.resultSetToTableModel(rs));


        }catch(Exception e){

        }





    }
    public void actionPerformed(ActionEvent e){
        setVisible(false);
        Reception reception=new Reception();
        reception.setBounds(100,100,900,800);
        reception.setVisible(true);

    }
    public static void main(String[] args) {
        Department department=new Department();
        department.setBounds(300,150,900,700);
        department.setVisible(true);
        department.setDefaultCloseOperation(department.EXIT_ON_CLOSE);
    }
}
