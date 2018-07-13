package co.edureka;

public class MyMaths {
	int var;
	public int getVar() {
		return var;
	}
	public void setVar(int var) {
		this.var = var;
	}
	//Method with Some Business Logic
	public void squareOfNum(int num){
		System.out.println("Square of "+ num+  " is :" +(num*num));
		System.out.println("Var is " +(var));
	}
}
