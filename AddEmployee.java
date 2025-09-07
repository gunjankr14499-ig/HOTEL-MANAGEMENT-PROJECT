import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddEmployee extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    Font f;
    JTextField f1,f2,f3,f4,f5,f6,f7,f8,f9;
    JRadioButton jrb,jrb1;
    JComboBox jcb;
    JButton b1;
    AddEmployee() {
        setLayout(null);
        l1 = new JLabel("NAME");
        l1.setBounds(200, 50, 120, 30);
        Font f = new Font("Serif", Font.PLAIN, 20);
        l1.setFont(f);
        add(l1);

         f1 = new JTextField();
        f1.setBounds(300, 50, 120, 30);
        add(f1);


        l2 = new JLabel("AGE");
        l2.setBounds(200, 100, 120, 30);
        l2.setFont(f);
        add(l2);

        f2 = new JTextField();
        f2.setBounds(300, 100, 120, 30);
        add(f2);

        l3 = new JLabel("GENDER");
        l3.setBounds(200, 150, 120, 30);
        l3.setFont(f);
        add(l3);


        jrb = new JRadioButton("MALE");
        jrb.setBounds(300, 150, 120, 30);
        add(jrb);

        jrb1 = new JRadioButton("FEMALE");
        jrb1.setBounds(450, 150, 120, 30);
        add(jrb1);

        ButtonGroup bg = new ButtonGroup();
        bg.add(jrb);
        bg.add(jrb1);

        l4 = new JLabel("JOB");
        l4.setBounds(200, 200, 120, 30);
        l4.setFont(f);
        add(l4);


        String[] str = {"Front Desk Clerks", "Porters", "Housekeeping", "Kitchen Staff", "Room Services", "Chets", "Waiter/Waitress", "Manager", "Accountant"};
         jcb = new JComboBox(str);

        jcb.setBounds(300, 200, 120, 30);
        jcb.setBackground(Color.WHITE);
        add(jcb);

        l5 = new JLabel("SALARY");
        l5.setBounds(200, 250, 120, 30);
        l5.setFont(f);
        add(l5);

        f5 = new JTextField();
        f5.setBounds(300, 250, 120, 30);
        add(f5);

        l6 = new JLabel("EMAIL");
        l6.setBounds(200, 300, 120, 30);
        l6.setFont(f);
        add(l6);

        f6 = new JTextField();
        f6.setBounds(300, 300, 120, 30);
        add(f6);

        l7=new JLabel("PHONE");
        l7.setBounds(200,350,120,30);
        l7.setFont(f);
        add(l7);

        f7=new JTextField();
        f7.setBounds(300,350,120,30);
        add(f7);

       l8 = new JLabel("ADDHAR");
       l8.setBounds(200, 400, 120, 30);
        l8.setFont(f);
       add(l8);

        f8 = new JTextField();
       f8.setBounds(300, 400, 120, 30);
      add(f8);

        ImageIcon img = new ImageIcon("emp1.jpg");
        l9 = new JLabel(img);
        l9.setBounds(600, 100, 400, 400);
        add(l9);

        b1 = new JButton("SUBMIT");
        b1.setBounds(300, 500, 120, 30);
        b1.setFont(f);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
    }
   public void actionPerformed(ActionEvent e) {
       String name = f1.getText();
       String age = f2.getText();
       String salary = f5.getText();
       String email = f6.getText();
       String phone = f7.getText();
       String adhar = f8.getText();

       String Gender = null;
       if (jrb.isSelected()) {
           Gender = "male" ;
       } else if (jrb1.isSelected()) {
           Gender = "female" ;
       }
       String job = (String) jcb.getSelectedItem();

       try {
           SelectTest t = new SelectTest();
           String query = "insert into employee10 values('" + name + "', '" + age + "','"+salary+"','"+email+"','"+phone+"','"+adhar+"','"+Gender+"','"+job+"') " ;
           t.s.executeUpdate(query);
           JOptionPane.showMessageDialog(null, "employee add sucessfully");
           setVisible(false);

       } catch (Exception e1) {

       }
   }



    public static void main(String[] args) {
        AddEmployee a=new AddEmployee();
        a.setVisible(true);
        a.setBounds(5,50,1050,600);
        a.setDefaultCloseOperation(a.EXIT_ON_CLOSE);
    }
}
