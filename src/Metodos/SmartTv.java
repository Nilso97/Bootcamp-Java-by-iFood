package Metodos;

public class SmartTv {

	boolean on = false;
	int channel = 1;
	int volume = 25;
	
	public void turnOn() {
		on = true;
	}
	
	public void turnOff() {
		on = false;
	}
	
	public void changeChannel(int newChannel) {
		channel = newChannel;
	}
	
	public void turnUpChannel() {
		channel++;
	}
	
	public void turnDownChannel() {
		channel--;
	}
	
	public void turnUpVolume() {
		volume++;
		System.out.println("Aumentando o volume para: " + volume);
	}
	
	public void turnDownVolume() {
		volume--;
		System.out.println("Diminuindo o volume para: " + volume);
	}
}
