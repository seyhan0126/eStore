package com.example.eStore.repos;

import com.example.eStore.model.eStore;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface eStoreRepo extends CrudRepository<eStore, Long>,eStoreRepoCustom {
}
