public class Audi extends Car
{
    Audi(String model, Engine engine)
    {
        setMarka("Audi");
        setModel(model);
        setEngine(engine);
    }

    public void otonom()
    {
        System.out.println("Audi otonom çalıştı");
    }

    @Override
    public void parkEt()
    {
        System.out.println("Audi park edildi");
    }

    @Override
    public void parktanCikar()
    {
        System.out.println("Audi parktan çıkarıldı");
    }




}
