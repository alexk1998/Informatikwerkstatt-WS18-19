public class CAuto implements IFahrzeug{
  // --- definiere Eigenschaften ---

  // unver�nderbare Eigenschaft durch final  
  protected final String m_farbe;
  protected final String m_marke;
  protected final int m_maxGeschwindigkeit;
  protected final int m_anzahlGaenge;
  private final int m_kw;
  private double m_ps;

  // ver�nderbare Eigenschaften
  // aktuelle Geschwindigkeit - der Wert bei Java mit 0 automatisch belegt
  private int m_aktGeschwindigkeit;
  // aktueller Gang - hier wird ein Wert vorgegeben
  private int m_gang = 1;

  // --- definiere Methoden ---
  
  // Konstruktor mit Parametern
  public CAuto( final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit, final int p_kw)
  {
    m_farbe = p_farbe;
    m_marke = p_marke;
    m_anzahlGaenge = p_anzahlGaenge;
    m_maxGeschwindigkeit = p_maxGeschwindigkeit;
    m_kw = p_kw;
    //m_ps = p_ps;

  }
   
  @Override
  public void schalte( final int p_gang )
  {
      m_gang = p_gang % (m_anzahlGaenge + 1);
      m_gang = m_gang < 0 ? 0 : m_gang;
  }
  
  @Override
  public void beschleunige( final int p_inkrement )
  {
      m_aktGeschwindigkeit += p_inkrement;
      m_aktGeschwindigkeit = m_aktGeschwindigkeit > m_maxGeschwindigkeit ? m_maxGeschwindigkeit : m_aktGeschwindigkeit;
  }
  
  @Override
  public void bremse( final int p_dekrement )
  {
      m_aktGeschwindigkeit -= p_dekrement;
      m_aktGeschwindigkeit = m_aktGeschwindigkeit < 0 ? 0 : m_aktGeschwindigkeit;
  }
  
  @Override
  public String toString(){
      return "Auto: " + m_marke + " in " + m_farbe + "\nAnzahl Gänge: " + m_anzahlGaenge + "\nMax. Geschwindigkeit: " + m_maxGeschwindigkeit + "\n";
      
  }
  

}