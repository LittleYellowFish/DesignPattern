package pattern.flyweight;

public class Test {

	public static void main(String[] args) {
		Ticket ticket01=TicketFactory.getTicket("����", "�Ϻ�");
		ticket01.showTicketInfo("����");
		Ticket ticket02=TicketFactory.getTicket("����", "�Ϻ�");
		ticket02.showTicketInfo("����");
		Ticket ticket03=TicketFactory.getTicket("����", "�Ϻ�");
		ticket03.showTicketInfo("��Ʊ");
		
	}
}
//��Ԫģʽ   �ŵ㣺����ȵĽ������ڴ��ж�������� ��  ȱ�㣺Ϊ��ʹ������Թ�����Ҫ��һЩ״̬�ⲿ������ʹ�ó�����߼����ӻ�  