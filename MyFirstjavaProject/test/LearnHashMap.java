package test;
import java.util.*;

public class LearnHashMap {
	public void HashMap(){
		HashMap<String,String>hmap=new HashMap<String,String>();

		hmap.put("Wells Fargo", "My bank Name is");
		hmap.put("New York", "My state Name");
		System.out.println(hmap.get("Wells Fargo"));




	}
	public void openBrowser(){
		HashMap<String,String>browserName=new HashMap<String,String>();
		browserName.put("IE", "iexplore.exe");
		browserName.put("Firefox", "firefox.exe");
		System.out.println(browserName.get("Firefox"));
	}

	public void PracticeHashmap(){
		HashMap<String,String>hmap=new HashMap<String,String>();
		hmap.put("TD bank", "My Bank name ");

		hmap.put("New York", "My City name ");

		System.out.println(hmap.get("TD bank"));

	}
	public void openpage(){
		HashMap<String,String>openpage=new HashMap<String,String>();
		openpage.put("IE", "Iexplore.exe");
		openpage.put("Firefox", "Firefox.exe");
		System.out.println(openpage.get("Firefox"));


	}


}
