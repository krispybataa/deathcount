package org.example.deathcount;

public class Counter {
    private int deaths;

    //no arg constructor
    public Counter(){
        this.deaths = 0;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }
    public void addDeaths(){
        this.deaths += 1;
    }

    public void resetDeaths(){
        this.deaths = 0;
    }

    @Override
    public String toString() {
        return " " + deaths + " ";
    }
}
