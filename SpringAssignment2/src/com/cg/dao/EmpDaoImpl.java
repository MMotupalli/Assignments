package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cg.entity.Dept;
import com.cg.entity.Emp;

@Repository("mydao")
@Transactional
public class EmpDaoImpl implements IEmpDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public boolean addEmp(Emp emp) {
		em.persist(emp);
		return true;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public boolean editEmp(Emp emp) {
		em.merge(emp);
		return true;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public boolean deleteEmp(int eid) {
		Emp emp = em.find(Emp.class, eid);
		if (emp == null)
			return false;
		em.remove(emp);
		return true; 
	}

	@Override
	@Transactional(readOnly = true)
	public Emp viewEmp(int eid) {
		return em.find(Emp.class, eid);
	}

	@Override
	public List<Emp> viewEmp(String dept) {
		String jpql = "from Emp e inner join fetch e.dept d where d.deptName=:dname";
		TypedQuery<Emp> qry = em.createQuery(jpql, Emp.class);
		qry.setParameter("dname", dept);
		return qry.getResultList();
	}

	@Override
	public List<Emp> viewEmp() {
		String jpql = "from Emp";
		TypedQuery<Emp> qry = em.createQuery(jpql, Emp.class);
		return qry.getResultList();
	}

	@Override
	public List<Dept> viewDepts() {
		String jpql = "from Dept";
		TypedQuery<Dept> qry = em.createQuery(jpql, Dept.class);
		return qry.getResultList();
	}
}
