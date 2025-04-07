package com.phaethon.pharmesan.Repository.SQLite;

import com.phaethon.pharmesan.Entity.Drug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SQLiteDrugRepository extends JpaRepository<Drug, Long> {
    List<Drug> findByItemNameContaining(String itemName);
}