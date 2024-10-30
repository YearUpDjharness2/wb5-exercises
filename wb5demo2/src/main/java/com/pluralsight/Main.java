package com.pluralsight;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Human> people = new ArrayList<Human>();
        people.add(new Human());
        people.add(new Caveman());
        people.add(new ModernHuman());
        for(int i = 0; i < 3; i ++) {
            if (people.get(i) instanceof Human) {
                System.out.print("Human--> ");
            }
            if (people.get(i) instanceof Caveman) {
                System.out.print("Caveman--> ");
            }
            if (people.get(i) instanceof ModernHuman) {
                System.out.print("ModernPerson--> ");
            }
            people.get(i).eat();
        }
        }
    }
