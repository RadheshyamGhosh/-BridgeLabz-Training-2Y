package Transactionmanager;

public class remainingLimit {
	public double L(Double dailyLimit, double usedAmount) {
    if (dailyLimit == null) {
        return 0.0;  
    }

    return dailyLimit - usedAmount;
	}
}
