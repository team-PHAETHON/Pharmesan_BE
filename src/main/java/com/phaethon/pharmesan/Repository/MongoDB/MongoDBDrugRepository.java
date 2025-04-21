package com.phaethon.pharmesan.Repository.MongoDB;

import com.phaethon.pharmesan.Entity.Drug;
import com.phaethon.pharmesan.Repository.DrugRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Profile("prod")
public class MongoDBDrugRepository implements DrugRepository {

    private final MongoDBDrugRepositoryInterface mongoDBDrugRepositoryInterface;

    public MongoDBDrugRepository(MongoDBDrugRepositoryInterface mongoDBDrugRepositoryInterface) {
        this.mongoDBDrugRepositoryInterface = mongoDBDrugRepositoryInterface;
    }

    @Override
    public List<Drug> findByItemNameContaining(String itemName) {
        return mongoDBDrugRepositoryInterface.findByItemNameContaining(itemName);
    }

    @Override
    public Drug save(Drug drug) {
        return mongoDBDrugRepositoryInterface.insert(drug);
    }
}
