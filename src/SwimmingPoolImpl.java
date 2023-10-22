public class SwimmingPoolImpl implements ISwimmingPool {

    @Override
    public void fillWater() {
        System.out.println("Filling pool with water!");
    }

    @Override
    public void drainWater() {
        System.out.println("Draining water from pool!");
    }
}
