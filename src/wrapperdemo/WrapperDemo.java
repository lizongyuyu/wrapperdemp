package wrapperdemo;

public class WrapperDemo {
	public static void main(String[] args) {
		/**
		 * Integer���еĳ��÷���
		 */
		
		/**
		 * intvalue();-int
		 * �������е�ֵ��int��ʾ
		 */
		Integer it = new Integer(15);
		int i = it.intValue();
		System.out.println(i);
		
		/**
		 * valueOf(int)-Integer
		 * �õ�һ��int����ֵ��Integerʵ��
		 */
		int a = 5;
		Integer is = Integer.valueOf(20);
		System.out.println(is+" "+is.getClass());
		
		/**
		 * parstInt() -int 
		 * �õ��ַ��������ֵ�int���ͱ�ʾ
		 * ��̬��
		 */
		String str = "30";
		int b = Integer.parseInt(str);
		System.out.println(b);
		/**
		 * toString() -String �Ǿ�̬����
		 * toString(int i) -String ��̬
		 * 
		 */
		//�Ǿ�̬����
		Integer ints = new Integer(34);
		String strs = ints.toString();
		System.out.println(strs+" " +strs.getClass());
		//��̬����
		int ii = 90;
		String sss = Integer.toString(ii);
		System.out.println(sss);
		
	}

}
