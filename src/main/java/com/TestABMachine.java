package com;

public class TestABMachine {

  public static void main(String[] args) throws Exception {
    System.out.println("HelloWorld");
    com.compiler.StateMachine abMachine = new com.compiler.machines.ABMachine();
    java.io.OutputStreamWriter outWriter = new java.io.OutputStreamWriter(System.out);
    abMachine.process("AABBBB", outWriter);
    System.out.print(abMachine.asDot());
  }
}
