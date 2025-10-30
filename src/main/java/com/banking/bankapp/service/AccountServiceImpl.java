package com.banking.bankapp.service;


import com.banking.bankapp.dto.AccountRequestDto;
import com.banking.bankapp.dto.AccountResponseDto;
import com.banking.bankapp.mapper.AccountMapper;
import com.banking.bankapp.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;


    @Override
    public AccountResponseDto createAccount(AccountRequestDto accountRequestDto) {
        return null;
    }

    @Override
    public Optional<AccountResponseDto> getAccount(Long id) {
        return Optional.empty();
    }

    @Override
    public void deposit(Long id, double balance) {

    }

    @Override
    public void withdraw(Long id, double balance) {

    }
}
