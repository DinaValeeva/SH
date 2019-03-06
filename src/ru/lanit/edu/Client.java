package ru.lanit.edu;

public class Client {
    private String name;
    private double budget;
    private int expactedGrade;
    private boolean isMale;

    /**
     * возвращает имя текущего клиента
     * @return возвращает имя клиента
     */
    public String getName() {
        return name;
    }

    /**
     * устанавливает имя клиента
     * @param name имя клиента
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * возвращает бюджет текущего клиента
     * @return возвращает бюджет текущего клиента
     */
    public double getBudget() {
        return budget;
    }

    /**
     * устанавливает бюджет клиента
     * @param budget бюджет клиента
     */
    public void setBudget(double budget) {
        this.budget = budget;
    }

    /**
     * возвращает оценку клиента
     * @return возвращает оценку клиента
     */
    public int getExpactedGrade() {
        return expactedGrade;
    }

    /**
     * устанавливает оценку клиента
     * @param expactedGrade оценка клиента
     */

    public void setExpactedGrade(int expactedGrade) {
        this.expactedGrade = expactedGrade;
    }

    /**
     * возвращает пол клиента
     * @return возвращает пол клиента
     */
    public boolean isMale() {
        return isMale;
    }

    /**
     * устанавливает пол клиента
     * @param male пол клиента
     */
    public void setMale(boolean male) {
        isMale = male;
    }



    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", budget=" + budget +
                ", expactedGrade=" + expactedGrade +
                ", isMale=" + isMale +
                '}';
    }
}
