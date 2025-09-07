package org.example.second_unit.messenger;

public class ViberMessenger implements MessengerService{
    private String message;
    @Override
    public void sendMessage(String message) {
        this.message = message;
        System.out.printf("Viber: отправка сообщения \"%s\"%n", message);
    }
    @Override
    public String readMessage() {
        if (message != null) {
            return String.format("Viber: вы читаете последнее сообщение \"%s\"%n", message);
        } else {
            return "Viber: новых сообщений нет";
        }
    }
}
