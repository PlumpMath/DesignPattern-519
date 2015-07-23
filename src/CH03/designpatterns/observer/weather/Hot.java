package CH03.designpatterns.observer.weather;

/**
 * @author rabeh
 *
 */
public class Hot {
	
	private String name;
	private int addressIP[];
	
	public Hot(){
		
	}
	public Hot(String name, int IP[]){
		this.name=name;
		this.addressIP=IP;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getAddressIP() {
		return addressIP;
	}
	public void setAddressIP(int[] addressIP) {
		this.addressIP = addressIP;
	}

}
