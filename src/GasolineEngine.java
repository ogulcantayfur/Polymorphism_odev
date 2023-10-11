public class GasolineEngine extends Engine
{
    public GasolineEngine(int enginePower,double cylinderVolume )
    {
        setEnginePower(enginePower);
        setCylinderVolume(cylinderVolume);
    }

    @Override
    public void calistir()
    {
        System.out.println("Benzinli motor çalıştı.");
    }
}
