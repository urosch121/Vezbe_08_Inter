package kurs;

public class B extends A 
{
	@Override
	public void Metoda1() 
	{
		// b = 122; - nije dozvoljeno jer je final po difoltu
		System.out.println("B : Metoda 1");
	}

	@Override
	public void Metoda3() 
	{
		System.out.println("B : Metoda 3");
	}
	
	public int GetB()
	{
		return b;
	}

}
