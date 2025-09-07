import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class CheckOut extends JFrame  implements ActionListener {
    JLabel text,l1,l2,l3,l4,l5,l6,l7,l8;
    JButton b1,b2,b3;
    JTextField f1,f2,f3,f4,f5,f6;
    Choice c;
    CheckOut(){
        setLayout(null);
         text=new JLabel("Update Status");
        text.setBounds(90,20,200,30);
        Font f=new Font("Tahoma",Font.BOLD,20);
        text.setFont(f);
        text.setForeground(Color.BLUE);
        add(text);

         l2=new JLabel("Customer");
        l2.setBounds(30,80,100,20);
        add(l2);

        c=new Choice();
        c.setBounds(200,80,150,25);
        add(c);

        try{
            SelectTest t=new SelectTest();
            ResultSet rs=t.s.executeQuery("select*from newcustomerform");
            while(rs.next()){
                c.add(rs.getString("number"));
            }


        }catch(Exception e){

        }
        l3=new JLabel("Room");
        l3.setBounds(50,120,120,30);
        add(l3);

         f1=new JTextField();
        f1.setBounds(100,120,120,30);
        add(f1);

         l4=new JLabel("Name");
        l4.setBounds(50,180,120,30);
        add(l4);

         f2=new JTextField();
        f2.setBounds(100,180,120,30);
        add(f2);

        l5=new JLabel("Checkin Time");
        l5.setBounds(10,240,120,30);
        add(l5);

         f3=new JTextField();
        f3.setBounds(100,240,120,30);
        add(f3);

        l6=new JLabel("Amount Paid");
        l6.setBounds(15,300,120,30);
        add(l6);

         f4=new JTextField();
        f4.setBounds(100,300,120,30);
        add(f4);

         l7=new JLabel("Pending Amount");
        l7.setBounds(5,360,120,30);
        add(l7);

         f5=new JTextField();
        f5.setBounds(100,360,120,30);
        add(f5);

        b1=new JButton("CHECK");
        b1.setBounds(100,450,120,30);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("UPDATE");
        b2.setBounds(300,450,120,30);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.addActionListener(this);
        add(b2);

        b3=new JButton("BACK");
        b3.setBounds(500,450,120,30);
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.BLACK);
        b3.addActionListener(this);
        add(b3);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("check.png"));
        JLabel l8=new JLabel(i1);
        l8.setBounds(500,70,500,300);
        add(l8);

    }
    public void actionPerformed(ActionEvent e1){
        if(e1.getSource()==b1){

            String id=c.getSelectedItem();
            String query="select*from newcustomerform where number='"+id+"'";
            try{
                SelectTest t=new SelectTest();
                ResultSet rs=t.s.executeQuery(query);
                while(rs.next()){
                    f1.setText(rs.getString("roomnumber"));
                    f2.setText(rs.getString("name"));
                    f3.setText(rs.getString("checkintime"));
                    f4.setText(rs.getString("deposit"));


                }

            }catch(Exception e2){


            }
        }
    }
    public static void main(String[]args){
        CheckOut checkout=new CheckOut();
        checkout.setBounds(300,200,1000,600);
        checkout.setVisible(true);
        checkout.setDefaultCloseOperation(checkout.EXIT_ON_CLOSE);
    }
}
