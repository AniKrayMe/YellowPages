package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class YellowPages {
    private HashMap<String, ArrayList<Company>> yellowPages;

    public YellowPages() {
    }

    public YellowPages(HashMap<String, ArrayList<Company>> yellowPages) {
        this.yellowPages = yellowPages;
    }

    public  ArrayList<Company> getCompaniesByCountry(String countery) {
        if (yellowPages.containsKey( countery )) {
            return yellowPages.get( countery );
        } else {
            throw new RuntimeException();
        }
    }

    public HashMap<String, ArrayList<Company>> getYellowPages() {
        return yellowPages;
    }

    public void setYellowPages(HashMap<String, ArrayList<Company>> yellowPages) {
        this.yellowPages = yellowPages;
    }

    @Override
    public String toString() {
        return "YellowPages{" +
                "yellowPages=" + yellowPages +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        YellowPages that = (YellowPages) o;

        return yellowPages != null ? yellowPages.equals( that.yellowPages ) : that.yellowPages == null;
    }

    @Override
    public int hashCode() {
        return yellowPages != null ? yellowPages.hashCode() : 0;
    }
}

