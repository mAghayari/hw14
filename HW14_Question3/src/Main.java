public class Main {
    public static void main(String[] args) {
        Shoes shoes = ShoesFactory.getShoes(ShoesType.Sneakers);
        shoes.printProductionResult();
    }
}
