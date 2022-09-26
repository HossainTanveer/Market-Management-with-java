import java.lang.*;
import java.util.*;
import classes.*;
import interfaces.*;
import fileio.*;

public class Start
{   
    private int choice;
	private int option1;
	private int option2;
	private int option3;
	private int option4;
	

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Market m = new Market();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
	    Start s=new Start(); 
	    
		System.out.println("*****---Welcome to our Console Market Management Application---****");
	
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("        **--What do you want to do?--**\n");
			System.out.println("	            1. Employee Management");
			System.out.println("	            2. Shop Management");
			System.out.println("	            3. Shop Product Management");
			System.out.println("	            4. Product Quantity Add-Sell");
			System.out.println("	            5. Exit\n");
       try
	   {
			System.out.print("Your Choice: ");
			s.choice = sc.nextInt();
	   }		
				
				
		catch(InputMismatchException ime)
		{
			System.out.println("Input Mismatch Exception Occured please run again and give valid input");
		     break;
		}
		
			switch(s.choice)
			{
				case 1:
				
					System.out.println("--------------------------------");
					System.out.println("You have choosen Employee Management");
					
					System.out.println("Choose any one Option from the followings\n");
					System.out.println("	1. Insert New Employee");
					System.out.println("	2. Removing Existing Employee");
					System.out.println("	3. Show All Employees");
					System.out.println("	4. Search an Employee");
					System.out.println("	5. Go Back\n");
					
			try
	             {
			             System.out.print("Your Option: ");
			             s.option1 = sc.nextInt();
	              }		
				
				
		catch(InputMismatchException ine)
		{
			System.out.println("Input Mismatch Exception Occured please run again and give valid input");
		     break;
		}	
					switch(s.option1)
					{
						case 1:
						
							System.out.println("########################");
							System.out.println("Insert New Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Employee Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							m.insertEmployee(e1);
							
							System.out.println("&&&&&&&&&&&&&&&&&&&&&&&");
							break;
							
						case 2:
						
							System.out.println("************************");
							System.out.println("Remove an Existing Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId2 = sc.next();
							
							Employee e2 = m.getEmployee(empId2);
							
							if(e2 != null)
							{
								m.removeEmployee(e2);
							}
							System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");
							break;
							
						case 3:
						
							System.out.println("########################");
							System.out.println("Show All Employees");
							m.showAllEmployees();
							System.out.println("########################");
							break;
						
						case 4:
						
							System.out.println("########################");
							System.out.println("Search an Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId4 = sc.next();
							
							Employee e4 = m.getEmployee(empId4);
							
							if(e4 !=null)
							{
								System.out.println();
								System.out.println("Employee ID: "+e4.getEmpId());
								System.out.println("Employee Name: "+e4.getName());
								System.out.println("Employee Salary: "+e4.getSalary());
								System.out.println();
							}
							
							System.out.println("########################");
							break;
						
						case 5:
						
							System.out.println("########################");
							System.out.println("Going Back......");
							System.out.println("########################");
							break;
							
						default:
						
							System.out.println("########################");
							System.out.println("Invalid Option");
							System.out.println("########################");
							break;
							
					}
					System.out.println("--------------------------------");
					break;
						
				case 2:
				
					System.out.println("--------------------------------");
					System.out.println("You have choosen Shop Management");
					
					System.out.println("Choose any one Option from the followings:\n");
					System.out.println("	1. Insert New Shop");
					System.out.println("	2. Removie an Existing Shop");
					System.out.println("	3. Show All Shops");
					System.out.println("	4. Search a Shop");
					System.out.println("	5. Go Back\n");
						try
	             {
			             System.out.print("Your Option: ");
			             s.option2 = sc.nextInt();
	              }		
				
				
		catch(InputMismatchException ine)
		{
			System.out.println("Input Mismatch Exception Occured please run again and give valid input");
		     break;
		}
					switch(s.option2)
					{
						case 1:
						
							System.out.println("########################");
							System.out.println("Insert New Shop");
							
							System.out.print("Enter Shop Id: ");
							String sid1 = sc.next();
							System.out.print("Enter Shop Name: ");
							String name1 = sc.next();
							
							
							Shop s1 = new Shop();
							s1.setSid(sid1);
							s1.setName(name1);
						
							m.insertShop(s1);
							
							System.out.println("########################");
							break;
							
						case 2:
						
							System.out.println("########################");
							System.out.println("Remove Existing Shop");
							
							System.out.print("Enter Shop ID: ");
							String sid2 = sc.next();
							
							Shop s2 = m.getShop(sid2);
							
							if(s2 != null)
							{
								m.removeShop(s2);
							}
							System.out.println("########################");
							break;
						
						case 3:
						
							System.out.println("########################");
							System.out.println("Show All Shops");
							m.showAllShops();
							System.out.println("########################");
							break;
						
						case 4:
						
							System.out.println("########################");
							System.out.println("Search a Shop");
							System.out.print("Enter Shop ID: ");
							String sid4 = sc.next();
							
							Shop s4 = m.getShop(sid4);
							
							if(s4 !=null)
							{
								System.out.println();
								System.out.println("Shop ID: "+s4.getSid());
								System.out.println("Shop Name: "+s4.getName());
								s4.showAllProducts();
								System.out.println();
							}
							
							System.out.println("########################");
							break;
						
						case 5:
						
							System.out.println("########################");
							System.out.println("Going Back......");
							System.out.println("########################");
							break;
							
						default:
						
							System.out.println("########################");
							System.out.println("Invalid Option");
							System.out.println("########################");
							break;
					}
					System.out.println("--------------------------------");
					break;
					
				case 3:
				
					System.out.println("--------------------------------");
					System.out.println("You have choosen Shop Product Management");
					
					System.out.println("Choose any one Option from the followings:\n");
					System.out.println("	1. Insert New Product");
					System.out.println("	2. Remove Existing Product");
					System.out.println("	3. Show All Product");
					System.out.println("	4. Search a Product");
					System.out.println("	5. Go Back\n");
					
						try
	             {
			             System.out.print("Your Option: ");
			             s.option3 = sc.nextInt();
	              }		
				
				
		catch(InputMismatchException ine)
		{
			System.out.println("Input Mismatch Exception Occured please run again and give valid input");
		     break;
		}
					switch(s.option3)
					{
						case 1:
						
							System.out.println("########################");
							System.out.println("Insert New Product for a Shop\n");
							
							Product p = null;
							
							System.out.println("Which type of Product do you want to Insert?\n");
							System.out.println("	1. Local Product");
							System.out.println("	2. Imported Product");
							System.out.println("	3. Go Back");
							
							System.out.print("Enter Your Product Type: ");
							int type = sc.nextInt();
							
							if(type == 1)
							{
								LocalProduct lp = new LocalProduct();
								
								System.out.print("Enter Product ID: ");
								String pid1 = sc.next();
								System.out.print("Enter Product Name: ");
								String pn1 = sc.next();
								System.out.print("Enter Product Available Quantity: ");
								int pq1 = sc.nextInt();
								System.out.print("Enter Product Price: ");
								double pp1 = sc.nextDouble();
								System.out.print("Enter Discount Rate: ");
								double dr1 = sc.nextDouble();
								
								lp.setPid(pid1);
								lp.setName(pn1);
								lp.setAvailableQuantity(pq1);
								lp.setDiscountRate(dr1);
								
								p = lp;
								
							}
							else if(type == 2)
							{
								ImportedProduct ip = new ImportedProduct();
								
								System.out.print("Enter Product ID: ");
								String pid2 = sc.next();
								System.out.print("Enter Product Name: ");
								String pn2 = sc.next();
								System.out.print("Enter Product Available Quantity: ");
								int pq2 = sc.nextInt();
								System.out.print("Enter Product Price: ");
								double pp2 = sc.nextDouble();
								System.out.print("Enter country Name: ");
								String cn1 = sc.next();
								
								ip.setPid(pid2);
								ip.setName(pn2);
								ip.setAvailableQuantity(pq2);
								ip.setCountryName(cn1);
								
								p = ip;
								
							}
							else if(type == 3)
							{
								System.out.println("Going Back.......");
							}
							else
							{
								System.out.println("Invalid Type");
							}
							
							if(p!= null)
							{
								System.out.print("Enter Shop ID: ");
								String sid1 = sc.next();
								m.getShop(sid1).insertProduct(p);
							}
							System.out.println("########################");
							break;
						
						case 2:
						
							System.out.println("########################");
							System.out.println("Remove Existing Product");
							
							System.out.print("Enter Shop sID: ");
							String sid2 = sc.next();
							System.out.print("Enter Product ID: ");
							String pid2 = sc.next();
							
							m.getShop(sid2).removeProduct(m.getShop(sid2).getProduct(pid2));
							System.out.println("########################");
							break;
						
						case 3: 
						
							System.out.println("########################");
							System.out.println("Show All Product in Shop");
							
							System.out.print("Enter Shop ID: ");
							String sid3 = sc.next();
							m.getShop(sid3).showAllProducts(); 
							System.out.println("########################");
							break;
							
						case 4:
						
							System.out.println("########################");
							System.out.println("Search a Product\n");
							
							System.out.print("Enter Shop ID: ");
							String sid4 = sc.next();
							System.out.print("Enter Product ID: ");
							String pid4 = sc.next();
							
							Product p1 = m.getShop(sid4).getProduct(pid4);
							
							if(p1 != null)
							{
								p1.showInfo();
							}
							System.out.println("########################");
							break;
						
						
						case 5:
						
							System.out.println("########################");
							System.out.println("Going Back..");
							System.out.println("########################");
							break;
							
						default:
						
							System.out.println("########################");
							System.out.println("Invalid Option");
							System.out.println("########################");
							break;
					}
					System.out.println("--------------------------------");
					break;
					
				case 4:
				
					System.out.println("--------------------------------");
					System.out.println("You have choosen Product Quantity Add-Sell");
					
					System.out.println("Choose any one Option from the followings:\n");
					System.out.println("	1. Add Product");
					System.out.println("	2. Sell Product");
					System.out.println("	3. Show Add Sell History");
					System.out.println("	4. Go Back\n");
						try
	             {
			             System.out.print("Your Option: ");
			             s.option4 = sc.nextInt();
	              }		
				
				
		catch(InputMismatchException ine)
		{
			System.out.println("Input Mismatch Exception Occured please run again and give valid input");
		     break;
		}
					switch(s.option4)
					{
						case 1:
							System.out.println("#########################");
							System.out.println("Add Product");
							System.out.print("Enter Shop ID: ");
							String sid1 = sc.next();
							System.out.print("Enter Product ID: ");
							String pid1 = sc.next();
							System.out.print("Enter Add Amount: ");
							int amount1 = sc.nextInt();
							
							if(amount1>0)
							{
								m.getShop(sid1).getProduct(pid1).addQuantity(amount1);
								frwd.writeInFile(amount1+" Quantity has been Added in Product ID "+ pid1);
			
							}
							System.out.println("#########################");
							break;
						
						case 2:
						
							System.out.println("#########################");
							System.out.println("Sell Product");
							System.out.print("Enter Shop ID: ");
							String sid2 = sc.next();
							System.out.print("Enter Product ID: ");
							String pid2 = sc.next();
							System.out.print("Enter Add Amount: ");
							int amount2 = sc.nextInt();
							
							if(amount2>0 && amount2<=m.getShop(sid2).getProduct(pid2).getAvailableQuantity())
							{
								m.getShop(sid2).getProduct(pid2).sellQuantity(amount2);
								frwd.writeInFile(amount2+" Quantity has been Sold from Product ID "+ pid2);
							}
							
							System.out.println("#########################");
							break;
						
						case 3:
						
							System.out.println("#########################");
							System.out.println("Show Add-Sell History\n");
							frwd.readFromFile();
							System.out.println("\n#########################");
							break;
							
						case 4:
						
							System.out.println("#########################");
							System.out.println("Going Back");
							System.out.println("#########################");
							break;
							
						default:
						
							System.out.println("#########################");
							System.out.println("Invalid Option");
							System.out.println("#########################");
							break;
						
					}
					
					System.out.println("--------------------------------");
					break;	
					
				case 5:
				
					System.out.println("--------------------------------");
					System.out.println("You have choosen to Exit");
					repeat = false;
					System.out.println("--------------------------------");
					break;
					
				default:
				
					System.out.println("--------------------------------");
					System.out.println("Invalid Choice");
					System.out.println("--------------------------------");
					break;
			}
		}
	}
}