package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.entity.Account;
import com.cg.exception.AccountException;


@Repository("accdao")
public class AccountDaoImpl implements AccountDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public boolean addAccount(Account account) {
		em.persist(account);
		return true;
	}

	@Override
	public boolean editAccount(Account account) {
		em.merge(account);
		return true;
	}

	@Override
	public Account getAccount(int aid) throws AccountException {
		Account account = em.find(Account.class, aid);
		if (account == null) throw new AccountException("Account Id not exists for " + aid);
		return account;
	}

	@Override
	public List<Account> getAccount()  {
		TypedQuery<Account> query = em.createQuery("from Account", Account.class);
		return query.getResultList();
	}
}
