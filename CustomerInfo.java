import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class CustomerInfo extends JFrame implements ActionListener {



    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JTable t1;
    JButton b1;

    CustomerInfo() {
        setLayout(null);

        l1 = new JLabel("Id");
        l1.setBounds(100, 50, 120, 30);
        add(l1);

        l2 = new JLabel("Number");
        l2.setBounds(140, 50, 120, 30);
        add(l2);

        l3 = new JLabel("Name");
        l3.setBounds(220, 50, 120, 30);
        add(l3);

        l4 = new JLabel("Gender");
        l4.setBounds(300, 50, 120, 30);
        add(l4);

        l5 = new JLabel("Country");
        l5.setBounds(400, 50, 120, 30);
        add(l5);

        l6 = new JLabel("Room no");
        l6.setBounds(500, 50, 120, 30);
        add(l6);

        l7 = new JLabel("Checkintime");
        l7.setBounds(600, 50, 120, 30);
        add(l7);

        l8 = new JLabel("Deposit");
        l8.setBounds(700, 50, 120, 30);
        add(l8);


        t1 = new JTable();
        t1.setBounds(50, 100, 700, 300);
        add(t1);


        try {
            SelectTest t = new SelectTest();
            ResultSet rs = t.s.executeQuery("select*from addcustomerform");
            t1.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {

        }
        b1=new JButton("BACK");
        b1.setBounds(300,400,120,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);


    }
    public void actionPerformed(ActionEvent e2){
        setVisible(false);
        Reception reception=new Reception();
        reception.setBounds(100,100,900,800);
        reception.setVisible(true);
        add(reception);

    }
    public static void main(String[]args){
        CustomerInfo customerinfo=new CustomerInfo();
        customerinfo.setBounds(250,100,800,700);
        customerinfo.setVisible(true);
        customerinfo.setDefaultCloseOperation(customerinfo.EXIT_ON_CLOSE);
    }
}
