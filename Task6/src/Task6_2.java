
public class Task6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating two objects
		TV tv = new TV();
		TV radio = new TV();
		
		tv.turnOn();
		tv.setChannel(5);
		tv.channelUp();
		tv.setVolume(9);
		tv.volumeDown();
		
		System.out.println("your TV is " +tv.getTvStatus());
		System.out.println("your channel is " + tv.getChannel());
		System.out.println("your volume is " + tv.getVolume()+"\n");
		
		radio.turnOn();
		radio.setChannel(2);
		radio.channelDown();
		radio.setVolume(9);
		radio.volumeUp();
		radio.turnOff();
		
		
		System.out.println("your channel is " + radio.getChannel());
		System.out.println("your volume is " + radio.getVolume());
		System.out.println("your Radio is " +radio.getTvStatus());
	}

}
