import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.ResultSet;

public class AddCustomer extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JComboBox jcb1,jcb2;
    JTextField f2,f3,f4,f5,f6,f7;
    JRadioButton jrb,jrb1;
    Choice c;
    JButton b1,b2;

    AddCustomer(){
        setLayout(null);
        l1=new JLabel("NEW CUSTOMER FORM");
        l1.setBounds(100,10,300,30);
        Font f=new Font("",Font.BOLD,20);
        l1.setFont(f);
        l1.setForeground(Color.BLACK);
        add(l1);

        l2=new JLabel("ID");
        l2.setBounds(120,100,120,30);
        Font f1=new Font("",Font.PLAIN,20);
        l2.setFont(f1);
        l2.setForeground(Color.BLACK);
        add(l2);

        String[]id={"ADDHAR","VOTER CARD","DRIVING LICENSE","RATION CARD"};
        jcb1=new JComboBox(id);
        jcb1.setBounds(200,100,120,30);
        add(jcb1);

        l2=new JLabel("NUMBER");
        l2.setBounds(100,150,120,30);
        l2.setFont(f1);
        add(l2);

        f2=new JTextField();
        f2.setBounds(200,150,120,30);
        add(f2);

        l3=new JLabel("NAME");
        l3.setBounds(100,200,120,30);
        l3.setFont(f1);
        add(l3);

        f3=new JTextField();
        f3.setBounds(200,200,120,30);
        add(f3);

        l4=new JLabel("GENDER");
        l4.setBounds(80,250,120,30);
        l4.setFont(f1);
        add(l4);

        jrb=new JRadioButton("MALE");
        jrb.setBounds(180,250,120,30);
        add(jrb);

        jrb1=new JRadioButton("FEMALE");
        jrb1.setBounds(300,250,200,30);
        add(jrb1);

        l5=new JLabel("COUNTRY");
        l5.setBounds(80,300,120,30);
        l5.setFont(f1);
        add(l5);

        f4=new JTextField();
        f4.setBounds(200,300,120,30);
        add(f4);

        l6=new JLabel(" ROOM NUMBER");
        l6.setBounds(20,350,250,30);
        l6.setFont(f1);
        add(l6);

        c=new Choice();

        try{
            SelectTest t=new SelectTest();
            String query="select*from addroom";
            ResultSet rs=t.s.executeQuery(query);
            while(rs.next()){
                c.add(rs.getString("roomno"));
            }
        }catch(Exception e){

        }

        c.setBounds(100,350,300,30);
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);

        add(c);

        l7=new JLabel("CHECKIN TIME");
        l7.setBounds(40,400,200,30);
        l7.setFont(f1);
        add(l7);


        f5=new JTextField();
        f5.setBounds(200,400,120,30);
        add(f5);

        l8=new JLabel("DEPOSIT");
        l8.setBounds(80,450,200,30);
        l8.setFont(f1);
        add(l8);

        f6=new JTextField();
        f6.setBounds(200,450,120,30);
        add(f6);

        b1=new JButton("ADD");
        b1.setBounds(80,520,120,30);;
      //  b1.setFont(f1);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("BACK");
        b2.setBounds(260,520,120,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("hotelcustomer.jpg"));
        Image image1=image.getImage().getScaledInstance(550,400,Image.SCALE_DEFAULT);
        ImageIcon image2=new ImageIcon(image1);
        l9=new JLabel(image2);
        l9.setBounds(450,120,550,400);
        add(l9);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            String id=(String)jcb1.getSelectedItem();
            String number=f2.getText();
            String name=f3.getText();
            String gender=null;
            if(jrb.isSelected()){
                gender="male";
            }else if(jrb1.isSelected()){
                gender="female";
            }
            String country=f4.getText();
            String roomnumber=(String)c.getSelectedItem();
            String checkintime=f5.getText();
            String deposit=f6.getText();

            try{
                String query="insert into addcustomerform values('"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+roomnumber+"','"+checkintime+"','"+deposit+"')";
               // String query1="update addroom set availability ='occupied ' where roomno='"+roomnumber+"' ";
                SelectTest t=new SelectTest();
                t.s.executeUpdate(query);
               // t.s.executeUpdate(query1);

                JOptionPane.showMessageDialog(null,"new customer added sucessfull");
                setVisible(false);






            }catch(Exception e1){

            }


        }else if(e.getSource()==b2){
            setVisible(false);
            new Reception();
            Reception reception=new Reception();
            DashBoard db=new DashBoard();
            db.setBounds(0, 0, 1550, 1000);
            db.setVisible(true);
            reception.setBounds(300,135,900,700);
            reception.setVisible(true);

        }
    }

    public static void main(String[]args){
        AddCustomer addcustomer=new AddCustomer();
        addcustomer.setVisible(true);
        addcustomer.setBounds(350,150,1000,650);
        addcustomer.setDefaultCloseOperation(addcustomer.EXIT_ON_CLOSE);
    }
}
