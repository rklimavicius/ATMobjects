import java.time.Instant;
import java.util.Scanner;


public class HelloWorld {
    public static void main(String[] args) {

        Bankomatas moloBankomatas = new Bankomatas(500, 2000);
        int pinas = moloBankomatas.gautiPin();

        Saskaita bankoSaskaita = new Saskaita(7575, 2000);

        boolean arGerasPin = bankoSaskaita.checkPin(pinas);

        if (!arGerasPin)
        {
            System.exit(0);
        }

        System.out.println("Pasirinkite veiksmą.");
        System.out.println("1 - išsiimti pinigų");
        System.out.println("2 - įdėti pinigų.");
        System.out.println("3 - pažiūrėti balansą.");
        System.out.println("4 - baigti darbą.");

        int opcija = 0;
        do {
            Scanner ivedimoGaudykle = new Scanner(System.in);
            System.out.print("Pasirinkite veiksmą: ");
            int veiksmas = ivedimoGaudykle.nextInt();
            opcija = veiksmas;

            if (opcija==1)
            {
                int norimaSuma = moloBankomatas.gautiSuma();
                if (norimaSuma <= bankoSaskaita.getLikutis())
                {
                  if (norimaSuma / 10<=moloBankomatas.getEur10kiekis())
                  {
                      bankoSaskaita.decreaseLikutis(norimaSuma);
                      moloBankomatas.isimtiPinigus(norimaSuma);

                      System.out.println("Banknotu bankomate: " + moloBankomatas.getEur10kiekis());
                      System.out.println("Pinigu banko saskaitoje: " +bankoSaskaita.getLikutis());
                  }
                  else
                  {
                      System.out.println("Nepakanka pinigu bankomate.");
                  }
                }
                else
                {
                   System.out.println("Nepakanka pinigu banke.");
                }
            }

            if (opcija==2)
            {
                int naujuKiekis = moloBankomatas.gautiBanknotuKieki();
                if (moloBankomatas.getEur10kiekis() + naujuKiekis <= moloBankomatas.getCapacity())
                {
                    moloBankomatas.idetiPinigus(naujuKiekis);

                    int iBankaSuma = naujuKiekis * 10;
                    bankoSaskaita.increaseLikutis(iBankaSuma);

                    System.out.println("Banknotu bankomate: " + moloBankomatas.getEur10kiekis());
                    System.out.println("Pinigu banko saskaitoje: " +bankoSaskaita.getLikutis());

                }
                else
                {
                    System.out.println("Netilps į bankomatą.");
                }
            }

            if (opcija == 3)
            {
                System.out.println("Balansas: "+ bankoSaskaita.getLikutis());
            }
        }
        while (opcija != 4);















 /*       int[] pazymiai = {8, 7, 10, 5, 6, 10, 9};

        int pazymiuSuma = 0;
        for (int i = 0; i < pazymiai.length; i++)
        {
            pazymiuSuma = pazymiuSuma + pazymiai[i];
        }

        double vidurkis =  Double.valueOf(pazymiuSuma) / pazymiai.length;
        System.out.println("Pazymiu vidurkis: " + Math.round(vidurkis));*/

  /* Kambarys svetaine = new Kambarys(5.2f, 4.5f, 2.85f);
   svetaine.SetIlgis(6.0f);

       System.out.print("Kambario plotas: " + svetaine.GetPlotas());*/





/*        Scanner ivedimoGaudykle = new Scanner(System.in);

        System.out.print("Iveskite skaiciu: ");
        int skaicius = ivedimoGaudykle.nextInt();
        int skaicius10 = skaicius + skaicius * 10;
        int skaicius100 = skaicius * 100 + skaicius10;

        System.out.println(skaicius + " + " + skaicius10 + " + " + skaicius100);*/

        /*
   int[][] lentele = new int[5][10];

   lentele[2][8]=25;
        lentele[0][4]=20;
        lentele[4][6]=15;
        System.out.println("ok?");*/

/*        Scanner ivedimoGaudykle = new Scanner(System.in);

        System.out.print("Iveskite skaiciu daugybos lentelei: ");
        int skaiciusDaugybai = ivedimoGaudykle.nextInt();


        for (int ciklokintamasis = 1; ciklokintamasis < 11; ciklokintamasis++)
        {
            System.out.println(skaiciusDaugybai + " X " + ciklokintamasis + " = " + skaiciusDaugybai * ciklokintamasis);
        }*/

/* String[] miestai = new String[10];
 miestai[0]="Kaunas";
 miestai[1]="Vilnius";*/

/*
        Scanner ivedimoGaudykle = new Scanner(System.in);

        System.out.print("Iveskite skaiciu paieskai: ");
        int ieskoti = ivedimoGaudykle.nextInt();

 int[] skaiciai = {45, 10, 75, 13, 10, 25, 8};

//boolean radau = false;
String pranesimas = "Neradau...";

        for (int i = 0; i < skaiciai.length; i++)
        {
            if (skaiciai[i]==ieskoti)
            {

                //radau = true;
                pranesimas = "Radau";
            }
            //System.out.println(skaiciai[i]);
        }

        System.out.println(pranesimas);
*/

/*        if (radau)
{
    System.out.println("Radau!");
}
else
{
    System.out.println("Neradau...");
}*/
    /*    String kelionesPradzia = "Kaunas";
        String kelionesPabaiga = "Vilnius";

                System.out.println("vaziuosim is " + kelionesPradzia + " i " + kelionesPabaiga);

                String laikinas = kelionesPradzia;
                kelionesPradzia = kelionesPabaiga;
                kelionesPabaiga = laikinas;

                System.out.println("nauja kelione is:" + kelionesPradzia);
                System.out.println("nauja kelione i:" + kelionesPabaiga);

        System.out.println(Instant.now());

        int time = 20;

        if (time < 18) {
            System.out.println("Good day.");
        }*/

     /*   for (int i = 1; i < 11; i++)
        {

            for (int ii = 1; ii < 10; ii++)
            {
                System.out.println(ii + " X " + i + " = " +ii * i);
            }
            System.out.println("");
        }*/

       // boolean savaitgalis = true;
        //System.out.println(savaitgalis);



        //final int pvmProc = 21;

      /*  System.out.println("Hello there");

        int pirmas = 5;
        int antras = 7;
        System.out.println(pirmas+antras);
        char vienoSimbolioKintamasis = 'R';


        System.out.println(vienoSimbolioKintamasis);
        pirmas = 9;

        System.out.println(pirmas+antras);
        HelloWorld newHelloWorld = new HelloWorld();
        newHelloWorld.printTwoNumbers(10, 20);

        String savaitesDiena = "Sekmadienis";*/

    }

 /*   private void printTwoNumbers(Integer first, Integer second)
    {
        System.out.println(first + second);
    }*/
}
