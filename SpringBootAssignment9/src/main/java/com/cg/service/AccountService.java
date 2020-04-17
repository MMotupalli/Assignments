package com.cg.service;

import java.util.List;

import com.cg.entity.Account;
import com.cg.exception.AccountException;

public interface AccountService {
	boolean addAccount(Account account);
	boolean transferFund(int from, int to, double amt) throws AccountException;
	List<Account> viewAccount();

}
