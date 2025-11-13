package org.example;

import org.example.adapter.HdmiVgaAdapter;
import org.example.cumputer.Ecran;
import org.example.cumputer.TV;
import org.example.cumputer.UniteCentre;
import org.example.cumputer.VideoProjecteur;

public class Main {
    public static void main(String[] args) {

        UniteCentre uniteCentre = new UniteCentre();
        uniteCentre.setVga(new Ecran());
        uniteCentre.print("Bonjour");
        uniteCentre.setVga(new VideoProjecteur());
        uniteCentre.print("Bonjour TV");
        HdmiVgaAdapter hdmiVgaAdapter = new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new TV());
        uniteCentre.setVga(hdmiVgaAdapter);
        hdmiVgaAdapter.print("Bonsoir Master II-BDCC Disign Pater ");
    }
}