package com.mit.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mit.account.model.AccountEntity;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Integer> {

	@Query(value="select current_balance from Accounts where acc_number =?1",nativeQuery=true)
	Double findByAccountNumber(String accNumber);

	AccountEntity findByAccNumber(String syskey);

}
