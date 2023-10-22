public class PoolAdapter implements ISwimmingPool {
    private IModernPool modernPool;

    public PoolAdapter(IModernPool modernPool) {
        this.modernPool = modernPool;
    }

    @Override
    public void fillWater() {
        modernPool.addTemperatureControl();
        System.out.println("Filling pool with water!");
    }

    @Override
    public void drainWater() {
        modernPool.autoCleaning();
        System.out.println("Draining water from pool!");
    }
}
