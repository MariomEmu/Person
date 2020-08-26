public class Person
{
	public Person()
	{
		System.out.println() ;
		System.out.println("Default Constructor invoked") ;
		System.out.println() ;
	}
	public Person(String GivenName , int YearOfBirth)
	{
		name = GivenName ;
		BirthdayYear = YearOfBirth ;
	}
	
	public String getname()
	{
		return name ;
	}
	public int getdob()
	{
		return BirthdayYear ;
	}
	
	public String changename(String name)
	{
		this.name = name ;
		System.out.println("Name after changing: " + this.name) ;
		return this.name ;
	}
	public int getAgeinYears(int currentYear)
	{
		age = currentYear ;
		System.out.println("Age: " + age) ;
		return age ;
	}
	
	private String name ;
	private int BirthdayYear ;
	private int age ;
	
	public static void main(String[] args)
	{
		Person a = new Person() ;
		Person b = new Person("Anik Kumar Saha" , 2000) ;
		
		System.out.println("Name: " + b.getname()) ;
		System.out.println("Birth year: " + b.getdob()) ;
		
		System.out.println() ;
		
		a.changename("Emu") ;
		a.getAgeinYears(20) ;
	}
}