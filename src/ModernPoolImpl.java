public class ModernPoolImpl implements IModernPool {
    @Override
    public void addTemperatureControl() {
        System.out.println("Adding temperature control to the pool");
    }

    @Override
    public void autoCleaning() {
        System.out.println("Auto cleaning activated");
    }
}
