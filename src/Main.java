public class Main {
    public static void main(String[] args) {

        ISwimmingPool oldPool = new SwimmingPoolImpl();

        System.out.println("Old Pool:");
        oldPool.fillWater();
        oldPool.drainWater();

        IModernPool modernPool = new ModernPoolImpl();
        ISwimmingPool adapter = new PoolAdapter(modernPool);

        System.out.println("\nModern Pool:");
        adapter.fillWater();
        adapter.drainWater();

    }
}
