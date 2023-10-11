public class DieselEngine extends Engine
{
    public DieselEngine(int enginePower,double cylinderVolume )
    {
        setEnginePower(enginePower);
        setCylinderVolume(cylinderVolume);
    }

    @Override
    public void calistir()
    {
        System.out.println("Dizel motor çalıştı");
    }


}
