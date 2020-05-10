package com.wgcisotto.behavioral.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ExpressionTests {

    static Expression buildInterpreterTree(){
        Expression terminal1 = new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression terminal3 = new TerminalExpression("Bears");

        //Tigers and Bears
        Expression alternation1 = new AndExpression(terminal2, terminal3);

        // Lions or (Tigers and Bears)
        Expression alternation2 = new OrExpression(terminal1, alternation1);

        return new AndExpression(terminal3, alternation2);
    }

    /**
     * main method - build the interpreter and then interpret a specific
     * sequence
     *
     */

    @Test
    public void run(){

        String context1 = "Lions";
        String context2 = "Tigers";
        String context3 = "Bears";
        String context4 = "Lions Tigers";
        String context5 = "Lions Bears";
        String context6 = "Tigers Bears";
        String context7 = "Tigers Bears Lions";


        Expression define = buildInterpreterTree();

        assertFalse(define.interpret(context1));
        assertFalse(define.interpret(context2));
        assertFalse(define.interpret(context3));
        assertFalse(define.interpret(context4));
        assertTrue(define.interpret(context5));
        assertTrue(define.interpret(context6));
        assertTrue(define.interpret(context7));

    }


}
