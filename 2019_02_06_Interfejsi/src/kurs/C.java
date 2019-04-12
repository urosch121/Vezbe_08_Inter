package kurs;

import java.util.ArrayList;

public class C implements MojInterfejs, DrugiInterfejs 
{

	@Override
	public void Metoda2(int a) 
	{
		System.out.println("C : metoda 2, a = " + a);
	}

	@Override
	public int Metoda3(int a, int b) 
	{
		System.out.println("C : metoda 3 = " + (a + b));
		return a + b;
	}

	@Override
	public void Metoda1() 
	{
		System.out.println(MojInterfejs.b);
		System.out.println(DrugiInterfejs.b);
		System.out.println(r);
		
		lista.add(222);
		lista.add(333);
		
		System.out.println(lista);
		
		// lista = new ArrayList<>();  FINAL
		
		System.out.println("C : Metoda 1");
	}

	@Override
	public void Metoda2() 
	{
		System.out.println("C : metoda 2");
	}

	@Override
	public void Metoda3()
	{
		System.out.println("C : Metoda 3");
	}
}
