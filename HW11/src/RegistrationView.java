import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationView extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;

    public RegistrationView() {
        setLocationRelativeTo(null);
        setTitle("Регистрация");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.setBackground(Color.lightGray);
        
        JLabel usernameLabel = new JLabel("Логин:");
        usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Пароль:");
        passwordField = new JPasswordField();
        JButton registerButton = new JButton("Регистрация");

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(registerButton, BorderLayout.EAST);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Создание объекта класса для сохранения данных
                MessengerModel messengerModel = new MessengerModel();

                // Вызов метода сохранения данных
                messengerModel.registerUser(username, password);

                openAuthenticationPage();
            }
        });

        add(panel);
        pack();
        setVisible(true);
    }

    private void openAuthenticationPage() {
        // Закрыть текущее окно регистрации и открыть окно аутентификации
        dispose();
        AuthenticationView authenticationView = new AuthenticationView();
        authenticationView.setVisible(true);
    }

}