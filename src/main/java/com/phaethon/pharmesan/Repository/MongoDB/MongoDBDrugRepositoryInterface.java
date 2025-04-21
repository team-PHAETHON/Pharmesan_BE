package com.phaethon.pharmesan.Repository.MongoDB;

import com.phaethon.pharmesan.Entity.Drug;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

// DrugRepository - MongoDB (prod)

@Profile("prod")
public interface MongoDBDrugRepositoryInterface extends MongoRepository<Drug, String> {

    /**
     * List<Drug> findByItemNameContaining(String)
     *   Description : 제품명을 포함한 약품 리스트를 찾는 메소드
     *   Parameter   : - String itemName        제품명
     *   Return      : - List<Drug>             제품명을 포함한 약품 리스트
     */
    List<Drug> findByItemNameContaining(String itemName);
}