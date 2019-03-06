package ru.lanit.edu;

public class Slut {
    private String name;
    private int Bust;
    private double price;
    private int grade;

    /**
     * возвращает имя работницы
     * @return возвращает имя работницы
     */

    public String getName() {
        return name;
    }

    /**
     * устанавливает имя работницы
     * @param name имя работницы
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * возвращает размер груди работницы
     * @return возвращает размер груди работницы
     */
    public int getBust() {
        return Bust;
    }

    /**
     * устанавливает размер груди работницы
     * @param bust размер груди работницы
     */
    public void setBust(int bust) {
        Bust = bust;
    }

    /**
     * возвращает прайс работницы
     * @return возвращает прайс работницы
     */
    public double getPrice() {
        return price;
    }

    /**
     * устанавливает прайс работницы
     * @param price прайс работницы
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * возвращает оценку работницы
     * @return возвращает оценку работницы
     */
    public int getGrade() {
        return grade;
    }

    /**
     * устанавливает оценку работницы
     * @param grade оценка работницы
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }


    public void dance(){
        System.out.println(name+" танцует");
    }

    @Override
    public String toString() {
        return "Slut{" +
                "name='" + name + '\'' +
                ", Bust=" + Bust +
                ", price=" + price +
                ", grade=" + grade +
                '}';
    }
}