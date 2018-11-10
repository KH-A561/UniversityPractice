public abstract class SparePart implements Cloneable {
    int price;
    Metal metal;

    public SparePart(int price, Metal metal) {
        this.price = price;
        this.metal = metal;
    }
}
