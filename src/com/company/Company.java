package com.company;

public class Company {
    private String name;
    private String address;
    private int quantityOfWorkers;
    private String country;

    public Company() {
    }

    public Company(String name, String address, int quantityOfWorkers, String country) {
        this.name = name;
        this.address = address;
        this.quantityOfWorkers = quantityOfWorkers;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getQuantityOfWorkers() {
        return quantityOfWorkers;
    }

    public void setQuantityOfWorkers(int quantityOfWorkers) {
        this.quantityOfWorkers = quantityOfWorkers;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company = (Company) o;

        if (quantityOfWorkers != company.quantityOfWorkers) return false;
        if (name != null ? !name.equals( company.name ) : company.name != null) return false;
        if (address != null ? !address.equals( company.address ) : company.address != null) return false;
        return country != null ? country.equals( company.country ) : company.country == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + quantityOfWorkers;
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", quantityOfWorkers=" + quantityOfWorkers +
                ", country='" + country + '\'' +
                '}';
    }
}
