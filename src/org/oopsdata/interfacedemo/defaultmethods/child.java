package org.oopsdata.interfacedemo.defaultmethods;

public class child implements P1,P2 {
    @Override
    public void savedata(){
    	//multiple times using super keyword
    	P1.super.savedata();
    	//P2.super.savedata();
    }
}
