package org.oopsdata.interfacedemo.defaultmethods;

public interface P2 {
	default void savedata() {
		   System.out.println("P2 interface default");
	   }
}
