package ru.lanit.edu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlutHouse {
    private List<Room> rooms = new ArrayList<Room>();
    private String name;

    /**
     * возвращает лист комнат
     * @return возвращает лист комнат
     */

    public List<Room> getRooms() {
        return rooms;
    }

    /**
     * устанавливает лист комнат
     * @param rooms лист комнат
     */
    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    /**
     * добавляет комнату
     * @param room комната
     */
    public void addRoom(Room room){rooms.add(room);}

    /**
     * возвращает название заведения
     * @return возвращает название заведения
     */

    public String getName() {
        return name;
    }

    /**
     * устанавливает название заведения
     * @param name название заведения
     */
    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "SlutHouse{" +
                "rooms=" + rooms.toString() +
                ", name='" + name + '\'' +
                '}';
    }
}