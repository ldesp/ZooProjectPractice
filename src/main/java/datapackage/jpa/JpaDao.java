package datapackage.jpa;

import java.lang.reflect.ParameterizedType;
import java.util.Collection;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

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
	
	public Collection<E> findAll() {
		Query q = entityManager.createQuery("select * from Users;");
		Collection<E> list = q.getResultList();
		return list;
	}
}
