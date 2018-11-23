
public class CLKW extends CAuto {

	final float m_traglast;
	final int m_achszahl;
	
	public CLKW(String p_farbe, String p_marke, int p_anzahlGaenge, int p_maxGeschwindigkeit, int p_kw, float p_traglast, int p_achszahl) {
		super(p_farbe, p_marke, p_anzahlGaenge, p_maxGeschwindigkeit, p_kw);
	
		m_traglast = p_traglast;
		m_achszahl = p_achszahl;
	}
	
	 @Override
	  public String toString(){
	      return "LKW: " + m_marke + " in " + m_farbe + "\nAnzahl Gänge: " + m_anzahlGaenge + "\nMax. Geschwindigkeit: " + m_maxGeschwindigkeit + "\n" + "MaxTraglast: " + m_traglast +  " Tonnen" + "\nAchszahl: " + m_achszahl + "\n"  ;
	  }
	
}
