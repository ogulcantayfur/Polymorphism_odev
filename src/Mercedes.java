public class Mercedes extends Car implements Parkable , Swimmable
{
    Mercedes(String model, Engine engine)
    {
        setMarka("Mercedes");
        setModel(model);
        setEngine(engine);
    }
    @Override
    public void swimMode()
    {
        System.out.println("Yuzme moduna geçti");
    }
    public void otonom()
    {
        System.out.println("Mercedes otonom çalıştı");
    }
    @Override
    public void parktanCikar()
    {
        System.out.println("Mercedes park çıktı");
    }

    @Override
    public void parkEt()
    {
        System.out.println("Mercedes parktan çıkarıldı");
    }
}
