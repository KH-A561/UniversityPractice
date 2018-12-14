package ru.omsu.imit.course3.patterns.prototype;

public class Cogwheel extends SparePart {
    private int diameter;

    public Cogwheel(int price, Metal metal, int diameter) {
        super(price, metal);
        this.diameter = diameter;
    }

    public SparePart clone() {
        return new Cogwheel(price, metal, diameter);
    }

    @Override
    public String toString() {
        return "Cogwheel {" +
                "diameter =" + diameter +
                ", price =" + price +
                ", metal =" + metal +
                '}';
    }
}
