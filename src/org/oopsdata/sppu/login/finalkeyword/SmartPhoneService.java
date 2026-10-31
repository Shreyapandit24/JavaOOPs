package org.oopsdata.sppu.login.finalkeyword;

public class SmartPhoneService {
	Phone p1=new Phone();
    SmartPhone s1=new SmartPhone();
    
    void assemblePhone() {
    	s1.setCamera("Upgraded Camera");
    	s1.setVideo("Upgraded Video");
    	
    	System.out.println(p1.getCalling());
    	System.out.println(p1.getMessage());
    	System.out.println(s1.getCamera());
    	System.out.println(s1.getVideo());
    	
    }
}
