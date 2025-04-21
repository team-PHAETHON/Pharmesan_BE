package com.phaethon.pharmesan.Repository;

import com.phaethon.pharmesan.Entity.Drug;

import java.util.List;

public interface DrugRepository {
    List<Drug> findByItemNameContaining(String itemName);
    Drug save(Drug drug);
}
