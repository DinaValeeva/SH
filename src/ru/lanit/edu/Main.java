package ru.lanit.edu;

public class Main {
    public static void main(String[] args) {
        SlutHouse SH = new SlutHouse();
        SH.setName("SH");

        Client roman = new Client();
        roman.setName("Roman");
        roman.setBudget(10000);
        roman.setExpactedGrade(5);
        roman.setMale(true);

        Slut ann = new Slut();
        ann.setName("Ann");
        ann.setBust(3);
        ann.setGrade(4);
        ann.setPrice(5000);

        Room room1 = new Room();
        room1.addClient(roman);
        room1.setGrade(4);
        room1.setHasBad(true);
        room1.setNumber(12);
        room1.addSlut(ann);
        SH.addRoom(room1);

        ann.dance();

        System.out.println(SH);
        System.out.println(roman);
        System.out.println(ann);
        System.out.println(room1);

    }
}