public class PoolAdapter implements SwimmingPool {
    private ModernPool modernPool;

    public PoolAdapter(ModernPool modernPool) {
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
