package org.example.second_unit.messenger;

public class WhatsAppMessenger implements MessengerService{
    private String message;
    @Override
    public void sendMessage(String message) {
        this.message = message;
        System.out.printf("WhatsApp: отправка сообщения \"%s\"%n", message);
    }
    @Override
    public String readMessage() {
        if (message != null) {
            return String.format("WhatsApp: чтение сообщения \"%s\"%n", message);
        } else {
            return "WhatsApp: нет новых сообщений";
        }
    }
}
