package TPE_Gruppe_11_HSMA_SS16_Pflichtaufgabe_01;

public class Hauptprogramm {

	public static void main(String[] args) {
		
		Waehrungen waehrungen = new Waehrungen();
		
		//System.out.println(waehrungen.euro.toString());
		//System.out.println(waehrungen.dollar.umrechnen(1, waehrungen.euro));
		Betrag betrag1 = new Betrag(100.12,waehrungen.euro);
		Betrag betrag2 = new Betrag(100,waehrungen.euro);
		System.out.println(betrag1.getAsDouble());
		
	}

}
