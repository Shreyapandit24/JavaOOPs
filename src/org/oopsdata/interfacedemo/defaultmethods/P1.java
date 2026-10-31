package org.oopsdata.interfacedemo.defaultmethods;

public interface P1 {
   default void savedata() {
	   System.out.println("P1 interface default");
   }
}
