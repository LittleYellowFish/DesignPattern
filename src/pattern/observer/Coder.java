package pattern.observer;

import java.util.Observable;
import java.util.Observer;

public class Coder implements Observer {

	public String name;

	public Coder(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println("Hi,"+name+"¸üĞÂÀ²£¡ÄÚÈİ£º"+arg1);
	}

	@Override
	public String toString() {
		return "Coder [name=" + name + "]";
	}

	
}
