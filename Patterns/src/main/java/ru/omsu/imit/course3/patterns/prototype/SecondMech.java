package ru.omsu.imit.course3.patterns.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondMech extends Mechanism {
    public SecondMech() {
        super(new ArrayList<SparePart>(Arrays.asList(new Piston(1000, Metal.IRON, 10.5f),
                                                     new Hinge(500, Metal.ALUMINIUM, 30.5),
                                                     new Cogwheel(250, Metal.COPER, 5))));
    }

    public Mechanism clone() {
        return new SecondMech();
    }

}
