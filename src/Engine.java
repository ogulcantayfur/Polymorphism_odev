public abstract class Engine
{
    private int enginePower;
    private double cylinderVolume;
    public abstract void calistir();

    public int getEnginePower()
    {
        return enginePower;
    }

    public void setEnginePower(int enginePower)
    {
        this.enginePower = enginePower;
    }

    public double getCylinderVolume()
    {
        return cylinderVolume;
    }

    public void setCylinderVolume(double cylinderVolume)
    {
        this.cylinderVolume = cylinderVolume;
    }




}
