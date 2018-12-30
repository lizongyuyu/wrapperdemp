package wrapperdemo;

public class WrapperDemo {
	public static void main(String[] args) {
		/**
		 * Integer类中的常用方法
		 */
		
		/**
		 * intvalue();-int
		 * 将对象中的值用int表示
		 */
		Integer it = new Integer(15);
		int i = it.intValue();
		System.out.println(i);
		
		/**
		 * valueOf(int)-Integer
		 * 得到一个int类型值的Integer实例
		 */
		int a = 5;
		Integer is = Integer.valueOf(20);
		System.out.println(is+" "+is.getClass());
		
		/**
		 * parstInt() -int 
		 * 得到字符串中数字的int类型表示
		 * 静态类
		 */
		String str = "30";
		int b = Integer.parseInt(str);
		System.out.println(b);
		/**
		 * toString() -String 非静态类型
		 * toString(int i) -String 静态
		 * 
		 */
		//非静态方法
		Integer ints = new Integer(34);
		String strs = ints.toString();
		System.out.println(strs+" " +strs.getClass());
		//静态方法
		int ii = 90;
		String sss = Integer.toString(ii);
		System.out.println(sss);
		
	}

}
