package javaPractice.ch_19_util;

import java.text.SimpleDateFormat;
import java.util.Date;

/*Date�� SimpleDateFormat Ŭ������ �̿��ؼ�
 *������ ��¥�� �Ʒ��� ���� ����ϴ� ���α׷��� �ۼ��� ������
 *
 *������ :
 *2022�� 08�� 22�� ������ 18�� 09�� */
public class Test07 {
	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� HH�� mm��");
		System.out.println(sdf.format(new Date()));
	
	//2022�� 12�� 16�� �ݿ��� 12�� 16��

	}

}
