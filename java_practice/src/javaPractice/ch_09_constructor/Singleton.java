package javaPractice.ch_09_constructor;

import javax.management.loading.PrivateClassLoader;

public class Singleton {

		// TODO Auto-generated method stub
		/*
		�̱��� singleton
		��ü ���α׷����� �� �ϳ��� ��ü�� ���� �����ؾ� �ϴ� ��쿡 ���
		�����ڸ� ȣ���� ��ŭ ��ü�� �����Ǳ� ������
		�̱����� ������� Ŭ���� �ܺο��� new �����ڷ� �����ڸ� ȣ���� �� ������ ���ƾ��� ��
		�ܺο��� �����ڸ� ȣ�� �� �� ������ ������ �տ� Private���������ڸ� �ٿ���
		
		�׸��� �ڽ��� Ÿ���� ���� �ʵ带 �ϳ� �����ϰ� �ڽ��� ��ü�� ������ �ʱ�ȭ��
		�����ڰ� private������ Ŭ���� ���ο����� ȣ���� ����
		���� �ʵ嵵 private������ ���� �����ڸ� �ٿ� �ܺο��� �ʵ尪�� �������� ���ϵ��ϸ���
		
		��� �ܺο��� ȣ���� �� �ִ� ���� �޼ҵ��� getInstance()�� �����ϰ�
		���� �ʵ忡�� �����ϰ� �ִ� �ڽ��� ��ü�� ����
		*/
		
		private static Singleton singLeton = new Singleton();
		
		Singleton() {}
		
		static Singleton getInstance() {
			return singLeton;
		}
		

}
