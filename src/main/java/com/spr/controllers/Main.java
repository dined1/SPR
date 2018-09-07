package com.spr.controllers;

import org.json.JSONObject;

import java.util.Arrays;
import java.util.List;

public class Main {

    private static List<A> getb(){

        return Arrays.asList(new A("key"), new B("key", "value"));
    }

    public static void main(String[] args) {
        List<A> a = getb();
        conV(a);
    }

    private static boolean getas(boolean b) {
        return b;
    }

    private static void conV(List<A> a){
        System.out.println(a);
    }

}


class A{

    private String a;

    A(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }
}

class B extends A{

    private String b;

    B(String a, String b) {
        super(a);
        this.b = b;
    }

    public String getB() {
        return b;
    }
}
