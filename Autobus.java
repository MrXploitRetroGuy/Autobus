
public class Autobus
{
    // Attribute
    private String kennzeichen = "W-1234A";
    private int sitzplatze = 29;
    private boolean anhanger = false;

    // Konstruktor mit allen Attributen
    public Autobus(String neuKennzeichen, int neuSitzplatze, boolean neuAnhänger)
    {
        kennzeichen = neuKennzeichen;
        sitzplatze = neuSitzplatze;
        anhanger = neuAnhänger;
    }

    // Standardkonstruktor
    public Autobus()
    {
    }

    // Getter und Setter für Kennzeichen
    public String getKennzeichen()
    {
        return kennzeichen;
    }

    public void setKennzeichen(String neuKennzeichen)
    {
        kennzeichen = neuKennzeichen;
    }

    // Getter und Setter für Sitzplätze
    public int getSitzplatze()
    {
        return sitzplatze;
    }

    public void setSitzplatze(int neuSitzplatze)
    {
        sitzplatze = neuSitzplatze;
    }

    // Getter und Setter für Anhänger
    public boolean getAnhänger()
    {
        return anhanger;
    }

    public void setAnhänger(boolean neuAnhänger)
    {
        anhanger = neuAnhänger;
    }
}
