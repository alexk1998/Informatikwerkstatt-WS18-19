public class CSuv extends CAuto
{
  public static boolean m_offroadFahrbar;

  public CSuv()
  {
    // ruft den SUV Konstruktor auf
    this( "rot", "VW", 5, 250, 5, false );
  }

  public CSuv( final boolean p_offroadFahrbar )
  {
    // ruft den SUV Konstruktor auf
    this( "rot", "VW", 5, 250, 5, p_offroadFahrbar );
  }

  public CSuv( final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit, final int p_kw, final boolean p_offroadFahrbar )
  {
    // Aufruf des Konstruktur von CAuto
    super( p_farbe, p_marke, p_anzahlGaenge, p_maxGeschwindigkeit, p_kw );
    m_offroadFahrbar = p_offroadFahrbar;

  }

  public boolean getM_offroadFahrbar() {
	return m_offroadFahrbar;
  }
  
  @Override
  public String toString(){
      return "Auto: " + m_marke + " in " + m_farbe + "\nAnzahl Gänge: " + m_anzahlGaenge + "\nMax. Geschwindigkeit: " + m_maxGeschwindigkeit + "\n" + "Offroadfahrbar: " + m_offroadFahrbar + "\n";
  }
  
}