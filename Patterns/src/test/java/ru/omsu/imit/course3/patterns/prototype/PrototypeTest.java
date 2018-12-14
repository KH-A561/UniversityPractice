package ru.omsu.imit.course3.patterns.prototype;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PrototypeTest {
    @Test
    public void clientApp() {
        List<Mechanism> mechanisms = new ArrayList<Mechanism>(Arrays.asList(new FirstMech(), new SecondMech()));
        Mechanism firstMech = mechanisms.get(0).clone();
        firstMech.addSparePart(mechanisms.get(1).getSpareParts().get(2).clone());
        mechanisms.add(firstMech);
        System.out.println(mechanisms.get(2).toString());
    }
}