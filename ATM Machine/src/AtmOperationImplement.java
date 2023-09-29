import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AtmOperationImplement implements AtmOperationInterFace{
    ATM atm = new ATM();
    Map<Double,String> ministates = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available Balance is :" + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount%500==0) {
            if (withdrawAmount <= atm.getBalance()) {
                ministates.put(withdrawAmount, " Amount Withdrawn");
                System.out.println(" Collect the cash " + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            } else {
                System.out.println(" Insufficient Balance !!");
            }
        } else  {
            System.out.println("Please enter the multiple of 500");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        ministates.put(depositAmount, " Amount Deposited");
        System.out.println(depositAmount + " Deposited Successfully !!");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
        for (Map.Entry<Double, String> m : ministates.entrySet()) {
            System.out.println(m.getKey()+""+m.getValue());
        }
    }
}
