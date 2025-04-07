package com.phaethon.pharmesan.Controller;

import com.phaethon.pharmesan.Entity.Drug;
import com.phaethon.pharmesan.Service.DrugSearchService;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RestController
@RequestMapping("/drug")
public class DrugSearchController {
    @Autowired
    private DrugSearchService drugSearchService;

    @PostMapping("/add")
    public Drug add(@RequestBody Drug drug) {
        return drugSearchService.addDrug(drug);
    }

    @PostMapping("/search")
    public List<Drug> search(@RequestParam String itemName) {
        return drugSearchService.getDrugsByItemName(itemName);
    }
}