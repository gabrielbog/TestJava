public class Planta
{
    //campuri
    public int raritatePlanta;
    public String notitePlanta;
    private int idPlanta;
    private String numePlanta;

    //constructori
    public Planta()
    {
        numePlanta = null;
        idPlanta = 0;
        notitePlanta = null;
        raritatePlanta = 0;
    }

    public Planta(String numePlanta, int idPlanta)
    {
        this.numePlanta = numePlanta;
        this.idPlanta = idPlanta;
        notitePlanta = null;
        raritatePlanta = 1;
    }

    public Planta(String numePlanta, int idPlanta, String notitePlanta)
    {
        this.numePlanta = numePlanta;
        this.idPlanta = idPlanta;
        this.notitePlanta = notitePlanta;
        raritatePlanta = 1;
    }

    public Planta(String numePlanta, int idPlanta, String notitePlanta, int raritatePlanta)
    {
        this.numePlanta = numePlanta;
        this.idPlanta = idPlanta;
        this.notitePlanta = notitePlanta;
        this.raritatePlanta = raritatePlanta;
    }

    //metode
    public int getIdPlanta()
    {
        return idPlanta;
    }

    public void setIdPlanta(int idPlanta)
    {
        this.idPlanta = idPlanta;
    }

    public String getNumePlanta()
    {
        return numePlanta;
    }

    public void setNumePlanta(String numePlanta)
    {
        this.numePlanta = numePlanta;
    }

    public int ratingCorectPlanta()
    {
        if(raritatePlanta <= 1 || raritatePlanta >= 11)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }

    public String parerePlanta()
    {
        if(raritatePlanta >= 1 && raritatePlanta <= 3)
            return "COMMON";
        else if(raritatePlanta >= 4 && raritatePlanta <= 6)
            return "RELATIVELY COMMON";
        else if(raritatePlanta >= 7 && raritatePlanta <= 9)
            return "RARE";
        else if(raritatePlanta == 10)
            return "VERY RARE";
        else
            return "RARITATE TREBUIE SA SE AFLE PE SCARA 1-10";
    }
}
