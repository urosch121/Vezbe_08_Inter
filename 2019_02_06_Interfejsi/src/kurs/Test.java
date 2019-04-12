package kurs;

public class Test 
{

	public static void main(String[] args) 
	{
		B b = new B();
		
		b.Metoda1();
		b.Metoda2();
		b.Metoda3();
		
		System.out.println(B.b);
		System.out.println(b.GetB());
		
		
		System.out.println("*********************************");
		C c = new C();
		
		c.Metoda1();
		c.Metoda2();
		c.Metoda2(22);
		c.Metoda3();
		System.out.println(c.Metoda3(100,200));
				
		System.out.println("*********************************");

		System.out.println(C.lista);
		System.out.println(DrugiInterfejs.lista);
	}

}
