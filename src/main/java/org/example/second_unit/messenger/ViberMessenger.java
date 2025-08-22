package org.example.second_unit.messenger;

public class ViberMessenger implements MessengerService{
    private String message;
    @Override
    public void sendMessage(String message) {
        this.message = message;
        System.out.println("Viber: отправка сообщения \"" + message + "\"");
    }
    @Override
    public String readMessage() {
        if (message != null) {
            return "Viber: вы читаете последнее сообщение \"" + message + "\"";
        } else {
            return "Viber: новых сообщений нет";
        }
    }
}
