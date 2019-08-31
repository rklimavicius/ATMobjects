public class Saskaita
{
    public int PinKodas;
    public int likutis;

    public int getLikutis() {
        return likutis;
    }

    public int getPinKodas() {
        return PinKodas;
    }

    public void setLikutis(int likutis) {
        this.likutis = likutis;
    }

    public void setPinKodas(int pinKodas) {
        PinKodas = pinKodas;
    }

    // jei sutampa pin tai return true, jei nesutampa return false
    public boolean checkPin(int PinKodasPatikrinimui)
    {
        boolean arSutampa = (this.PinKodas == PinKodasPatikrinimui);
        return arSutampa;
    }

    public void increaseLikutis(int suma)
    {
        this.likutis = this.likutis + suma;
    }

    public void decreaseLikutis(int suma)
    {
        this.likutis = this.likutis - suma;  // ka daryti jei jau truksta pinigu?
    }

    public Saskaita(int pinKodas, int likutis) {
        PinKodas = pinKodas;
        this.likutis = likutis;
    }
}
