//I have used array list to add and delete the element or replace element(item) at any position and display it.
// I have taken the example of a shop where items are the list of array

package ProjectonArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {
	static Scanner sc = new Scanner(System.in);
	static List<String> items = List.of(
			"Apple",
			"Watermelon",
			"Orange",
			"Pear",
			"Cherry",
			"Strawberry", 
			"Nectarine");
	static List<String> NewitemList = new ArrayList<String>(items);
	public static void main(String []agrs) {
		
		int n=1;
		for(int i=0;i<=items.size()-1;i++) {
			System.out.print("*"+items.get(i) +"\n");
		}
		do {
			System.out.print("\n| To Add item enter [1]"+
							"\n| To sell the item [2] "+
							"\n| To Replace the item [3]"+
							"\n| To Display the items [4]"+
							"\nChoose the Option =>");
			int x=sc.nextInt();
			switch(x) {
			case 1: NewitemList=additem(items);
			break;
			case 2:NewitemList=removeitem(NewitemList);
			break;
			case 3:NewitemList=replaceitem(NewitemList);
			break;
			case 4:display(NewitemList);	
			break;
			default:System.out.println("*******************************************************"+"Invalid Input"+
					   "*******************************************************");
			}
				System.out.print("\ndo you want to continue enter 1 else 0 =>");
		n=sc.nextInt();
			
		if(n>1)
		{
			System.out.println("*******************************************************"+"Invalid Input"+
							   "*******************************************************");
			}
		}while(n==1);
		}
	private static void display(List<String> newitemList2) {
		// TODO Auto-generated method stub
		System.out.println();
		for(int i=0;i<=NewitemList.size()-1;i++) {
			System.out.print("*"+NewitemList.get(i) +"\n");
		}
	}
	private static List<String> replaceitem(List<String> newitemList2) {
		// TODO Auto-generated method stub
		System.out.println("Enter the position and the name of the item ");
		int i=sc.nextInt();
		String c=sc.next();
		if(i>NewitemList.size()-1)
		{
			System.out.println("*******************************************************"+"Invalid Input"+
					   "*******************************************************");
			return NewitemList;
		}
		else {
		NewitemList.set(i, c);
		return NewitemList;
		}
	}
	private static List<String> removeitem(List<String> NewitemList) {
		System.out.print("\nTo Enter the number Press[1] "
				+ "\nOR "
				+ "\nTo Enter the item Name press[2]=>");
		int n=sc.nextInt();
		switch(n) {
			case 1: System.out.println("Now enter the position of the item to Sell");
					int i=sc.nextInt();
					if(i>NewitemList.size()-1)
					{
						System.out.println("*******************************************************"+"Invalid Input"+
								   "*******************************************************");
						return NewitemList;
					}
					else {
					NewitemList.remove(i-1);
					}
					break;
			case 2:	System.out.println("Now enter the name of the item to Sell");
					String c=sc.next();
					NewitemList.remove(c);
					break;
			default:System.out.println("Invalid input");
				}
		
		for(int i=0;i<=NewitemList.size()-1;i++) {
			System.out.print("\n*"+NewitemList.get(i) );
		}
		return NewitemList;
		
	}
	static List<String> additem(List<String> items)
	{
//		for(int i=0;i<=items.size()-1;i++) {
//			System.out.print("\n"+items.get(i) );
//		}
		List<String> NewitemList = new ArrayList<String>(items);
		System.out.println("\nEnter the position And the item to Add");
		int i=sc.nextInt();
		String c=sc.next();
		if(i>NewitemList.size()-1)
		{
			System.out.println("*******************************************************"+"Invalid Input"+
					   "*******************************************************");
			return NewitemList;
		}
		else {
		NewitemList.add(i-1,c);
		for(i=0;i<=NewitemList.size()-1;i++) {
			System.out.print("\n*"+NewitemList.get(i) );
		}
		System.out.println("\n");
		return NewitemList;
		}
	}	
}
