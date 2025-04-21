package com.phaethon.pharmesan.Repository;

import com.phaethon.pharmesan.Entity.Drug;

import java.util.List;

public interface DrugRepositoryInterface {
    List<Drug> findByItemNameContaining(String itemName);
}
