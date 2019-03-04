import java.util.Objects;

public class Adress {
    private String country;
    private String city;
    private String steet;
    private String zipCode;
    private int homeNumber;

    public Adress(String country, String city, String steet, String zipCode, int homeNumber) {
        this.country = country;
        this.city = city;
        this.steet = steet;
        this.zipCode = zipCode;
        this.homeNumber = homeNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSteet() {
        return steet;
    }

    public void setSteet(String steet) {
        this.steet = steet;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(int homeNumber) {
        this.homeNumber = homeNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return homeNumber == adress.homeNumber &&
                Objects.equals(country, adress.country) &&
                Objects.equals(city, adress.city) &&
                Objects.equals(steet, adress.steet) &&
                Objects.equals(zipCode, adress.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city, steet, zipCode, homeNumber);
    }
}