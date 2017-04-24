package pattern.flyweight;

import java.util.Random;

public class TrainTicket implements Ticket {

	private String from;
	private String to;
	private String bunk;
	private int price;

	public TrainTicket(String from, String to) {
		super();
		this.from = from;
		this.to = to;
	}

	@Override
	public void showTicketInfo(String bunk) {
		price=new Random().nextInt(300);
		System.out.println("购买从"+from+"到"+to+"的"+bunk+"火车票价格:"+price);
	}

}
