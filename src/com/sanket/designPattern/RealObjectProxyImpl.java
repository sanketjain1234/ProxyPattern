package com.sanket.designPattern;

public class RealObjectProxyImpl extends RealObjectRealImpl {

    @Override
    public void getThingsDone(){
        // Validations
        System.out.println("This is proxy implementation!! ");
        super.getThingsDone();
    }
}
