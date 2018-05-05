package test;
//Print Alphabet:
public class HomeWork {

	public void PrintAlphabet(){

		String[] AlphabetName={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		for(int i =0; i<AlphabetName.length;i++){
			System.out.print(AlphabetName[i]);
		}
		System.out.println("            ");
	}

	public void PrintAlphabet1(){

		String[] AlphabetName1={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		for(int i =AlphabetName1.length-1; i>=0;i--){
			System.out.print(AlphabetName1[i]);
		}
	}
	//Print Bangladesh:
	public void printcountry(char name){
		switch(name){
		case'B':
			System.out.println("Bangladesh");
		break;
		case'C':
			System.out.println("Denmark");
			break;
		case'D':
		System.out.println("England");
		break;
		default:
			System.out.println("Invalid grade");
		}
		System.out.println(name);
	}

	//print(0-50). True or False for Divisible number:

	public void PrintNumber(){
		for(int i=0;i<=50;i++){
			System.out.println("My Valu is " +i);
		}
	}

	public void PrintNumber1(){
		for(int i=0;i<=50;i++){
			if(i%3==0)
				System.out.println("My value  is true" +i);
			else{
				System.out.println("My Valu is false" +i);

			}
		}
	}
}









