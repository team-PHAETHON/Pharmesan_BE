package com.phaethon.pharmesan.Controller;

import com.phaethon.pharmesan.Entity.Drug;
import com.phaethon.pharmesan.Service.DrugSearchService;

import org.springframework.web.bind.annotation.*;               // Spring Web Annotation
import org.springframework.beans.factory.annotation.Autowired;  // 의존성 주입을 위한 Autowired

import java.util.List;

@RestController
@RequestMapping("/drug_search")
public class DrugSearchController {

    @Autowired // DrugSearchService 의존성 주입
    private DrugSearchService drugSearchService;

    @PostMapping("/add") // [POST] /drug_search/add
    // public Drug add() : 의약외품 정보를 추가하고, 추가한 정보를 반환
    public Drug add(@RequestBody Drug drug) { 
        return drugSearchService.addDrug(drug);
    }

    @GetMapping("/search") // [GET] /drug_search/search
    // public List<Drug> search() : 입력한 이름이 포함된 의약외품 리스트 반환
    public List<Drug> search(@RequestParam String itemName) { 
        return drugSearchService.getDrugsByItemName(itemName);
    }
}
