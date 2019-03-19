package com.qa.demo.service;

import org.springframework.stereotype.Service;

import com.qa.demo.entities.Account;
import com.qa.demo.repos.AccountRepo;

@Service
public class AccountService {

	private AccountRepo accountRepo;

	public AccountService(AccountRepo accountRepo) {
		this.accountRepo = accountRepo;
	}

	public void createAccount(Account account) {
		this.accountRepo.save(account);
	}

}
