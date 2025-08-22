package org.example.second_unit.messenger;

public class WhatsAppMessenger implements MessengerService{
    private String message;
    @Override
    public void sendMessage(String message) {
        this.message = message;
        System.out.println("WhatsApp: отправка сообщения \"" + message + "\"");
    }
    @Override
    public String readMessage() {
        if (message != null) {
            return "WhatsApp: новое сообщение (\"" + message + "\")";
        } else {
            return "WhatsApp: нет новых сообщений";
        }
    }
}
