package com.example.eStore.repos;

import org.springframework.stereotype.Repository;

@Repository
public interface eStoreRepoCustom {
    <T> T getReference(Long id, Class<T> tClass);
}
