package co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String memberName = null;
		String memberDeetz = null;
		String dueDate = null;
		boolean complete = false;
		int userInput;
		
		ArrayList<Task> tasks = new ArrayList<>();
		
		System.out.println("Welcome to the Task Manager!\n");
		
		menu();
		System.out.println();
		
		System.out.print("What would would you like to do? ");
		userInput = scan.nextInt();
		
		do {
			
		if (userInput == 1) {
			for (Task t : tasks) {
				System.out.println(t);
			}
		} 
		else if (userInput == 2) {
			System.out.println("ADD TASK");
			
			Task task2 = new Task();
			
			System.out.println("Team Member Name: ");
			task2.setMemberName(memberName);
			memberName = scan.next();
			
			System.out.println("Task Description: ");
			task2.setMemberDeetz(memberDeetz);
			memberDeetz = scan.next();
			
			System.out.println("Due Date: ");
			task2.setDueDate(dueDate);
			dueDate = scan.next();
			
//			task2.setComplete(complete);
//			complete = scan.hasNext();
			
			System.out.println("Task entered!");
			tasks.add(task2);
			
			
//			tasks.addAll(userInput, tasks);
		} 
		else if (userInput == 3) {
			tasks.remove(userInput);
		}
		else if (userInput == 4) {
			
			System.out.println("Task entered!");
			complete = true;
			
		} else if (userInput != 5) {
			
			System.out.println("Thank you for using the task manager!");
			
		}
		
		
		
		Task task1 = new Task();
		task1.setMemberName(memberName);
		memberName = scan.next();
		
		task1.setMemberDeetz(memberDeetz);
		memberDeetz = scan.next();
		
		task1.setDueDate(dueDate);
		dueDate = scan.next();
		
		task1.setComplete(complete);
		complete = scan.hasNext();
			
		tasks.add(task1);

		} while(userInput != 5);
		
	}
	
	public static void menu() {
		System.out.println("1. List tasks");
		System.out.println("2. Add task");
		System.out.println("3. Delete task");
		System.out.println("4. Mark task complete");
		System.out.println("5. Quit");

	}

}
