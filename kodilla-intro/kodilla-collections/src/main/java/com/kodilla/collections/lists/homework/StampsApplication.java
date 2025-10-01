package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();

        Stamp stamp1 = new Stamp("Polska 2023 – Orzel Bialy", 30, 40, true);
        Stamp stamp2 = new Stamp("Polska 2023 – Orzel Bialy", 30, 40, true); // taki sam jak stamp1
        Stamp stamp3 = new Stamp("USA 1995 – Statue of Liberty", 25, 35, false);
        Stamp stamp4 = new Stamp("Niemcy 2001 – Berlin", 30, 40, true);
        Stamp stamp5 = new Stamp("Polska 2023 – Orzel Bialy", 30, 40, true); // znowu taki sam

        stamps.add(stamp1);
        stamps.add(stamp2);
        stamps.add(stamp3);
        stamps.add(stamp4);
        stamps.add(stamp5);

        System.out.println("Ilosc znaczkow w kolekcji: " + stamps.size());
        System.out.println("Lista znaczkow: ");
        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}

class Stamp {
    private String name;
    private int width;
    private int height;
    private boolean stamped;

    public Stamp(String name, int width, int height, boolean stamped) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.stamped = stamped;
    }

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isStamped() {
        return stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stamp)) return false;
        Stamp stamp = (Stamp) o;
        return width == stamp.width &&
                height == stamp.height &&
                stamped == stamp.stamped &&
                Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, width, height, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", stamped=" + stamped +
                '}';
    }
}
