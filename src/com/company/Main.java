package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Company company1 = new Company( "Ucom", "Myasnikyan", 125, "Armenia" );
        Company company2 = new Company( "Vaspur", "Gugo", 256, "USA" );
        Company company3 = new Company( "Vardan", "Kentron", 3, "Armenia" );
        Company company4 = new Company( "Janatan", "Burbank", 658, "USA" );
        Company company5 = new Company( "Fred", "France", 789, "France" );
        ArrayList<Company> armCompanies = new ArrayList<>();
        ArrayList<Company> uSACompanies = new ArrayList<>();
        ArrayList<Company> francecompanies = new ArrayList<>();

        armCompanies.add( company1 );
        armCompanies.add( company3 );
        uSACompanies.add( company2 );
        uSACompanies.add( company4 );
        francecompanies.add( company5 );
        YellowPages yellowPages = new YellowPages(new HashMap<>( ));
        yellowPages.getYellowPages().put( company1.getCountry(),armCompanies );
        yellowPages.getYellowPages().put( company2.getCountry(),uSACompanies );
        yellowPages.getYellowPages().put( company3.getCountry(),armCompanies );
        yellowPages.getYellowPages().put( company4.getCountry(),uSACompanies );
        yellowPages.getYellowPages().put( company5.getCountry(),francecompanies );

        ArrayList<Company> s= yellowPages.getCompaniesByCountry( "Armenia" );
        for (int i = 0; i <1 ; i++) {
            System.out.println(s);
            System.out.println();
        }
    }
}
