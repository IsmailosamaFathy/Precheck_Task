package Precheck;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sport;
		int international_award;
		int national_award;
		boolean flag;
		Participant []arr;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please Enter number of Participant ");
		
		int number_of_participants=scan.nextInt();
		
		scan.nextLine();
		
		arr=new Participant[number_of_participants];
		
		for(int i=0;i<number_of_participants;i++) 
		{
			
			arr[i]=new Participant();
			arr[i].Set_name_Of_participant();
			arr[i].Set_Surname_Of_participant();
			arr[i].Set_age_Of_participant();
			arr[i].Set_Type_Of_Sport_participant();
			arr[i].Set_nationalawards_Of_participant();
			arr[i].Set_internationalawards_Of_participant();
		}
		
		System.out.println("Please Enter Required Participant sport");
		sport=scan.nextLine();
		
		System.out.println("Please Enter Required number of national awards");
		national_award=scan.nextInt();
		scan.nextLine();
		
		System.out.println("Please Enter Required number of international awards");
		international_award=scan.nextInt();
		scan.nextLine();

		for(int i=0;i<number_of_participants;i++) 
		{
            flag=sport.equals(arr[i].Get_type_of_sport());
			if(flag) 
			{
				if((national_award==arr[i].Get_Number_national_awards()) && ( international_award==arr[i].Get_Number_international_awards()) ) 
				{
					arr[i].Display();
				}
			}
		}
		
		

		
	}

}
