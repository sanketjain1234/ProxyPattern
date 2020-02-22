package com.sanket.designPattern;

public class Client {

    public static void main(String[] args) {

        //Using Proxy Class for
        RealObject realObject = new RealObjectProxyImpl();
        realObject.getThingsDone();
    }
}
