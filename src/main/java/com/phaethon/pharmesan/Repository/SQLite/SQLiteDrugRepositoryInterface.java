package com.phaethon.pharmesan.Repository.SQLite;

import com.phaethon.pharmesan.Entity.Drug;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// DrugRepository - SQLite (dev)

public interface SQLiteDrugRepository extends JpaRepository<Drug, Long> {

    /**
     * List<Drug> findByItemNameContaining(String)
     *   Description : 제품명을 포함한 약품 리스트를 찾는 메소드
     *   Parameter   : - String itemName        제품명
     *   Return      : - List<Drug>             제품명을 포함한 약품 리스트
     */
    List<Drug> findByItemNameContaining(String itemName);
}