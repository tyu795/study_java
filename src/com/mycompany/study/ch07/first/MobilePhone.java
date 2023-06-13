package com.mycompany.study.ch07.first;

public class MobilePhone extends DmbCellphone{

	void aaa() {
		System.out.println("sljfsjsd");
		powerOn();
		changeChannelDmb(1);
	}
	
	void bbb() {
		bell();
	}
	
	@Override
	void changeChannelDmb(int channel) {
		System.out.println("MobilePhone.");
	}
	
}
