package org.example.second_unit.messenger;

public class ClientMessenger {
    private MessengerService messenger;
    public ClientMessenger(MessengerService messenger) {
        this.messenger = messenger;
    }
    public void sendMessage(String text) {
        messenger.sendMessage(text);
    }
    public void readMessages() {
        String msg = messenger.readMessage();
        System.out.println(msg);
    }
    public void setMessenger(MessengerService messenger) {
        this.messenger = messenger;
    }
}