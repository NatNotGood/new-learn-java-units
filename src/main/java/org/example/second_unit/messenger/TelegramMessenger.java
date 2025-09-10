package org.example.second_unit.messenger;

public class TelegramMessenger implements MessengerService{
    private String message;

    @Override
    public void sendMessage(String message) {
        this.message = message;
        System.out.printf("Telegram: отправка сообщения \"%s\"%n", message);
    }
    @Override
    public String readMessage() {
        if (message != null) {
            return String.format("Telegram: чтение сообщения \"%s\"%n", message);
        } else {
            return "Telegram: нет новых сообщений";
        }
    }
}
