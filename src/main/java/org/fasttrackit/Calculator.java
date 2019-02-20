package org.fasttrackit;

public class Calculator {

    private  String name;




    public Calculator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }





    public int add (int x, int y){
        return x + y;
    }
    public float add (float x, float y) {
        return x + y;
    }

    public int divide (int x, int y){
        return x / y;
    }
    public float divide (float x, float y){
        return x / y;
    }

    public int multiply (int x, int y){
        return x * y;
    }
    public float multiply (float x, float y){
        return x * y;
    }
    public int substract (int x, int y){
        return x - y;
    }
    public float substract (float x, float y){
        return x - y;
    }

}
