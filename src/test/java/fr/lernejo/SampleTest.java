package fr.lernejo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {

    @Test
    void ADD_2_by_3_should_produce_5() {
        Sample.Operation op = Sample.Operation.ADD;
        int a = 2;
        int b = 3;
        int addition = op.func.apply(a, b);
        Assertions.assertEquals(5, addition);


    }
    @Test
    void MULT_2_by_3_should_produce_6() {
        Sample.Operation op = Sample.Operation.MULT;
        int a = 2;
        int b = 3;
        int multi = op.func.apply(a, b);
        Assertions.assertEquals(6, multi);
    }

    @org.junit.jupiter.api.Test
    void N_Superior_0() {
        int n = 3;
        int rst = Sample.fact(n);
        Assertions.assertEquals(6, rst);
    }
    @org.junit.jupiter.api.Test
    void N_Ega_0() {
        int n = 0;
        int rst = Sample.fact(n);
        Assertions.assertEquals(1, rst);
    }
    @org.junit.jupiter.api.Test
    void N_Inferior_0() {

        Assertions.assertThrows(IllegalArgumentException.class,
            () -> {
                int n = -1;
                Sample.fact(n);
            });


    }
}
