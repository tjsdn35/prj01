
public class LiteralTest {

	public static void main(String[] args) {
		// Data : Literal 상수
		// type 변수 = data;
		int      num      =  1;
		String   name     =  "카리나";   // 문자열
		double   height   = 167.3;
		float    weight   = 48.5f;
		int      bYear    = 2003;
		int      tYear    = 2026;
		String   address  = "부산";
		char     grade    = '김';
		boolean  adult    = true;
		boolean  male     = false;
		// int      balance   = 12345678900;  // error 
		long     lBalance  = 12345678900L;  // 정상 
		
		System.out.println( "번호:" + num );
		System.out.println( "이름:" + name );
		System.out.println( "생년:" + bYear);
		
		int  data = 65;
		System.out.printf("문자:%c 숫자:%d", data, data); // char, decimal int
		

	}

}













