package com.pluralsight;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();

        //Asset a1 = new Asset("Golden Necklace", "2004", 200);

       //assets.add(a1);

          House h1 = new House("Main House","2001",200000,"123 s Street",2,1500,4000);
          House h2 = new House("Main House","2001",150000,"223 s Street",3,900,1500);
         Vehicle v1 = new Vehicle("Daily","2011",4000,"Jeep Wrangler", 2011,100000);
         Vehicle v2 = new Vehicle("Race","2015",15000,"Dodge Hellcat", 2011,10000);
        assets.add(h1);
        assets.add(h2);
        assets.add(v1);
        assets.add(v2);
        double networth = 0;


        for(Asset a : assets){
            System.out.println(a.getDescription() + " Acquired on " + a.getDateAcquired() + " for " + a.getOriginalCost() + " is now worth: " + a.getValue());
            networth += a.getValue();

        }
        System.out.println("Total net worth: " + networth);
    }


}