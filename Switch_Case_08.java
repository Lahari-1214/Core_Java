// Switch case is a control statement that allows us to execute a block of code based on the value of a variable. It is an alternative to if-else statements when we have multiple conditions to check. The switch case statement evaluates the expression and compares it with the values of each case. If there is a match, the corresponding block of code is executed. If there is no match, the default block of code is executed (if it is present). The switch case statement can be used with byte, short, char, int, String, and enum types.
public class Switch_Case_08 {

	public static void main(String[] args) {
//		int n=4;
//		int result=0;
//		if(n%2==0)
//			result=10;
//		
//		else
//			result =20;
//		System.out.println(result);
		
		int n=5;
		int result=0;
		result = n%2==0 ? 10 : 20;
		System.out.println(result);
	}

}
