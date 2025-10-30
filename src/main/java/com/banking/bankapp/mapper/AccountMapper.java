package com.banking.bankapp.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(ComponentModel = "spring")
public interface AccountMapper {

    @Mapping(target = 'id', ignore = true)
    Account toEntity(AccountRequest accountRequest);

    AccountResponseDto toDto(Account account)
}
