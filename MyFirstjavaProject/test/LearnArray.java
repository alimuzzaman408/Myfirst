package test;

public class LearnArray {


	public void stringArray(){

		String[]StatesName=	{"New York","California","Florida","New Jersey","Montana"};
		for(int i=0;i<5;i++){
			System.out.println(StatesName[i]);

		}
	}

	public void IntArray(){

		int[]number=	{1,2,3,4,5};
		for(int i=0;i<5;i++){
			System.out.println(number[i]);
		}
	}
	public void StringArray(){
		String[]StatesName={"NY","NJ","PA","Mo"};
		for(int i=0;i<StatesName.length;i++){
			System.out.println("State name is" +StatesName[i]);
		}

	}
	public void StringArray1(){
		String[]StatesName={"CA","PA","MA","ON"};
		for(int i=0;i<StatesName.length;i++){
			System.out.println("State Name is:" +StatesName[i]);
		}
	}
	public void CharArray(){
		String[]charname={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o"};
		for(int i=0;i<charname.length;i++){
		System.out.println(charname[i]);

	}			

}

}

