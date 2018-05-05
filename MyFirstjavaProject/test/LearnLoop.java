package test;

public class LearnLoop {
	public void WhileLoop(){
		int X=10;

		while (X<20){
			System.out.println("Value of X is" +X);
			X++; // X=X=1

		}
	}

	public void ForLoop(){
		for(int X=10;X<20;X++){
			System.out.println("Value of X is:" +X);
		}

	}
	public void DoWhileLoop(){
		int X=10;
		do{
			System.out.println("Value of X is  DoWhileLoop is:" + X);
			X++;
		}while(X<20);
	}

}
