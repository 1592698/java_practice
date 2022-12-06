package javaPractice.ch_16_arraylist;
import java.util.LinkedList;
import java.util.Queue;

class Message{ //Queue�� �̿��� �޼��� ť
	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}
public class Test08 {
	//Queue�� �̿��� �޽��� ť
	public static void main(String[] args) {
		//Stack�� class������ Queue�� interface
		Queue<Message> messageQueue = new LinkedList<Message>(); 
		//�޼��� ����
		messageQueue.offer(new Message("sendMail", "������"));
		messageQueue.offer(new Message("sendMS", "������"));
		messageQueue.offer(new Message("sendKakaotalk", "���ر�"));
		
		while(!messageQueue.isEmpty()) {//�޽��� ť�� ������� Ȯ��
			Message message = messageQueue.poll(); //�޽��� ť���� 1���� �޽��� ����
			switch (message.command) {
			case "sendMail": 
				System.out.println(message.to + "�Կ��� ������ ���½��ϴ�");
				break;
			case "sendMS":
				System.out.println(message.to + "�Կ��� SMS�� ���½��ϴ�");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "�Կ��� īī������ ���½��ϴ�");
				break;
			}
		}
	}
}
