import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
    JLabel l1,l2;

    Reception(){
        setLayout(null);
        l2=new JLabel("RECEPTION");
        l2.setBounds(400,5,200,50);
        Font f=new Font("",Font.ITALIC,30);
        l2.setFont(f);
        add(l2);

        b1=new JButton("NEW CUSTOMER FORM");
        b1.setBounds(10,50,200,50);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("ROOMS");
        b2.setBounds(10,120,200,50);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.addActionListener(this);
        add(b2);

        b3=new JButton("DEPARTMENT");
        b3.setBounds(10,190,200,50);
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.BLACK);
        b3.addActionListener(this);
        add(b3);

        b4=new JButton("ALL EMPLOYEES");
        b4.setBounds(10,260,200,50);
        b4.setForeground(Color.WHITE);
        b4.setBackground(Color.BLACK);
        b4.addActionListener(this);
        add(b4);

        b5=new JButton("MANAGER INFORMATION");
        b5.setBounds(10,330,200,50);
        b5.setForeground(Color.WHITE);
        b5.setBackground(Color.BLACK);
        b5.addActionListener(this);
        add(b5);

        b6=new JButton("CUSTOMERS INFORMATION");
        b6.setBounds(10,330,200,50);
        b6.setForeground(Color.WHITE);
        b6.setBackground(Color.BLACK);
        b6.addActionListener(this);

        add(b6);

//        b7=new JButton("CHECKOUT");
//        b7.setBounds(10,400,200,50);
//        b7.setForeground(Color.WHITE);
//        b7.setBackground(Color.BLACK);
//        add(b7);
//
//        b8=new JButton("UPDATE");
//        b8.setBounds(10,470,200,50);
//        b8.setForeground(Color.WHITE);
//        b8.setBackground(Color.BLACK);
//        add(b8);
//
//        b9=new JButton("UPDATE ROOMS STATUS");
//        b9.setBounds(10,540,200,50);
//        b9.setForeground(Color.WHITE);
//        b9.setBackground(Color.BLACK);
//        add(b9);
//
//        b10=new JButton("LOGOUT");
//        b10.setBounds(10,700,200,50);
//        b10.setForeground(Color.WHITE);
//        b10.setBackground(Color.BLACK);
//        add(b10);

        b11=new JButton("CUSTOMER INFORMATION");
        b11.setBounds(10,400,200,50);
        b11.setForeground(Color.WHITE);
        b11.setBackground(Color.BLACK);
        b11.addActionListener(this);
        add(b11);

        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("hotelreception2.jpg"));
        Image i2 = i.getImage().getScaledInstance(500, 600, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        l1=new JLabel(i3);
        l1.setBounds(300,50,500,600);
        add(l1);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            setVisible(false);
            AddCustomer addcustomer=new AddCustomer();
            DashBoard db=new DashBoard();
            db.setBounds(0, 0, 1550, 1000);
            db.setVisible(true);


            addcustomer.setBounds(350,150,1000,650);
            addcustomer.setVisible(true);
        }
        else if(e.getSource()==b2){
            setVisible(false);
            Rooms r=new Rooms();
            r.setBounds(200,100,1000,700);
            r.setVisible(true);
        }
        else if(e.getSource()==b3){
            setVisible(false);
            Department department=new Department();
            department.setBounds(300,100,900,700);
            department.setVisible(true);

        }
        else if(e.getSource()==b4){
            setVisible(false);
            AllEmployee allemployee=new AllEmployee();
            allemployee.setBounds(100,0,900,700);
            allemployee.setVisible(true);
        }

        else if(e.getSource()==b5){
          setVisible(false);
          Manager manager=new Manager();
          manager.setBounds(200,100,900,700);
          manager.setVisible(true);

        }
        else if(e.getSource()==b11){
            setVisible(false);
            CustomerInfo customerinfo=new CustomerInfo();
            customerinfo.setBounds(250,100,800,700);
            customerinfo.setVisible(true);
        }
    }
    public static void main(String[] args) {
        Reception reception=new Reception();
        reception.setVisible(true);
        reception.setBounds(100,50,900,1200);
        reception.setDefaultCloseOperation(reception.EXIT_ON_CLOSE);
    }
}
