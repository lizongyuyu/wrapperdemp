package wrapperdemo;

public class WrapperDoubleDemo {
	public static void main(String[] args) {
		/**
		 * parseDouble(String) -double
		 * 将一个String类型转换为double类型
		 * 静态方法
		 * 八种数据类型都提供了parsexxx()方法，将String转为需要的数据
		 * 符合规范
		 */
		String str = "23.3";
		double d = Double.parseDouble(str);
		System.out.println(d);
		/**
		 * toString() -String
		 */
		Double dou = new Double(222.33);
		String s = dou.toString();
		System.out.println(s+""+s.getClass());
		
		/**
		 * valueOf(double)-Double
		 */
		double dd = 333.3;
		Double doubles = Double.valueOf(dd);
		System.out.println(doubles+""+doubles.getClass());
		/**
		 * doublevalue(Double) -double
		 */
		double dddd = dou.doubleValue();
		System.out.println(dddd+" ");
	}

}
