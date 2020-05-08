public class Sneakers implements Shoes {
    private final ShoesType shoesType = ShoesType.Sneakers;

    @Override
    public void printProductionResult() {
        System.out.println("Sneakers were produced");
    }
}
