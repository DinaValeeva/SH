package ru.lanit.edu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Room {
    private boolean hasBad;
    private int number;
    private int grade;
    private List<Slut> sluts = new ArrayList<Slut>();
    private List<Client> clients = new ArrayList<Client>();

    /**
     * возвращает наличие кровати
     * @return возвращает наличие кровати
     */

    public boolean isHasBad() {
        return hasBad;
    }

    /**
     * устанавливает наличие кровати
     * @param hasBad наличие кровати
     */
    public void setHasBad(boolean hasBad) {
        this.hasBad = hasBad;
    }

    /**
     * возвращает номер комнаты
     * @return возвращает номер комнаты
     */
    public int getNumber() {
        return number;
    }

    /**
     * устанавливает номер комнаты
     * @param number номер комнаты
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * возвращает оценку комнаты
     * @return возвращает оценку комнаты
     */
    public int getGrade() {
        return grade;
    }

    /**
     * устанавливает оценку комнаты
     * @param grade оценка комнаты
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * возвращает список/лист работниц
     * @return возвращает список/лист работниц
     */
    public List<Slut> getSluts() {
        return sluts;
    }

    /**
     * устанавлмвает лист работниц
     * @param sluts лист работниц
     */
    public void setSluts(List<Slut> sluts) {
        this.sluts = sluts;
    }

    /**
     * возвращает лист клиентов
     * @return возвращает лист клиентов
     */
    public List<Client> getClient() {
        return clients;
    }

    /**
     * устанавливает/заменяет лист клиентов
     * @param client лист клиентов
     */
    public void setClient(List<Client> client) {
        this.clients = client;
    }

    /**
     * добавляет клиента
     * @param client клиент
     */
    public void addClient(Client client){this.clients.add(client);}

    /**
     * добавляет работницу
     * @param slut работница
     */
    public void addSlut(Slut slut){this.sluts.add(slut);}

    /**
     * удаляет клиента по индексу
     * @param idClient индекс клиента
     */
    public void removeClient(int idClient){this.clients.remove(idClient);}

    /**
     * удаляет работницу по индексу
     * @param idSlut индекс работницы
     */
    public void removeSlut(int idSlut){this.sluts.remove(idSlut);}


    @Override
    public String toString() {
        return "Room{" +
                "hasBad=" + hasBad +
                ", number=" + number +
                ", grade=" + grade +
                ", sluts=" + sluts.toString() +
                ", client=" + clients.toString() +
                '}';
    }
}