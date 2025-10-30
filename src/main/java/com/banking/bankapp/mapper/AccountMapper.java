package com.banking.bankapp.mapper;


import com.banking.bankapp.dto.AccountRequestDto;
import com.banking.bankapp.dto.AccountResponseDto;
import com.banking.bankapp.entity.Account;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AccountMapper {

    @Mapping(target = "id", ignore = true)
    Account toEntity(AccountRequestDto accountRequestDto);

    AccountResponseDto toDto(Account account);
}
