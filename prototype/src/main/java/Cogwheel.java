public class Cogwheel extends SparePart {
    private int price;
    private Metal metal;
    private int diameter;

    public Cogwheel(int price, Metal metal, int diameter) {
        super(price, metal);
        this.diameter = diameter;
    }

    public Cloneable clone() {
        return new Cogwheel(price, metal, diameter);
    }
}
