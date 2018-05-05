package test;

public class Hello {

	public static void main(String[] args) {

		//creating object of variables	
		/*Variables objData=new Variables();
        /Hello      
		//calling the method	
		objData.IntegerVariables();
		objData.FloatVariables();
		objData.CharacterVariables();
		objData.StringVariables();
		objData.BooleanVariables();*/

		Calculations objCal = new Calculations();

		int result1 = objCal.SumNumbers(10, 12);
		System.out.println("*Sum value is : "+result1);

		int results2 = objCal.subNumbers(20, 12);
		System.out.println("*Subtraction value is : "+results2);

		int results3 = objCal.mulNumbers(10, 4);
		System.out.println("*Multiplication value is : "+results3);

		int results4 = objCal.devNumbers(10, 2);
		System.out.println("*Division value is : "+results4); 

		int result5=objCal.SumNumbers(20, 30);
		System.out.println("*Summation value is :" + result5);

		int result6=objCal.subNumbers(20, 10);
		System.out.println("Subtraction value is :" +result6);

		int result7 = objCal.mulNumbers(10, 2);
		System.out.println("Multiplication value is :" + result7);


		int result8=objCal.devNumbers(20, 2);
		System.out.println("Division value is :" + result8 );

		/*LearnLoop objLoop=new LearnLoop();
		objLoop.WhileLoop();
		objLoop.ForLoop();
		objLoop.DoWhileLoop();
		LearnArray objArray= new LearnArray();
		objArray.stringArray();
		
		
		LearnList objList=new LearnList();
		objList.listString();
		objList.SplitString();

		ConditionalStatement objcond=new ConditionalStatement();
		objcond.IfElseStatement();
		objcond.ifStatement();
		objcond.NestedIfStatements();
		objArray.StringArray();
		objArray.StringArray();
		objList	.ListString();
		objList.AddValuestoTheList();
		objList.RemoveValuestoTheList();
		objData.BooleanVariables();
		objList.SplitString();
		objLoop.WhileLoop();
		objLoop.ForLoop();
		objLoop.DoWhileLoop();	
		objcond.SwitchStatement('A');
		objcond.conditionalOperator();
		LearnHashMap objHash=new LearnHashMap();
		objHash.openBrowser();
		objArray.CharArray();
		objArray.IntArray();
		objList.listString();
		HomeWork objwork=new HomeWork();
		objwork.PrintAlphabet();
		objwork.PrintAlphabet1();
		objwork.printcountry('B');
		objwork.PrintNumber();
		objwork.PrintNumber1();
		LearnHashMap objHash=new LearnHashMap();
		objHash.PracticeHashmap();
		objHash.openpage();
		
		LearnList objList=new LearnList();
		//objList.SplitName();
		 objList.MyCountryList();
		objList.RemoveValuestoTheList();
		
		objList.ListStringNumber();
		 objList.AddValuestoTheList();
		 
		 LearnArray objArray= new LearnArray();
		 objArray.CharArray();*/
		
		ConditionalStatement objcond=new ConditionalStatement();
		objcond.conditionalOperator();
		
		
	}

}


