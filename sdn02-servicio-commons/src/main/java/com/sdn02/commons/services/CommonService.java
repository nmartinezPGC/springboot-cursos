package com.sdn02.commons.services;

import java.util.Optional;

public interface CommonService<E> {
	// Methods of the Class
	public Iterable<E> findAll();

	public Optional<E> findById(Long id);

	public E save(E entity);

	public void deleteById(Long id);
}
