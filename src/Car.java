public class Car implements Parkable
{
    private Engine engine;
    private String brand;
    private String model;

    public Engine getEngine()
    {
        return engine;
    }

    public void setEngine(Engine engine)
    {
        this.engine = engine;
    }

    public String getMarka()
    {
        return brand;
    }

    protected void setMarka(String marka)
    {
        this.brand = marka;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void gazVer()
    {
        System.out.println("Araba hızlandı");
    }

    public void frenYap()
    {
        System.out.println("Araba yavaşladı");
    }

    public void otonom()
    {
        System.out.println("Araba otonom çalıştı");
    }

    @Override
    public void parkEt()
    {
        System.out.println("Araba park edildi.");
    }

    @Override
    public void parktanCikar()
    {
        System.out.println("Araba parktan çıkarıldı.");
    }


    public void CarInfo()
    {
        System.out.println(getMarka() +"->"+getModel()+"->"+ getEngine().getEnginePower()+" HP"+"->"+getEngine().getCylinderVolume());
    }
}
