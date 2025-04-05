package com.phaethon.pharmesan.Service;

import com.phaethon.pharmesan.Entity.Drug;
import com.phaethon.pharmesan.Repository.SQLite.SQLiteDrugRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DrugSearchService {
    @Autowired
    private SQLiteDrugRepository sqLiteDrugRepository;

    // TODO : Log 기능
    public Drug addDrug(Drug drug) {
        return sqLiteDrugRepository.save(drug);
    }

    public List<Drug> getDrugsByItemName(String itemName) {
        return sqLiteDrugRepository.findByItemNameContaining(itemName);
    }
}