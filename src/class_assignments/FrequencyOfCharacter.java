package class_assignments;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		String Userinput ="programming";
		int count =0;
//		char separate;
		
		for(int i=0;i<Userinput.length();i++) {
			for(int j=0;j<Userinput.length();j++){
				if(Userinput.charAt(i)==Userinput.charAt(j)) {
					count++;
				}
			}
			boolean alreadyPrinted = false;
			for(int k=0;k<i;k++) {
				if(Userinput.charAt(i) == Userinput.charAt(k)) {
					alreadyPrinted = true;
					break;
				}
			}
			if(!alreadyPrinted) {
				System.out.println(Userinput.charAt(i)+":"+count);
			}
			count=0;
		}
	
	}

}
