package CH03.designpatterns.observer.weatherobservable;
import CH03.designpatterns.observer.weather.Hot;

import java.util.ArrayList;



public class GroupMulticast {
	
	private ArrayList<Hot> subscribers;
	
	public GroupMulticast (){
		subscribers= new ArrayList<Hot>();
	}

	
	public void registerHot(Hot o) {
		this.subscribers.add(o);
	}
	
	public void removeHot(Hot o) {
		int i = this.subscribers.indexOf(o);
		if (i >= 0) {
			this.subscribers.remove(i);
		}
	}
	public void desplaySubscriber(){
		System.out.println("liste of subscribers: ");
		Hot hot= new Hot();
		for(int i=0;i<this.subscribers.size();i++){
		    hot =(Hot)this.subscribers.get(i);
			System.out.println("name: "+hot.getName());

		}
	 
	}
	
	
}
