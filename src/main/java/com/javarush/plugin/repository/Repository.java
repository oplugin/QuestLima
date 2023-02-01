package com.javarush.plugin.repository;

import com.javarush.plugin.entity.AbstractEntity;

import java.util.Collection;
import java.util.stream.Stream;

public interface Repository<T> {
    Collection<T> getAll();

    <T> T get(long id);

    void create(T entity);

    void update(T entity);

    void delete(T entity);

    Stream<T> find(T pattern);
}
