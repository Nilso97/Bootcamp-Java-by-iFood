package Metodos;

public class User {

	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		smartTv.turnOff();
		System.out.println("TV ligada? " + smartTv.on);
		
		smartTv.turnOn();
		System.out.println("TV ligada? " + smartTv.on);
		
		smartTv.changeChannel(13);
		System.out.println("Canal atual: " + smartTv.channel);
		
		smartTv.turnUpVolume();
		System.out.println("Volume atual: " + smartTv.volume);
		
		smartTv.turnDownVolume();
		System.out.println("Volume atual: " + smartTv.volume);
	}
}
