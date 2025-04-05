package com.phaethon.pharmesan.Repository.MongoDB;

import com.phaethon.pharmesan.Entity.Drug;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MongoDBDrugRepository extends MongoRepository<Drug, Long> {
    List<Drug> findByItemNameContaining(String itemName);
}