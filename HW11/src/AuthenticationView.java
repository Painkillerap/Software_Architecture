import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AuthenticationView extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;

    public AuthenticationView() {
        setLocationRelativeTo(null);
        setTitle("Аутентификация");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.setBackground(Color.lightGray);

        

        JLabel usernameLabel = new JLabel("Логин:");
        usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Пароль:");
        passwordField = new JPasswordField();
        JButton loginButton = new JButton("Войти");
        JButton registerButton = new JButton("Регистрация");

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(registerButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Создание объекта класса для проверки данных аутентификации
                MessengerModel messengerModel = new MessengerModel();

                // Вызов метода проверки данных аутентификации
                if (messengerModel.checkCredentials(username, password)) {
                    openMessengerPage();
                } else {
                    JOptionPane.showMessageDialog(null, "Неправильный логин или пароль");
                }
            }
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openRegistrationPage();
            }
        });

        add(panel);
        pack();
        setVisible(true);
    }

    private void openRegistrationPage() {
        // Закрыть текущее окно аутентификации и открыть окно регистрации
        dispose();
        RegistrationView registrationView = new RegistrationView();
        registrationView.setVisible(true);
    }

    private void openMessengerPage() {
        // Закрыть текущее окно аутентификации и открыть страницу мессенджера
        dispose();
        MessengerView messengerView = new MessengerView();
        messengerView.setVisible(true);
    }

}