public class MainClass
{
    public static void main(String[] args)
    {
        // Audi classımız Car'dan kalıtım alıyor. Spesifik Engine classlarımız Engine soyut sınıfından kalıtım alıyor.
        Audi a5 = new Audi("A5", new DieselEngine(110, 1.2));
        Mercedes m1 = new Mercedes("C180", new GasolineEngine(150, 1.5));

        //
        a5.CarInfo();
        a5.getEngine().calistir();
        System.out.println();
        //
        m1.CarInfo();
        m1.getEngine().calistir();
        System.out.println();
        //
        a5.gazVer();
        m1.frenYap();
        System.out.println();
        //
        a5.otonom();
        m1.otonom();
        System.out.println();
        //
        a5.parkEt();
        m1.parktanCikar();
        System.out.println();
        //
        m1.swimMode();











    }


}
