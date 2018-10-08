import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AmountToPay {

    @Test
    public void AmountToPayTest(){
        Double clientNeeds = 100000.00; //Loan amount
        Double manualCalculatedPaySum = 124000.00; //Manager calculated sum
        Integer[] periodsPercent = {10,8,6}; // 10% first period, 8% second period, 6% third period
        Integer percentSum = periodsPercent[0] + periodsPercent[1] + periodsPercent[2];
        Double finalPaySum = clientNeeds + (clientNeeds * percentSum / 100); // 100 is 100%

        Assertions.assertEquals(finalPaySum,manualCalculatedPaySum, "Calculated and entered sum are different");

    }
}

