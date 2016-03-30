package datapackage.jpa;

import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import datapackage.dao.Dao;

public abstract class JpaDao<K, E> implements Dao<K, E> {

	protected Class<E> entityClass;
	@Inject
	protected EntityManager entityManager;

	public JpaDao(Class<E> entityClass) {
		this.entityClass = entityClass;
//		ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericInterfaces()[0];
//		this.entityClass = (Class<E>) genericSuperclass.getActualTypeArguments()[1];
	}

	public void persist(E entity) {
		entityManager.persist(entity);
	}

	public void remove(E entity) {
		entityManager.remove(entity);
	}

	public E findById(K id) {
		return entityManager.find(entityClass, id);
	}
	
	
	
	public List<E> findAll() {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<E> cq = cb.createQuery(entityClass);
		Root<E> root = cq.from(entityClass);
		cq.select(root);
		TypedQuery<E> q = entityManager.createQuery(cq);
		List<E> list = q.getResultList();	
		return list;
	}	
	
	
	
}
