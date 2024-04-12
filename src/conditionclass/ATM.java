package conditionclass;

public class ATM {

	double balance;
	double overdraftAmount;
	int amountEntered;

	void WithdrawMoney() {
//		boolean isBalanceEnough = balance > amountEntered || overdraftAmount > amountEntered;

		if (balance > amountEntered || overdraftAmount > amountEntered) {
			System.out.println("Customer can withdraw the amount");

		} else {
			System.out.println("Customer does not have enough balance");
		}
	}
}