
public class TV {
	
	
  public int channel =1; // default channel is 1
  public int volumeLevel=1; //default volumeLevel is 1
  public boolean on = false; // Tv is off
  
  
  //constructor
  TV(){
	  
  }
  
  public void turnOn() {
	  on = true;
  }
  
  public void turnOff() {
	  on = false;
  }
  
  public void setChannel(int newChannel) {
	  if(on&&newChannel>=1 && newChannel<=110) 
	 channel=newChannel;
  }
  
  public void setVolume(int newVolumeLevel) {
	  if(on&&newVolumeLevel>=1 && newVolumeLevel<=10) 
		 volumeLevel=newVolumeLevel;
	  }
  
  public void channelUp() {
	  if(on && channel<110)
		  channel++;
  }
  
public void channelDown() {
	if(on && channel>1)
		  channel--;
  }
public void volumeUp() {
	if(on && volumeLevel<10)
		volumeLevel++;
}

public void volumeDown() {
	if(on && volumeLevel>1)
		volumeLevel--;
}

public boolean getTvStatus() {
	return on;
}

public int getChannel() {
	return channel;
}

public int getVolume() {
	return volumeLevel;
}
}
