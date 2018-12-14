package ru.omsu.imit.course3.patterns.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstMech extends Mechanism {
    public FirstMech() {
        super(new ArrayList<SparePart>(Arrays.asList(new Piston(2000, Metal.IRON, 2.0f),
                new Cogwheel(250, Metal.COPER, 5),
                new Cogwheel(300, Metal.ALUMINIUM, 8))));
    }

    public Mechanism clone() {
        return new FirstMech();
    }
}
