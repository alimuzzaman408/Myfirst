package test;

import java.util.ArrayList;
import java.util.List;
public class LearnList{

	public void ListStringNumber(){
		List<String>LstStr=new ArrayList<String>();
		LstStr.add("One");
		LstStr.add("Two");
		LstStr.add("Three");
		LstStr.add("Four");
		LstStr.add("Five");
		System.out.println(" List value is " +LstStr);
	}
	public void  AddValuestoTheList(){
		List<String>lstStr=new ArrayList<String>();
		lstStr.add("six");
		lstStr.add("seven");
		lstStr.add("Eight");
		lstStr.add("Nine");
		System.out.println("List Valu is:" + lstStr);
	}
	public void  RemoveValuestoTheList(){
		List<String>lstStr=new ArrayList<String>();
		lstStr.remove("One");
		lstStr.remove("Five");
		System.out.println("LIst value is:" + lstStr);
	}


	public void MyCountryList(){

		List<String>LstStr=new ArrayList<String>();
		LstStr.add("Bangladesh");
		LstStr.add("USA");
		LstStr.add("UK");
		LstStr.add("LONDON");
		LstStr.add("NORWAY");
		LstStr.add("KSA");
		LstStr.add("Turkey");
		LstStr.add("Uruguy");
		LstStr.add("Canada");
		LstStr.add("Oman");
		System.out.println(LstStr);
	}
	public void removename(){
		List<String>LstStr=new ArrayList<String>();
		LstStr.remove("Oman");
		System.out.println(LstStr);


	}
	public void SplitString(){
		String names="Jhon,Mathew,Ali,Abrahamabu,Rafiq,Kamal,Sujon";
		String[]namesArray=names.split(",");
		for(int i=0;i<namesArray.length;i++){
			System.out.println("Name is:" +namesArray[i]);
		}
	}

	public void SplitName(){

		String Name="Jhon,Mathew,Ali,Abrahamabu,Rafiq,Kamal,Sujon";
		String[]NameArray=Name.split(",");
		for(int i=0;i<NameArray.length;i++){
			System.out.println(NameArray[i]);
		}
	}
}













