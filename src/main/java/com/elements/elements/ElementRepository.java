package com.elements.elements;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ElementRepository extends CrudRepository<Element, Long> {
    List<Element> findAll();
}
