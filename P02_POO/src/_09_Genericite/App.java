package _09_Genericite;

public class App {
	public static void main(String[] args) {

		MyGeneric<String> myGenericStr = new MyGeneric<String>("Coucou");
		MyGeneric<Integer> myGenericInteger = new MyGeneric<Integer>(56);
		
		System.out.println(myGenericStr);
		System.out.println(myGenericInteger);
		
		MyGeneric<String> myGenericStr2 = new MyGeneric<String>("Coucou");
		
		System.out.println(myGenericStr.egal(myGenericStr2));
		
		System.out.println(myGenericInteger.egal(new MyGeneric<Integer>(45)));
	}
}
