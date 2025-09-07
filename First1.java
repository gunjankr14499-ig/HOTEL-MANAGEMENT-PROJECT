
//    package HotelManagment;

//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;


    import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;
import java.awt.Font;
    class First1 extends JFrame implements ActionListener {
        ImageIcon i1;
        JLabel l1,l2;
        Font f;
        JButton b1;

        First1() {
            setLayout(null);

            ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("gun8.jpg"));
            Image i2 = i1.getImage().getScaledInstance(1550, 950, Image.SCALE_DEFAULT);
            ImageIcon i3=new ImageIcon(i2);
            JLabel l1=new JLabel(i3);
            l1.setBounds(0,0,1550,950);
            add(l1);

            JLabel l2=new JLabel("HOTEL MANAGMENT SYSTEM");
            l2.setBounds(400,10,800,80);
            l2.setForeground(Color.BLACK);
            Font f1=new Font("serif",Font.BOLD,50);
            l2.setFont(f1);
            l1.add(l2);

            JButton b1=new JButton("NEXT");
            b1.setBounds(1250,680,120,40);
            b1.setForeground(Color.WHITE);
            b1.setBackground(Color.BLACK);
            b1.addActionListener(this);
            l1.add(b1);





        }
        public void actionPerformed(ActionEvent e){

         Login12 log=   new Login12();
         log.setVisible(true);
         log.setBounds(0,200,1000,600);
         setVisible(false);


        }





        public static void main(String[] args) {
            First1 f = new First1();
            f.setVisible(true);
            f.setBounds(0,0,1550,850);
            f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        }
    }





