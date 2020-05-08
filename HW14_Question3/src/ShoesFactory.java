public class ShoesFactory {

    public static Shoes getShoes(ShoesType shoesType) {
        if (shoesType.equals(ShoesType.FormalShoes))
            return new FormalShoes();
        else if (shoesType.equals(ShoesType.OrthopedicShoes))
            return new OrthopedicShoes();
        else if (shoesType.equals(ShoesType.Sneakers))
            return new Sneakers();
        else
            return null;
    }
}
