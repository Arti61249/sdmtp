package study.basics.test;  //create folder in Book/bin/study/basics/test/book.class

public class Books {
	
	private String name;
	private int id;
	
	public Books() {
		this.name=null;
		this.id=0;
	}
	
public Books(String name , int id) {
		this.name=name.toUpperCase();
		this.id=id;
	}
	
	
	public String getname() {
	    return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public int getid() {
		return id;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	
public String toString()
	{
		String str= name + "," + id+ "," ;
		return str;
	}
}
