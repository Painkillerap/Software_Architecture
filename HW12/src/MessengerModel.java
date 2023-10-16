import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MessengerModel {
    
    private List<String> contacts;
    private List<iMessageReceivedListener> messageReceivedListeners;
    private List<iContactChangeListener> contactChangeListeners;
    
    public MessengerModel() {
        this.contacts = new ArrayList<>();
        this.messageReceivedListeners = new ArrayList<>();
        this.contactChangeListeners = new ArrayList<>();
    }
    
    
    public void registerUser(String username, String password) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("HomeWork\\HW11\\src\\Users.txt", true))) {
            writer.write(username + ":" + password);
            writer.newLine();
        } catch (IOException err) {
            err.printStackTrace();
        }
    }

    public boolean checkCredentials(String username, String password) {
        // Проверка данных аутентификации с базой данных
        // Вернуть true, если данные верны, иначе false
        try {
            BufferedReader reader = new BufferedReader(new FileReader("HomeWork\\HW11\\src\\Users.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userData = line.split(":");
                if (userData.length == 2 && userData[0].equals(username) && userData[1].equals(password)) {
                    reader.close();
                    return true;
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void addContact(String contact) {
        contacts.add(contact);
        notifyContactChangeListeners(); // Уведомляем слушателей об изменении списка контактов
    }
    
    public void removeContact(String contact) {
        contacts.remove(contact);
        notifyContactChangeListeners(); // Уведомляем слушателей об изменении списка контактов
    }
    
    public void sendMessage(String message) {
        // Отправка сообщения
        notifyMessageReceivedListeners(message); // Уведомляем слушателей о получении нового сообщения
    }
    
    public void exitChat() {
        // Логика выхода из чата
    }
    
    public void addMessageReceivedListener(iMessageReceivedListener listener) {
        messageReceivedListeners.add(listener);
    }
    
    public void addContactChangeListener(iContactChangeListener listener) {
        contactChangeListeners.add(listener);
    }
    
    private void notifyMessageReceivedListeners(String message) {
        for (iMessageReceivedListener listener : messageReceivedListeners) {
            listener.onMessageReceived(message);
        }
    }
    
    private void notifyContactChangeListeners() {
        for (iContactChangeListener listener : contactChangeListeners) {
            listener.onContactChange(contacts);
        }
    }
    
}