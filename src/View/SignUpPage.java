package View;

import Model.Account;

import javax.swing.*;

public class SignUpPage extends JFrame {
    static Account acc;
    SignUpPage(){
        JFrame frame = new JFrame("SignUp page");
        frame.setSize(455,350);
        frame.setLocationRelativeTo(null);

        JLabel name = new JLabel("User Name");
        name.setBounds(50,30,110,25);

        JTextField nametxt = new JTextField();
        nametxt.setBounds(200,30,170,25);

        JLabel pass = new JLabel("Password");
        pass.setBounds(50,60,110,25);

        JPasswordField passtxt = new JPasswordField();
        passtxt.setBounds(200,60,170,25);

        JLabel dob = new JLabel("Date of Birth");
        dob.setBounds(50,90,110,25);

        JTextField dobDaytxt = new JTextField("DD");
        dobDaytxt.setBounds(200,90,33,25);

        JTextField dobMontxt = new JTextField("MM");
        dobMontxt.setBounds(253,90,33,25);

        JTextField dobYeartxt = new JTextField("YYYY");
        dobYeartxt.setBounds(306,90,65,25);

        JLabel contact = new JLabel("Contact Number");
        contact.setBounds(50,120,110,25);

        JTextField contacttxt = new JTextField();
        contacttxt.setBounds(200,120,170,25);

        JLabel email = new JLabel("E-mail Id");
        email.setBounds(50,150,110,25);

        JTextField emailtxt = new JTextField();
        emailtxt.setBounds(200,150,170,25);

        JButton confirm = new JButton("Confirm");
        confirm.setFocusable(false);
        confirm.setBounds(170,210,80,30);
        confirm.addActionListener(e -> {
            acc = new Account(nametxt.getText(),String.valueOf(passtxt.getPassword()),dobDaytxt.getText(),dobMontxt.getText(),dobYeartxt.getText(),contacttxt.getText(),emailtxt.getText(),0);
            LoginPage.data.put(acc.getuserName(),acc.getpassword());
            JOptionPane.showMessageDialog(null,"SingUp successful");
            setProfile(acc);
            frame.dispose();
        });

        frame.add(name);
        frame.add(nametxt);
        frame.add(pass);
        frame.add(passtxt);
        frame.add(dob);
        frame.add(dobDaytxt);
        frame.add(dobMontxt);
        frame.add(dobYeartxt);
        frame.add(contact);
        frame.add(contacttxt);
        frame.add(email);
        frame.add(emailtxt);
        frame.add(confirm);

        frame.setLayout(null);
        frame.setVisible(true);
    }
    static void setProfile(Account acc){
        ProfileGUI.welcome.setText("Welcome "+ acc.getuserName());
        ProfileGUI.userName.setText("           "+acc.getuserName());
        ProfileGUI.dob.setText(acc.getdoDate()+"/"+acc.getdoMonth()+"/"+acc.getdoYear());
        ProfileGUI.phoneNo.setText(acc.getcontact());
        ProfileGUI.e_mail.setText(acc.getemail());
        SideMenu.logIn.setText("Log Out");
        SideMenu.signUp.setVisible(false);
    }
}
