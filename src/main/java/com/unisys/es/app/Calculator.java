package com.unisys.es.app;


import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Created by alumno on 10/06/15.
 */
public class Calculator {
    public int evaluate (String paramA) {
        // int numeroInt = paramA.parseInt();
        // return numeroInt;


        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine interprete = manager.getEngineByName("js");

        //String formula = "X*Y/100";
        Integer resultado = 0;
       // interprete.put("X", 5);
        //interprete.put("Y", 80);

        try {
            System.out.println("Resultado = " + interprete.eval(paramA));
            resultado = (Integer) interprete.eval(paramA);

        } catch (ScriptException se) {
            se.printStackTrace();
        }
        return resultado.intValue();
    }

}
