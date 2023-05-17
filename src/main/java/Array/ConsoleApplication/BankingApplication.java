package Array.ConsoleApplication;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class BankingApplication
{
    private String AccountHolderName;
    private long AccountNumber;
    private String Branch;
    private long PanNumber;
    private double MobileNumber;
    private String Address;
}
