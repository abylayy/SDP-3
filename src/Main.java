public class Main {
    public static void main(String[] args) {

        SwimmingPool oldPool = new SwimmingPoolImpl();

        System.out.println("Old Pool:");
        oldPool.fillWater();
        oldPool.drainWater();

        ModernPool modernPool = new ModernPoolImpl();
        SwimmingPool adapter = new PoolAdapter(modernPool);

        System.out.println("\nModern Pool:");
        adapter.fillWater();
        adapter.drainWater();

    }
}
