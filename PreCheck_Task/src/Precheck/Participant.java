package Precheck;
import java.util.Scanner;
public class Participant 
{
	//Declaring  required attributes
	Scanner scan=new Scanner(System.in);
	String name;
	String Surname;
	int age;
	String type_Of_Sport;
	int [] List_Of_Awards= {0,0};
	
	// Declaring Setters
	public void Set_name_Of_participant() 
	{
		System.out.println("Please Enter Participant name");
		name=scan.nextLine();
	}
	public void Set_Surname_Of_participant() 
	{
		System.out.println("Please Enter Participant Surname");
		Surname=scan.nextLine();
	}
	public void Set_age_Of_participant() 
	{
		System.out.println("Please Enter Participant age");
		age=scan.nextInt();
		scan.nextLine();
		
	}
	public void Set_Type_Of_Sport_participant() 
	{
		System.out.println("Please Enter Participant type of sport");
		type_Of_Sport=scan.nextLine();
		
	}
	public void Set_nationalawards_Of_participant() 
	{
		System.out.println("Please Enter Participant number of national awards");
		List_Of_Awards[0]=scan.nextInt();
	}
	public void Set_internationalawards_Of_participant() 
	{
		System.out.println("Please Enter Participant number of international awards");
		List_Of_Awards[1]=scan.nextInt();
	}
	//Declaring Getter 
	public void Display() 
	{
		System.out.println("Name: "+name+"  Surname: "+Surname+"  Age: "+age );
		System.out.println("Type of Sport: "+type_Of_Sport);
		System.out.println(" N.nationalawards: "+List_Of_Awards[0]+" N.nationalawards: "+List_Of_Awards[1]);
	}
	public String Get_type_of_sport() 
	{
		return type_Of_Sport;
	}
	public int Get_Number_national_awards() 
	{
		return List_Of_Awards[0];
	}
	public int Get_Number_international_awards() 
	{
		return List_Of_Awards[1];
	}
	

}
