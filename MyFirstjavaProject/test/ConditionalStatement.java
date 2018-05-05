package test;

public class ConditionalStatement {

	public void ifStatement(){
		int x=10;
		if(x<20){
			System.out.println("This is only statement");
		}
	}
	public void IfElseStatement(){
		int x=30;
		if(x<20){
			System.out.println("This is if statement");
		}
		else {System.out.println("This is else Statement");
		}
	}


	public void NestedIfStatements(){
		int x=30;
		int y=10;
		if(x<35){
			if(y<15){
				System.out.println("This is NestedIfStatement");
			}
		}
	}
	public void SwitchStatement(char grade){
		switch(grade){
		case'A':System.out.println("Excellent");
		break;
		case'B':System.out.println("Well Done");
		break;
		case'C':System.out.println("Average");
		break;
		case'D':System.out.println("You are passed");
		break;
		case'F':System.out.println("Better try it again");
		break;
		default:System.out.println("Invalid grade");
		}
		System.out.println("Your grade is:"+ grade);
	}
	public void conditionalOperator(){
		int a,b;
		a=10;
		b=(a==1)? 20:30;
		System.out.println("Value of b is" +b);

		b=(a==10)? 20:30;
		System.out.println("Value of b is" +b);

	}
}





