package com.mycompany.study.TRTR;

public class ExRemoteControl {

	public static void main(String[] args) {
		RemoteControl rc;
		
		
		rc = new Television();
		rc.turnOn();
		
		rc = new Radio();
		rc.turnOn();
		

	}

}
