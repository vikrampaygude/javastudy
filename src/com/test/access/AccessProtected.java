package com.test.access;

/**
 * Created by vikram on 15/06/18.
 */
 public class AccessProtected {


    void accessTest(){
        AccessTest test = new AccessTest();
        AccessTest.AccessInner accessInner = test.new AccessInner();
        accessInner.accessInner();

        test.sampleDefaultMehtod();
    }
}
