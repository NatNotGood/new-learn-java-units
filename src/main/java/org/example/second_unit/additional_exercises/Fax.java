package org.example.second_unit.additional_exercises;

public class Fax extends MultifunctionDevice{
    private String ip;

    public Fax() {
        System.out.println("Факс создан");
        this.ip = "192.168.0.1";
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
