package javaPractice.ch_19_util;

import java.math.BigDecimal;
import java.security.PublicKey;

public class Test15 {

	public static void main(String[] args) {
		
		/* BigDecimal : ��Ȯ�� �Ҽ��� ������ �ؾ� �� �� BigDecimal Ŭ������ ���
		 * double, long ���� �Ҽ��� ������ �� �� ������ ���� �κ��� ����*/
		
		double a = 24.3953;
		double b = 50.343998;
		System.out.println(a+b);//74.73929799999999
		
		BigDecimal number = new BigDecimal(String.valueOf(a));
		//double�� �ڷḦ ���ڿ��� ��ȯ�� BigDecimal�� ��ü ����
		BigDecimal number2= new BigDecimal(String.valueOf(b));
		//add() �޼ҵ带 Ȱ���Ͽ� ��Ȯ�� ��� ���� ��ȯ
		System.out.println(number.add(number2)); //74.739298

	}

}
