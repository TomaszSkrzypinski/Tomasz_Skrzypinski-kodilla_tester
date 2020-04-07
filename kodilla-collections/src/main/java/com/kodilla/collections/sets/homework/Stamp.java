package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
        private String name;
        private String size;
        private String stamped;

    public Stamp(String name, String size, String stamped) {
        this.name = name;
        this.size = size;
        this.stamped = stamped;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getStamped() {
        return stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Objects.equals(name, stamp.name) &&
                Objects.equals(size, stamp.size) &&
                Objects.equals(stamped, stamp.stamped);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", stamped='" + stamped + '\'' +
                '}';
    }
}
