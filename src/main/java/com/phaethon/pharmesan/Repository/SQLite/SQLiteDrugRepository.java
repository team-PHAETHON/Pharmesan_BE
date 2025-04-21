package com.phaethon.pharmesan.Repository.SQLite;

import com.phaethon.pharmesan.Entity.Drug;
import com.phaethon.pharmesan.Repository.DrugRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Profile("dev")
public class SQLiteDrugRepository implements DrugRepository {

    private final SQLiteDrugRepositoryInterface sqLiteDrugRepositoryInterface;

    public SQLiteDrugRepository(SQLiteDrugRepositoryInterface sqLiteDrugRepositoryInterface) {
        this.sqLiteDrugRepositoryInterface = sqLiteDrugRepositoryInterface;
    }

    @Override
    public List<Drug> findByItemNameContaining(String itemName) {
        return sqLiteDrugRepositoryInterface.findByItemNameContaining(itemName);
    }

    public Drug save(Drug drug) {
        return sqLiteDrugRepositoryInterface.save(drug);
    }
}
