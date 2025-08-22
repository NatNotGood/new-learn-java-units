package org.example.second_unit.messenger;

public class TelegramMessenger implements MessengerService{
    private String message;

    @Override
    public void sendMessage(String message) {
        this.message = message;
        System.out.println("Telegram: отправка сообщения \"" + message + "\"");
    }
    @Override
    public String readMessage() {
        if (message != null) {
            return "Telegram: получено новое сообщение (ответ на \"" + message + "\")";
        } else {
            return "Telegram: нет новых сообщений";
        }
    }
}
