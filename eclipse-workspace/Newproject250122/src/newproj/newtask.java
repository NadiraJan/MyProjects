package newproj;

import java.util.Scanner;

public class newtask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//we given global variables: budgetTotal and expenses
	 int budgetTotal=0;
	 int expenses = 0;
	
	 Scanner keyboard = new Scanner(System.in);
	  while(true) {
		  System.out.println("[1] + Add Income");
		  System.out.println("[2] + Add Expense");
		  System.out.println("[3] i Total Budget");
		  System.out.println("[1] x Exit");
		  int choice = keyboard.nextInt();//user's choice
		  
		  switch(choice) {
		  case 1: 
			  boolean IncomeLogic = true;
			  while(IncomeLogic) {
			  System.out.println(" Add a new income");
		  int income = keyboard.nextInt(); //2000
		  budgetTotal += income; //budgetTotal = 0+2000=2000
		  IncomeLogic = false;
		  
		  }
		  break;
		  case 2:
		  boolean expensesLogic = true;
		  while(expensesLogic) {
		   System.out.println("Add new expense: ");
		  int expense = keyboard.nextInt(); 
		  budgetTotal -= expense;//RESULT: 
		 // budgetTotal =  budgetTotal -expense
		  //2000-540 = budgetTotal 540
		  expenses += expense;//this is for scanner object
		  expensesLogic=false;
		  }
		  break;
  case 3: 
			  System.out.println(budgetTotal);
		  break;
		 
  case 4: System.out.println("You are leaving");
		  System.exit(0);
		  break;
		  
	  }}}}
	
		
		
