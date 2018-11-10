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

    public Cloneable clone() {
        return null;
    }
}
