package com.java.training;

public class TestTV {
	public static void main(String []args ){
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(7);
		
		
		TV sony = new TV();
		sony.turnOn();
		sony.channelUp();
		sony.channelDown();
		sony.volumeUp();
		
		System.out.println("tv1's channel is " + tv1.channel+ "\n tv1 volume is " + tv1.volumeLevel);
		System.out.println("sony's channel is " + sony.channel+ "\n tv1 volume is " + sony.volumeLevel);

	}

}
