package com.phaethon.pharmesan.Service;

import com.phaethon.pharmesan.Entity.Drug;

import com.phaethon.pharmesan.Repository.MongoDB.MongoDBDrugRepository;
import com.phaethon.pharmesan.Repository.SQLite.SQLiteDrugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugSearchService {
    @Autowired
    MongoDBDrugRepository mongoDBDrugRepository;

    @Autowired
    SQLiteDrugRepository sqliteDrugRepository;

    public Drug addDrug(Drug drug) {
        if (isMongoDBProfileActive()) return mongoDBDrugRepository.save(drug);
        else if (isSQLiteProfileActive()) return sqliteDrugRepository.save(drug);
        return null;
    }

    public List<Drug> getDrugsByItemName(String itemName) {
        if (isMongoDBProfileActive()) return mongoDBDrugRepository.findByItemNameContaining(itemName);
        else if (isSQLiteProfileActive()) return sqliteDrugRepository.findByItemNameContaining(itemName);
        return null;
    }

    private boolean isMongoDBProfileActive() { return "prod".equals(System.getProperty("spring.profiles.active")); }
    private boolean isSQLiteProfileActive() { return "dev".equals(System.getProperty("spring.profiles.active")); }
}