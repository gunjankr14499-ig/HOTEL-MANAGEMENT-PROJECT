import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public  class DashBoard extends JFrame implements ActionListener {
    DashBoard() {
        setBounds(0, 0, 1550, 1000);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("gun2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 1000);
        add(image);

        JLabel text = new JLabel("TAJ GROUP WELCOME YOU");
        text.setBounds(450, 60, 1000, 50);
        text.setFont(new Font("Tahoma", Font.PLAIN, 50));
        text.setForeground(Color.CYAN);
        image.add(text);

        JMenuBar jb = new JMenuBar();
        jb.setBounds(0, 0, 1550, 50);
        image.add(jb);

        JMenu j1 = new JMenu("HOTEL MANAGEMENT");
        j1.setForeground(Color.BLUE);
        jb.add(j1);

        JMenuItem reception = new JMenuItem("RECEPTION");
        reception.addActionListener(this);
        j1.add(reception);

        JMenu admin = new JMenu("ADMIN");
        admin.setBackground(Color.RED);
        jb.add(admin);

        JMenuItem addEmployee = new JMenuItem("ADD EMPLOYEE");
        addEmployee.addActionListener(this);
        admin.add(addEmployee);

        JMenuItem addRoom = new JMenuItem("ADD ROOM");
         addRoom.addActionListener(this);
        admin.add(addRoom);

        JMenuItem addDriver = new JMenuItem("ADD DRIVER");
        addDriver.addActionListener(this);
        admin.add(addDriver);


        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("ADD EMPLOYEE")) {

           AddEmployee a= new AddEmployee();
           a. setVisible(true);
           a.setBounds(300,200,1050,600);
           // JOptionPane.showMessageDialog(null, "sucessfull");
        }
        else if(e.getActionCommand().equals("ADD ROOM")){
            AddRooms rooms=new AddRooms();
            rooms.setVisible(true);
            rooms.setBounds(330,200,940,600);

        }
        else if(e.getActionCommand().equals("ADD DRIVER")){
            AddDriver driver=new AddDriver();
            driver.setVisible(true);
            driver.setBounds(300,150,900,600);
        }
        else if(e.getActionCommand().equals("RECEPTION")){
            Reception reception=new Reception();
            reception.setVisible(true);
            reception.setBounds(300,135,900,700);
        }


    else{
        JOptionPane.showMessageDialog(null, " not sucessfull");


    }
}


    public static void main(String[]args){

        DashBoard db=new DashBoard();
    }
}
