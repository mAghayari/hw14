import builder.DepositBuilder;
import deposit.Deposit;
import deposit.DepositType;

public class DepositMain {
    public static void main(String[] args) {
        Deposit aliHosseiniDeposit = DepositBuilder.aDeposit()
                .withDepositFirstName("ali")
                .withDepositLastName("hosseini")
                .withDepositType(DepositType.ShortTimeDeposit)
                .withHasCheckBook(false)
                .withHasInterest(true)
                .withMinimumDeposit(50000).buildDeposit();

        Deposit mohammadMohammadiDeposit = DepositBuilder.aDeposit()
                .withDepositFirstName("mohammad")
                .withDepositLastName("mohammadi")
                .withDepositType(DepositType.CheckingDeposit)
                .withHasCheckBook(true)
                .withHasInterest(false)
                .withMinimumDeposit(100000).buildDeposit();

        System.out.println(aliHosseiniDeposit.toString());
        System.out.println(mohammadMohammadiDeposit.toString());

    }
}
