package ru.omsu.imit.course3.patterns.prototype;

import java.util.List;
import java.util.function.Function;

public abstract class Mechanism implements Cloneable{
    private List<SparePart> spareParts;

    public Mechanism(List<SparePart> spareParts) {
        this.spareParts = spareParts;
    }

    public List<SparePart> getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(List<SparePart> spareParts) {
        this.spareParts = spareParts;
    }

    public void addSparePart(SparePart sparePart) {
        spareParts.add(sparePart);
    }

    @Override
    public abstract Mechanism clone();

    @Override
    public String toString() {
        return "Mechanism {" +
                "spareParts =\n" + spareParts.toString() +
                    '}';
        }

}
