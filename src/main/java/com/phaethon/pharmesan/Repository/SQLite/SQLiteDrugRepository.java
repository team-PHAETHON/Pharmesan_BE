package com.phaethon.pharmesan.Repository.SQLite;

import com.phaethon.pharmesan.Entity.Drug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// DrugRepository - SQLite (dev)

@Repository // 이 인터페이스가 리포지토리임.
public interface SQLiteDrugRepository extends JpaRepository<Drug, Long> {

    /**
     * List<Drug> findByItemNameContaining(String)
     *   Description : 제품명을 포함한 약품 리스트를 찾는 메소드
     *   Parameter   : - String itemName        제품명
     *   Return      : - List<Drug>             제품명을 포함한 약품 리스트
     */
    List<Drug> findByItemNameContaining(String itemName);
}