package com.unisys.es.app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 * Created by alumno on 10/06/15.
 */
public class TestBasicCalculadora {

    @Test
    public void evaluatesExpression() {
        Calculator calculator = new Calculator();
        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
    }

    @Test
    public void evaluatesExpression2() {
        Calculator calculator = new Calculator();
        int sum = calculator.evaluate("2+2+3");
        assertEquals(7, sum);
    }


    @Test  //(expected = javax.script.ScriptException)
    public void evaluatesExpression3() {
        Calculator calculator = new Calculator();
        int sum = calculator.evaluate("1+6");
        assertEquals(7, sum);
    }

}
