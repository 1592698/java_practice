package javaPractice.ch_16_arraylist;
import java.util.LinkedList;
import java.util.Queue;

class Message{ //Queue를 이용한 메세지 큐
	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}
public class Test08 {
	//Queue를 이용한 메시지 큐
	public static void main(String[] args) {
		//Stack은 class이지만 Queue은 interface
		Queue<Message> messageQueue = new LinkedList<Message>(); 
		//메세지 저장
		messageQueue.offer(new Message("sendMail", "최현석"));
		messageQueue.offer(new Message("sendMS", "박지훈"));
		messageQueue.offer(new Message("sendKakaotalk", "김준규"));
		
		while(!messageQueue.isEmpty()) {//메시지 큐가 비었는지 확인
			Message message = messageQueue.poll(); //메시지 큐에서 1개의 메시지 꺼냄
			switch (message.command) {
			case "sendMail": 
				System.out.println(message.to + "님에게 메일을 보냈습니다");
				break;
			case "sendMS":
				System.out.println(message.to + "님에게 SMS를 보냈습니다");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "님에게 카카오톡을 보냈습니다");
				break;
			}
		}
	}
}
