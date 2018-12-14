package ru.omsu.imit.course3.patterns.prototype;

public abstract class SparePart implements Cloneable {
    int price;
    Metal metal;

    public SparePart(int price, Metal metal) {
        this.price = price;
        this.metal = metal;
    }

    @Override
    public abstract SparePart clone();

    @Override
    public abstract String toString();
}
