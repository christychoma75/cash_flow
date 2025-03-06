package com.christyprojects.cashFlow.service;

import com.christyprojects.cashFlow.dto.AccountDto;

import java.util.List;
import java.util.Optional;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);

    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);

    Optional<Object> getAccount(Long id);
}