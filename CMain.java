
public class CMain {

	public static void main(String[] args) {
		
		final IFahrzeug l_auto5 = new CAuto("silber", "Fiat",5 , 250, 2);
		final IFahrzeug l_suv1 = new CSuv("schwarz", "Cadillac", 6, 280, 20, true);
		final CAuto l_auto1 = new CAuto("rot", "Beetle", 5, 180, 5);
		final CAuto l_auto2 = new CAuto("schwarz", "Golf VI", 5, 250, 10);
		final CAuto l_auto3 = new CAuto("gruen", "Aventador", 6, 300, 20);
		final CAuto l_auto4 = new CSuv("gelb","BumbleBee", 6, 230, 30, true);
		final CAuto l_lkw1 = new CLKW("braun", "Scania", 12, 120, 50, 40, 6);
		final CMotorrad l_bike1 = new CMotorrad("grün", "Kawasaki", 5, 280, 30, 2);

		int a = 1;
		int b = 0;
		
		
		IFahrzeug [] array = {l_auto1, l_auto2, l_auto3, l_auto4, l_auto5, l_suv1, l_lkw1, l_bike1};
		  
		  for(int i = 0;i<array.length;i++) {
			  a = a%10;
			  if(a==0) {
				  b++;
			  }
			  System.out.println("Seriennummer: " + b + "-" + a);
			  System.out.println(array[i]);
			  a++;
		  }
		  
		  
		  //schalte in den 2. Gang
		  l_auto5.schalte(3);
		  //System.out.println(l_auto5.m_gang);
		
		  //beschleunige um 5 Einheiten
		  l_auto5.beschleunige(10);
		  //System.out.println(l_auto5.m_aktGeschwindigkeit);
		  
		  l_auto5.bremse(2);
		  //System.out.println(l_auto5.m_aktGeschwindigkeit);

	}

}