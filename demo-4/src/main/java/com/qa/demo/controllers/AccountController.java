package com.qa.demo.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.demo.entities.Account;
import com.qa.demo.service.AccountService;

@RestController
public class AccountController {

	private AccountService accountService;

	public AccountController(AccountService accountService) {
		this.accountService = accountService;
	}

	@PostMapping("/createAccount")
	public void createAccount(Account account) {
		this.accountService.createAccount(account);
	}
}
