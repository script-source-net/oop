package com.company;

public class Taxi extends Car{
    int possibleNumberOfPassengers;
    String company;
    boolean hasOpen24Hours;

    public Taxi(int possibleNumberOfPassengers, String company, boolean hasOpen24Hours){
        super("Mercedes", "Yellow", 50);
        this.company = company;
        this.possibleNumberOfPassengers = possibleNumberOfPassengers;
        this.hasOpen24Hours = hasOpen24Hours;
    }

    public int getPossibleNumberOfPassengers() {
        return possibleNumberOfPassengers;
    }

    public void setPossibleNumberOfPassengers(int possibleNumberOfPassengers) {
        this.possibleNumberOfPassengers = possibleNumberOfPassengers;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public boolean isHasOpen24Hours() {
        return hasOpen24Hours;
    }

    public void setHasOpen24Hours(boolean hasOpen24Hours) {
        this.hasOpen24Hours = hasOpen24Hours;
    }

    public void drive(){
        String hours24;
        if (hasOpen24Hours){
            hours24 = "Ich fahre 24h";
        } else {
            hours24 = "Ich fahre keine 24h";
        }
        System.out.println(hours24 + " ein " + this.getBrand() + " Taxi mit " + this.possibleNumberOfPassengers + " Passagierplätzen");
    }
}
