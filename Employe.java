package manageCompany.Entities;
import java.util.Arrays;

public class Employe{
	
	private int personalCode;
	
	private String name;
	
	private String family;
	
	private int age;
	
	//public String[] position = {"chief executive officer", "managing department", "managing section", "Supervisor", "Employee"}; //?

	private String position;
	
	private int entryDate;
	
	public Employe() {};
	
	public Employe(int personalCode, String name, String family, String position, int age, int entryDate){
		
		this.personalCode = personalCode;
		this.name = name;
		this.family = family;
		this.position = position;
		this.age = age;
		this.entryDate = entryDate;
		
	}
	
	
	public void setPersonalCode(int code){
		this.personalCode = code;
	}
	public int getPersonalCode(){
		return personalCode;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setFamily(String family){
		this.family = family;
	}
	public String getFamily(){
		return family;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	
	public void setEntryDate(int entryDate){
		this.entryDate = entryDate;
	}
	public int getEntryDate(){
		return entryDate;
	}	
	
	public void setPosition(String position){
		this.position = position;
	}
	public String getPosition(){
		return position;
	}
}

