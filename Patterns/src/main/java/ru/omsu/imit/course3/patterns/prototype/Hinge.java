package ru.omsu.imit.course3.patterns.prototype;

public class Hinge extends SparePart {
    double height;

    public Hinge(int price, Metal metal, double height) {
        super(price, metal);
        this.height = height;
    }


    public SparePart clone() {
        return new Hinge(price, metal, height);
    }

    @Override
    public String toString() {
        return "Hinge {" +
                "height =" + height +
                ", price =" + price +
                ", metal =" + metal +
                '}';
    }
}
