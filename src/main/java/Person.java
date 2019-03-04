import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private Adress adress;
    private Double timeOfHalfMaraton;
    private double timeOfMaraton;

    public Person(String name, String surname, Adress adress, Double timeOfHalfMaraton, double timeOfMaraton) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.timeOfHalfMaraton = timeOfHalfMaraton;
        this.timeOfMaraton = timeOfMaraton;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Double getTimeOfHalfMaraton() {
        return timeOfHalfMaraton;
    }

    public void setTimeOfHalfMaraton(Double timeOfHalfMaraton) {
        this.timeOfHalfMaraton = timeOfHalfMaraton;
    }

    public double getTimeOfMaraton() {
        return timeOfMaraton;
    }

    public void setTimeOfMaraton(double timeOfMaraton) {
        this.timeOfMaraton = timeOfMaraton;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Double.compare(person.timeOfMaraton, timeOfMaraton) == 0 &&
                Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname) &&
                Objects.equals(adress, person.adress) &&
                Objects.equals(timeOfHalfMaraton, person.timeOfHalfMaraton);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, adress, timeOfHalfMaraton, timeOfMaraton);
    }
}
