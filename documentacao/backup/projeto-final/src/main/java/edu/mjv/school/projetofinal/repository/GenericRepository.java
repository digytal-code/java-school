package edu.mjv.school.projetofinal.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class GenericRepository {
	@PersistenceContext
	private EntityManager em;
	@Transactional
	public void save(Object object) {
		em.persist(object);
	}
}
