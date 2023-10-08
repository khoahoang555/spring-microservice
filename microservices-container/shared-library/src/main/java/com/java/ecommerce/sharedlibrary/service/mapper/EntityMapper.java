package com.java.ecommerce.sharedlibrary.service.mapper;

import java.util.List;

public interface EntityMapper<D, E> {
    public D toDTO(E entity);
    public E toEntity(D dto);
    public List<D> toDTO(List<E> entities);
    public List<E> toEntity(List<D> dtos);
}
