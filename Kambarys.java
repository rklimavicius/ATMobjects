 public class Kambarys {
    public float ilgis;
    public float plotis;
    public float aukstis;

    public float GetIlgis()
    {
        return this.ilgis;
    }

    public void SetIlgis(float newIlgis)
    {
        this.ilgis = newIlgis;
    }

    public float GetPlotas()
    {
        float plotas = this.ilgis * this.plotis;
         return plotas;

    }

    public float GetTuris()
    {
        float turis = this.ilgis * this.plotis * this.aukstis;
        return turis;
    }

    public Kambarys (float naujasilgis, float naujasplotis, float naujasaukstis)
    {
      this.ilgis = naujasilgis;
      this.plotis = naujasplotis;
      this.aukstis = naujasaukstis;
    }
}
