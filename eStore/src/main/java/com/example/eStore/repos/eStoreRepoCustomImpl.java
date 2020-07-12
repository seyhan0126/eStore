package com.example.eStore.repos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class eStoreRepoCustomImpl implements eStoreRepoCustom{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public <T> T getReference(Long id, Class<T> tClass){
        return entityManager.getReference(tClass, id);
    }
}
