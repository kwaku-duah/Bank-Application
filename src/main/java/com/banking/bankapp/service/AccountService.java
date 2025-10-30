package com.banking.bankapp.service;

import com.banking.bankapp.dto.AccountRequestDto;
import com.banking.bankapp.dto.AccountResponseDto;

import java.util.Optional;

public interface AccountService {
    AccountResponseDto createAccount(AccountRequestDto accountRequestDto);
    Optional<AccountResponseDto> getAccount(Long id);
    void deposit(Long id, double balance);
    void withdraw(Long id, double balance);
}
