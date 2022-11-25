package javaPractice.ch_02;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*문자열을 기본 타입으로 강제 타입 변환
		 * String은 int나 char처럼 기본 자료 타입이 아니라
		 * 클래스의 객체 형태라서 일반적인 형변환과 다름
		 */
		
		String str = "la";
		//int value= Integer.parseInt(str); //문자열에 숫자외의 문자가 있으면 변환이 되지 않음
		
		//String ->byte
		String str1 = "10";
		byte value1 = Byte.parseByte(str1);
		System.out.println(value1); //10
		
		//String ->short
		String str2 = "200";
		short value2 = Short.parseShort(str2);
		System.out.println(value2); //200
		
		//String ->int
		String str3= "300000";
		int value3 = Integer.parseInt(str3);
		System.out.println(value3); //300000
		
		//String ->long
		String str4 = "4000000000";
		long value4 = Long.parseLong(str4);
		System.out.println(value4); //4000000000
		
		//String ->float
		String str5 = "12.345";
		float value5 = Float.parseFloat(str5);
		System.out.println(value5); //12.345
		
		//String ->double
		String str6 = "12.345";
		double value6 = Double.parseDouble(str6);
		System.out.println(value6); //12.345


		//String ->boolean
		String str7 = "true";
		boolean value7 = Boolean.parseBoolean(str7);
		System.out.println(value7); //true
	}

}
