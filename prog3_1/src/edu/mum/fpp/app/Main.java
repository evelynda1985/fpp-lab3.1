package edu.mum.fpp.app;

import edu.mum.fpp.entity.Account;
import edu.mum.fpp.entity.AccountType;
import edu.mum.fpp.entity.Employee;

public class Main {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Andrea", "Ceratti", 95000.00, 2014, 06, 15);
		Account savingAccount = new Account(employee, AccountType.SAVINGS);
		Account checkingAccount = new Account(employee, AccountType.CHECKING);
		Account retirementAccount = new Account(employee, AccountType.RETIREMENT);
		
		savingAccount.makeDeposit(300.00);
		checkingAccount.makeDeposit(300.00);
		retirementAccount.makeDeposit(300.00);
		
		System.out.println(savingAccount.toString());
		System.out.println(checkingAccount.toString());
		System.out.println(retirementAccount.toString());
		
	}

}
