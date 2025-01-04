package class_assignments;
import java.lang.String;

public class ReverseWord {

	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder("Hello World");
		String sb = "Hello World";
		String a[] = sb.split(" ");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}

}
