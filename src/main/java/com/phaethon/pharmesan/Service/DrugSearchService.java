package com.phaethon.pharmesan.Service;

import com.phaethon.pharmesan.Entity.Drug;
import com.phaethon.pharmesan.Repository.DrugRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // 이 클래스가 서비스 클래스임.
public class DrugSearchService {

    private final DrugRepository drugRepository;

    @Autowired
    public DrugSearchService(DrugRepository drugRepository) {
        this.drugRepository = drugRepository;
    }

    // TODO : 의약외품 검색 기능 관련 메소드에 대한 로그 기록 기능 추가 필요

    /**
     * public Drug addDrug(Drug)
     *   Description : 새로운 약품 정보를 데이터베이스에 저장하는 메소드
     *   Parameter   : - Drug drug          저장할 약품 정보
     *   Return      : - Drug               저장한 약품 정보를 반환
     */
    public Drug addDrug(Drug drug) {
        return drugRepository.save(drug);
    }

    /**
     * public List<Drug> getDrugsByItemName(String)
     *   Description : 제품명을 포함한 약품을 데이터베이스에서 조회하는 메소드
     *   Parameter   : - String itemName    제품명
     *   Return      : List<Drug>           제품명을 포함한 약품 리스트
     */
    public List<Drug> getDrugsByItemName(String itemName) {
        return drugRepository.findByItemNameContaining(itemName);
    }
}