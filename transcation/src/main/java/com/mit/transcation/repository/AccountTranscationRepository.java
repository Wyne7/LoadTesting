package com.mit.transcation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mit.transcation.model.AccountTransactionEntity;

@Repository
public interface AccountTranscationRepository extends JpaRepository<AccountTransactionEntity, Integer> {
	
	

}
