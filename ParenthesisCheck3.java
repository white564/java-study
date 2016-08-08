import java.util.*;


public class ParenthesisCheck2{
	static Stack<Character> stack;
		
		static  int count1=0;
		static int count2=0;
		static int count3=0;
		public static void main(String args[]){
			stack = new Stack<Character>();
			try{
			System.out.println("input:\""+args[0]+"\"is"+check(args[0]));
			}catch(Exception e){
				System.out.println("input:\""+args[0]+"\"is"+"false");
			return;
			}
		}


	public static boolean check(String str){
		for(int i=0;i!=str.length();i++){
		if(str.charAt(i)=='(' || str.charAt(i)=='{'||str.charAt(i)=='['||
				str.charAt(i)==')' || str.charAt(i)=='}'||str.charAt(i)==']'){
			stack.push(str.charAt(i));
		//System.out.println("プッシュされました");
		}
		try{//
		if(stack.peek()=='(' && (str.charAt(i)=='}'||str.charAt(i)==']')){
			System.out.println("erro1");
			throw new Exception("hello");
		}
		if(stack.peek()=='{' && (str.charAt(i)==')'||str.charAt(i)==']')){
			System.out.println("erro2");
			throw new Exception("hello");
		}
		if(stack.peek()=='[' && (str.charAt(i)=='}'||str.charAt(i)==')')){
			System.out.println("erro3");
			throw new Exception("hello");
		}
		}catch(Exception e){
			System.out.println("かっこのエラーです");
			return false;
		}
			if(str.charAt(i)=='('){
				++count1;
			}
			if(str.charAt(i)==')'){
				--count1;
				
				stack.pop();
				stack.pop();
			//	System.out.println("popされました");
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
			//	System.out.println("popされました");
				if(count2<0)
					return false;
			}
			if(str.charAt(i)=='['){
				++count2;
			}
			if(str.charAt(i)==']'){
				--count3;
				stack.pop();
				stack.pop();
			//	System.out.println("popされました");
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
