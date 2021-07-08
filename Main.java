package manageCompany;
import manageCompany.Entities.*;
import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Main{
	
	
	
	public static void main(String arg[]){
		
		
		 Random rand = new Random();
		Scanner myObj = new Scanner(System.in);
		
		
		//int personalCode = rand.nextInt();
		
		System.out.println("1. show department list\n 2. show all employee list \n 3. show all team of a manager by getting the manager id \n 4. Employment\n select your choice");
		int number = myObj.nextInt();
		
		switch(number){
			case 1:
			System.out.println("show department list");
			break;
			case 2:
			System.out.println("show all employee list");
			List<Employe> s= createEmploye();
			for(Employe e:s){
				System.out.println(e.getName());
				System.out.println(e.getFamily());
				System.out.println(e.getAge());
				System.out.println(e.getEntryDate());
			}
			break;
			case 3:
			System.out.println("show all team of a manager by getting the manager id");
			break;
			case 4:
			System.out.println("Employment");
			break;
		}
		
	}
	
	private static List<Employe> createEmploye(){
		Random rand = new Random();
		var em = new Employe(rand.nextInt(10),"Golsa","eft","employee",25,1400);
		var em1 = new Employe(rand.nextInt(10),"Golsa1","eft","employee",25,1400);
		var em2 = new Employe(rand.nextInt(10),"Golsa2","eft","employee",25,1400);
		List<Employe> employeeList = new ArrayList<>();
		employeeList.add(em);
		employeeList.add(em1);
		employeeList.add(em2);
		return employeeList;
	}
}