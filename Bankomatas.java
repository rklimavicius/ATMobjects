import java.util.Scanner;

public class Bankomatas
{
    public int eur10kiekis;
    public int capacity;

    public int gautiPin()
    {
        Scanner ivedimoGaudykle = new Scanner(System.in);

        System.out.print("Iveskite PIN: ");
        int skaicius = ivedimoGaudykle.nextInt();
        return skaicius;
    }

    public int gautiSuma()
    {
        Scanner ivedimoGaudykle = new Scanner(System.in);

        System.out.print("Iveskite Sumą: ");
        int skaicius = ivedimoGaudykle.nextInt();
        return skaicius;
    }

    public int gautiBanknotuKieki()
    {
        Scanner ivedimoGaudykle = new Scanner(System.in);

        System.out.print("Iveskite banknotų kiekį: ");
        int skaicius = ivedimoGaudykle.nextInt();
        return skaicius;
    }

    public void isimtiPinigus(int NorimaSuma)
    {
        int banknotuKiekis = NorimaSuma / 10;
        this.eur10kiekis = this.eur10kiekis - banknotuKiekis;
    }

    public void idetiPinigus(int IdedamasKiekis)
    {
        this.eur10kiekis = this.eur10kiekis + IdedamasKiekis;
    }

    public int getEur10kiekis()
    {
        return this.eur10kiekis;
    }

    public void setEur10kiekis(int naujasKiekis)
    {
        this.eur10kiekis = naujasKiekis;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int newCapacity)
    {
        this.capacity = newCapacity;
    }

    public Bankomatas (int naujasEur10kiekis, int naujasCapacity)
    {
        this.eur10kiekis = naujasEur10kiekis;
        this.capacity = naujasCapacity;
    }
}
