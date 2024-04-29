package View;

import javax.swing.*;
import java.util.HashMap;

public class LoginPage extends JFrame {
    static HashMap<String,String> data = new HashMap<>();
    static JFrame frame;

    LoginPage(){
                frame = new JFrame("Login Page");
                frame.setSize(350, 200);
                frame.setLocationRelativeTo(null);
                JPanel panel = new JPanel();
                // adding panel to frame
                frame.add(panel);

                placeComponents(panel);

                // Setting the frame visibility to true
                frame.setVisible(true);
            }

            private static void placeComponents(JPanel panel) {

                panel.setLayout(null);

                // Creating JLabel
                JLabel userLabel = new JLabel("User");

                userLabel.setBounds(10,20,80,25);
                panel.add(userLabel);

                JTextField userText = new JTextField(20);
                userText.setBounds(100,20,165,25);
                panel.add(userText);

                // Same process for password label and text field.
                JLabel passwordLabel = new JLabel("Password");
                passwordLabel.setBounds(10,50,80,25);
                panel.add(passwordLabel);


                JPasswordField passwordText = new JPasswordField(20);
                passwordText.setBounds(100,50,165,25);
                panel.add(passwordText);

                // Creating login button
                JButton loginButton = new JButton("login");
                loginButton.setBounds(130, 80, 80, 25);
                loginButton.setFocusable(false);
                loginButton.addActionListener(e -> {
                    if(data.containsKey(userText.getText())){
                        if(String.valueOf(passwordText.getPassword()).equals(data.get(userText.getText()))){
                            JOptionPane.showMessageDialog(null,"Chào mừng");
                            SignUpPage.setProfile(SignUpPage.acc);
                            frame.dispose();
                        }else{
                            JOptionPane.showMessageDialog(null,"Incorrect Password");
                            passwordText.setText("");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"Invalid username or password");
                        userText.setText("");
                        passwordText.setText("");
                    }
                });

                panel.add(loginButton);
            }

        }





