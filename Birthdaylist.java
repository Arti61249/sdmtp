package study.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Birthdaylist {
	
		
	 static ArrayList<String> guest;
	public Birthdaylist()
	{
		this.guest= new ArrayList<String>();
	
	}
	public int howmanyguest()
	{
		return guest.size();
		
	}
	
	public void addname(String name)
	{
		guest.add(name);
	}
	
	public void removename(String name)
	{
		guest.remove(name);
	}
	
	public static void ShowGuestlist()
	{
		Iterator<String> it = guest.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()+ " ");
		}
		
	}
		
	
}


