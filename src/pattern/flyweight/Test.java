package pattern.flyweight;

public class Test {

	public static void main(String[] args) {
		Ticket ticket01=TicketFactory.getTicket("北京", "上海");
		ticket01.showTicketInfo("上铺");
		Ticket ticket02=TicketFactory.getTicket("北京", "上海");
		ticket02.showTicketInfo("下铺");
		Ticket ticket03=TicketFactory.getTicket("北京", "上海");
		ticket03.showTicketInfo("坐票");
		
	}
}
//享元模式   优点：大幅度的降低了内存中对象的数量 ；  缺点：为了使对象可以共享，需要将一些状态外部化，这使得程序的逻辑复杂化  