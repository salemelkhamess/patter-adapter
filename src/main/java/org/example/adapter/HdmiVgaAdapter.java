package org.example.adapter;

import org.example.cumputer.Hdmi;
import org.example.cumputer.VGA;

public class HdmiVgaAdapter implements VGA {
    public Hdmi hdmi;
    @Override
    public void print(String message) {
        System.out.println("================= Adapter ==============");
        byte[] data = message.getBytes();
        hdmi.view(data);
        System.out.println("================= Adapter ==============");

    }

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }
}
