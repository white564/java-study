import java.util.*;


public class ParenthesisCheck2{
	static Stack<Character> stack;
		//static char current ;
		static  int count1=0;
		static int count2=0;
		static int count3=0;
		public static void main(String args[]){
			stack = new Stack<Character>();
			stack.push('0');
			try{
			System.out.println("input:\""+args[0]+"\"is"+check(args[0]));
			}catch(Exception e){
				System.out.println("input:\""+args[0]+"\"is"+"false");
			return;
			}
		}


	public static boolean check(String str){
		for(int i=0;i!=str.length();i++){
			try{
		if(stack.peek()=='(' && (str.charAt(i)=='}'||str.charAt(i)==']')){
			throw new Exception();
		}
		if(str.charAt(i)=='(' || str.charAt(i)=='{'||str.charAt(i)=='['||
				str.charAt(i)==')' || str.charAt(i)=='}'||str.charAt(i)==']'){
			stack.push(str.charAt(i));
		}
		if(stack.peek()=='{' && (str.charAt(i)==')'||str.charAt(i)==']')){
			throw new Exception();
		}
		if(stack.peek()=='[' && (str.charAt(i)=='}'||str.charAt(i)==')')){
			throw new Exception();
		}
		}catch(Exception e){
			return false;
		}
			if(str.charAt(i)=='('){
				++count1;
			}
			if(str.charAt(i)==')'){
				--count1;
				
				stack.pop();
				stack.pop();
				if(count1<0)
					return false;
			}
			if(str.charAt(i)=='{'){
				++count2;
			}
			if(str.charAt(i)=='}'){
				--count2;
				stack.pop();
				stack.pop();
				if(count2<0)
					return false;
			}
			if(str.charAt(i)=='['){
				++count3;
			}
			if(str.charAt(i)==']'){
				--count3;
				stack.pop();
				stack.pop();
				if(count3<0)
					return false;
			}
		}
	if(count1==0 && count2==0 && count3==0){
		return true;
	}else{
		return false;
	}
	}
}
