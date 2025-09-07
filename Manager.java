import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;




    public class Manager extends JFrame implements ActionListener {
        JTable t1;
        JButton b1;
        JLabel l1,l2,l3,l4,l5,l6,l7,l8;
        Manager(){
            setLayout(null);

            l1=new JLabel("NAME");
            l1.setBounds(20,10,120,30);
            add(l1);


            l2=new JLabel("AGE");
            l2.setBounds(120,10,120,30);
            add(l2);

            l3=new JLabel("SALARY");
            l3.setBounds(240,10,120,30);
            add(l3);

            l4=new JLabel("EMAIL");
            l4.setBounds(350,10,120,30);
            add(l4);

            l5=new JLabel("PHONE ");
            l5.setBounds(450,10,120,30);
            add(l5);

            l6=new JLabel("ADDHAR NO");
            l6.setBounds(520,10,120,30);
            add(l6);

            l7=new JLabel("GENDER");
            l7.setBounds(620,10,120,30);
            add(l7);

            l8=new JLabel("JOB");
            l8.setBounds(720,10,120,30);
            add(l8);


            t1=new JTable();
            t1.setBounds(20,40,800,300);
            add(t1);

            try{
                SelectTest t=new SelectTest();
                ResultSet rs=t.s.executeQuery("select*from employee10 where job='Manager' ");
                t1.setModel(DbUtils.resultSetToTableModel(rs));

            }catch(Exception e1){

            }


            b1=new JButton("BACK");
            b1.setBounds(500,600,120,30);
            b1.setBackground(Color.BLACK);
            b1.setForeground(Color.WHITE);
            b1.addActionListener(this);
            add(b1);


        }
        public void actionPerformed(ActionEvent e){
            setVisible(false);
            Reception reception=new Reception();
            reception.setBounds(100,100,900,800);
            reception.setVisible(true);
        }


        public static void main(String[]args){
            Manager manager=new Manager();
            manager.setBounds(200,100,900,700);
            manager.setVisible(true);
            manager.setDefaultCloseOperation(manager.EXIT_ON_CLOSE);

        }
    }


