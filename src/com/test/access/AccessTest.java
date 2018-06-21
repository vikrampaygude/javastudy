package com.test.access;

/**
 * Created by vikram on 15/06/18.
 */
public class AccessTest {


    long id;
    private String aPrivateVar;
    String defaultVar;
    public String publicVar;
    protected String protectedVar;
    private final String finalVar;

    public AccessTest() {
        finalVar = null;
    }

    class AccessInner{
        private String innerVar;
        void accessInner(){

        }
    }

    protected void sampleDefaultMehtod(){


    }


    public static void main(String[] args) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccessTest that = (AccessTest) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
