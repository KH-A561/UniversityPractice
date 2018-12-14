package ru.omsu.imit.course3.patterns.prototype;

public class Piston extends SparePart{
    private float wear;

    public Piston(int price, Metal metal, float wear) {
        super(price, metal);
        this.wear = wear;
    }

    public float getWear() {
        return wear;
    }

    public void setWear(float wear) {
        this.wear = wear;
    }

    public SparePart clone() {
        return null;
    }

    @Override
    public String toString() {
        return "Piston {" +
                "wear =" + wear +
                ", price =" + price +
                ", metal =" + metal +
                '}';
    }
}
