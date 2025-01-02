package com;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ABMachineTest {

    @Test
    public void testAccept() throws Exception {
        com.compiler.StateMachine abMachine = new com.compiler.machines.ABMachine();
        java.io.OutputStreamWriter outWriter = new java.io.OutputStreamWriter(System.out);
        abMachine.process("AABBBB", outWriter);
        assertTrue(abMachine.isFinalState());
    }

    @Test
    public void testNoAccept() throws Exception {
        com.compiler.StateMachine abMachine = new com.compiler.machines.ABMachine();
        java.io.OutputStreamWriter outWriter = new java.io.OutputStreamWriter(System.out);
        abMachine.process("BBBBAA", outWriter);
        assertTrue(!abMachine.isFinalState());
    }

    @Test
    public void testNoAccept2() throws Exception {
        com.compiler.StateMachine abMachine = new com.compiler.machines.ABMachine();
        java.io.OutputStreamWriter outWriter = new java.io.OutputStreamWriter(System.out);
        abMachine.process("A", outWriter);
        assertTrue(!abMachine.isFinalState());
    }
}
