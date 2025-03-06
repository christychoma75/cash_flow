package com.christyprojects.cashFlow.repository;

import com.christyprojects.cashFlow.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
