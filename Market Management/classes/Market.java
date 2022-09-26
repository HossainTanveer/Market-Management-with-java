package classes;
import java.lang.*;
import interfaces.*;

public class Market implements ShopOperations,EmployeeOperations
{
   private Shop shops[]=new Shop[500];
   private Employee employees[]=new Employee[100];
   
   
    public void insertShop(Shop s)
	
   {
	   int flag=0;
	   for(int i=0;i<shops.length;i++)
	   {
		   if(shops[i]==null)
		   {
			   shops[i]=s;
			   flag=1;
			   break;
		   }
	   }
	   if(flag==1)
	   {
		   System.out.println("Shop inserted");
	   }
	   else
	   {
		   System.out.println("Can not insert");
	   }
   }
	   
    public void removeShop(Shop s)
	
	   {
		   
		   int flag=0;
	   for(int i=0;i<shops.length;i++)
	   {
		   if(shops[i]== s)
		   {
			   shops[i]= null;
			   flag=1;
			   break;
		   }
	   }
	   if(flag==1)
	   {
		   System.out.println("Shop Removed");
	   }
	   else
	   {
		   System.out.println("Can not Remove");
	   }
	   }
	   
       
    public void showAllShops()
	
	{
		for(Shop s: shops)
		{
			if(s!=null)
			{
				System.out.println("-----------------------------------");
				System.out.println("Shop Name:  "+s.getName());
				System.out.println("Shop id :  "+s.getSid());
				System.out.println("-----------------------------------");
				s.showAllProducts();
				System.out.println("-----------------------------------");
			}
		}
	}	
	 


    public Shop getShop(String sid)
    {
		Shop s=null;
		
		for(int i=0;i<shops.length;i++)
		{
			if(shops[i]!=null)
			{
				if(shops[i].getSid()==sid)
				{
				s=shops[i];
				break;
				}
			}
		}
		if(s!=null)
		{
			System.out.println("Shop Found");
		}
		else
		{
			System.out.println("Shop Not Found");
		}
		return s;
	}	


    
    public void insertEmployee(Employee e)
	{
		int flag = 0;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Employee Inserted");
		}
		else
		{
			System.out.println("Can Not Insert");
		}
	}
	
	
	public void removeEmployee(Employee e)
	{
		int flag = 0;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Employee Removed");
	    }
		else
		{
			System.out.println("Can Not Remove");
		}
	}
	public void showAllEmployees()
	{
		System.out.println("*/////////////////////////////////*");
		for(Employee e : employees)
		{
			if(e != null)
			{
				System.out.println("Employee Name: "+ e.getName());
				System.out.println("Employee ID: "+ e.getEmpId());
				System.out.println("Salary: "+ e.getSalary());
				System.out.println();
			}
		}
		System.out.println("*//////////////////////////////////*");
	}
	public Employee getEmployee(String empId)
	{
		Employee e = null;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					e = employees[i];
					break;
				}
			}
		}
		if(e != null)
		{
			System.out.println("Employee Found");
		}
		else
		{
			System.out.println("Employee Not Found");
		}
		return e;
	}
}   
	   
	   

