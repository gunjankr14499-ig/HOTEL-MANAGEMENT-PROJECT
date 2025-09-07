import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddRooms extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField f1,f2,f3,f4;
    JButton b1,b2;
    JComboBox j1,j2,j3;;

    AddRooms(){
        setLayout(null);
        l1=new JLabel("ADD ROOMS");
        l1.setBounds(200,20,200,30);
        Font f=new Font("serif",Font.BOLD,30);
        l1.setForeground(Color.BLACK);
        l1.setFont(f);
        add(l1);



        l2=new JLabel("ROOM NO");
        l2.setBounds(150,80,120,30);
        Font f1=new Font("serif",Font.PLAIN,20);
        l2.setFont(f1);
        add(l2);

       f2=new JTextField();
       f2.setBounds(280,80,120,30);
       add(f2);



       l3=new JLabel("AVAILABLE");
       l3.setBounds(150,160,120,30);
       l3.setFont(f1);
       add(l3);

       String []available={"available","occupied"};
        j1=new JComboBox(available);
       j1.setBounds(280,160,120,30);
       j1.setBackground(Color.WHITE);
       add(j1);

       l4=new JLabel("CLEANING STATUS");
       l4.setBounds(80,240,200,30);
       l4.setFont(f1);
       add(l4);

       String[]Available={"Clean","Dirty"};
        j2=new JComboBox(Available);
       j2.setBounds(280,240,120,30);
       add(j2);

       l5=new JLabel("PRICE");
       l5.setBounds(150,320,120,30);
       l5.setFont(f1);
       add(l5);

       f3=new JTextField();
       f3.setBounds(280,320,120,30);
       add(f3);


       l5=new JLabel("BAD TYPE");
       l5.setBounds(150,400,120,30);
       l5.setFont(f1);
       add(l5);

      String []badType={"Single bed","Double bed"};
        j3=new JComboBox(badType);
       j3.setBounds(280,400,120,30);
       add(j3);

       b1=new JButton("ADD ROOM");
       b1.setBounds(150,500,120,30);
       b1.setForeground(Color.WHITE);
       b1.setBackground(Color.BLACK);
       b1.addActionListener(this);
       add(b1);

       b2=new JButton("CANCEL");
       b2.setBounds(350,500,120,30);
       b2.setForeground(Color.WHITE);
       b2.setBackground(Color.BLACK);
       b2.addActionListener(this);
       add(b2);

       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel2.jpg"));
       l6=new JLabel(i1);
       l6.setBounds(450,40,450,500);
       add(l6);


    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            String roomNo=f2.getText();
            String Availability=(String)j1.getSelectedItem();
            String cleaning=(String)j2.getSelectedItem();
            String price=f3.getText();
            String  badtype=(String)j3.getSelectedItem();
            try{
                SelectTest t=new SelectTest();
                String query="insert into addroom values('"+roomNo+"','"+Availability+"','"+cleaning+"','"+price+"','"+badtype+"')";
                t.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"execute sucessfully");
                setVisible(false);


            }catch(Exception e1){

            }



        }else {
            setVisible(false);
        }
    }
    public static void main(String[]args){
        AddRooms rooms=new AddRooms();
        rooms.setVisible(true);
        rooms.setBounds(330,100,940,670);
        rooms.setDefaultCloseOperation(rooms.EXIT_ON_CLOSE);


    }
}
