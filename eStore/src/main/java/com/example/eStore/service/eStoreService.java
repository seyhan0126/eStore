package com.example.eStore.service;

import com.example.eStore.model.eStore;
import org.springframework.stereotype.Service;

@Service
public interface eStoreService {
    void createStore(eStore store);
    void updateStore(eStore store);
    Iterable<eStore> getAllStores();
    eStore getStoreById(Long estoreId);
    void deleteStoreById(Long estoreId);
}
