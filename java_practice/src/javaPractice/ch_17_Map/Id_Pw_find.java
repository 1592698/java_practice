package javaPractice.ch_17_Map;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Id_Pw_find {
	/* ���̵�� ��й�ȣ �˻��ϱ�
	 * ���̵� ����� �Է��� �޾Ƽ� map�� ����� ���� �񱳸� �ؼ� 
	 * 1) ������ ���̵� ����� �ִ� ��쿡�� "�α��εǾ����ϴ�"
	 * 2) ������ ���̵�� �ִµ� ����� Ʋ�� ��� "��й�ȣ�� ��ġ���� �ʽ��ϴ�"
	 * 3) ������ ���̵� ������ "�Է��Ͻ� ���̵� �������� �ʽ��ϴ�" �� ��� �ǵ��� �϶�*/
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>(); //Ű�� ������ String�� ���
		
		//���̵�� ����� �̸� ����
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ����� �Է��� �ּ���");
			System.out.println("���̵� : ");
			String id = scanner.nextLine();
			System.out.println("��� : ");
			String password = scanner.nextLine();
			System.out.println();		
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) { //Ű�� id�� value�� �Է��� ��й�ȣ ���ڿ� ��
					System.out.println("�α��� ����");
					break;
				}
				else{
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�");
				}
			}
			else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�");
			}
		}
	}
	
}