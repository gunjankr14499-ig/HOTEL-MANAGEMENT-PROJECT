import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDriver extends JFrame implements ActionListener {

    JLabel  AddDriver,name,age,gender,carCompany,carModel,availabel,location,driverimage;
    JComboBox jcb,ava;
    JButton b1,b2;
    JTextField f1,f2,f3,f4,f5,f6;

    AddDriver(){
        setLayout(null);
        AddDriver=new JLabel("AddDrivers");
        AddDriver.setBounds(150,30,200,30);
        Font f=new Font("Thomas",Font.BOLD,30);
        AddDriver.setFont(f);
        AddDriver.setForeground(Color.BLACK);
        add(AddDriver);

        name=new JLabel("NAME");
        name.setBounds(100,100,200,30);
        Font f1=new Font("serif",Font.PLAIN,20);
        name.setFont(f1);
        add(name);

        f2=new JTextField();
        f2.setBounds(200,100,120,30);
        add(f2);

        age=new JLabel("AGE");
        age.setBounds(100,150,200,30);
        age.setFont(f1);
        add(age);

        f3=new JTextField();
        f3.setBounds(200,150,120,30);
        add(f3);

        gender=new JLabel("GENDER");
        gender.setBounds(100,200,200,30);
        gender.setFont(f1);
        add(gender);

        String[]name={"MALE","FEMALE"};
        jcb=new JComboBox(name);
        jcb.setBounds(200,200,120,30);
        add(jcb);

        carCompany=new JLabel("CAR COMPANY");
        carCompany.setBounds(40,250,200,30);
        carCompany.setFont(f1);
        add(carCompany);

        f4=new JTextField();
        f4.setBounds(200,250,120,30);
        add(f4);

        carModel=new JLabel("CAR MODEL");
        carModel.setBounds(70,300,200,30);
        carModel.setFont(f1);
        add(carModel);

        f5=new JTextField();
        f5.setBounds(200,300,120,30);
        add(f5);

        availabel=new JLabel("AVAILABLE");
        availabel.setBounds(70,350,200,30);
        availabel.setFont(f1);
        add(availabel);


        String[]name1={"AVAILABEL","BUSY"};
        ava=new JComboBox(name1);
        ava.setBounds(200,350,120,30);
        add(ava);

        location=new JLabel("LOCATION");
        location.setBounds(70,400,200,30);
        location.setFont(f1);
        add(location);

        f6=new JTextField();
        f6.setBounds(200,400,120,30);
        add(f6);

        b1=new JButton("ADD ROOM");
        b1.setBounds(70,450,120,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("CANCEL");
        b2.setBounds(250,450,120,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("driver.jpg"));
        driverimage=new JLabel(i1);
        driverimage.setBounds(400,50,450,500);
        add(driverimage);
    }
    public void actionPerformed(ActionEvent e1){
        if(e1.getSource()==b1){
            String name=f2.getText();
            String age=f3.getText();
            String gender=(String)jcb.getSelectedItem();
            String carCompany=f4.getText();
            String carModel=f5.getText();
            String availabel=(String)ava.getSelectedItem();
            String location=f6.getText();
            try{
                SelectTest t=new SelectTest();
                String query="insert into adddriver values('"+name+"','"+age+"','"+gender+"','"+carCompany+"','"+availabel+"','"+location+"')";
                t.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"add sucessfully");
                setVisible(false);

            }catch(Exception e){

            }


        }else if(e1.getSource()==b2){
            JOptionPane.showMessageDialog(null,"cancel sucessfull");
            setVisible(false);
        }

    }
    public static void main(String[] args) {
        AddDriver driver=new AddDriver();
        driver.setVisible(true);
        driver.setBounds(300,150,900,600);
        driver.setDefaultCloseOperation(driver.EXIT_ON_CLOSE);
    }
}
