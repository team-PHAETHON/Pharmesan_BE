package com.phaethon.pharmesan.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "drug_details")
public class Drug {
    @Id
    private long id;
    private String entpName;
    private String itemName;
    private String itemSeq;
    private String efcyQesitm;
    private String useMethodQesitm;
    private String atpnWarnQesitm;
    private String atpnQesitm;
    private String intrcQesitm;
    private String seQesitm;
    private String itemImage;
    private String chart;
    private String printFront;
    private String printBack;
    private String drugShape;
    private String colorClass1;
    private String colorClass2;
    private String lineFront;
    private String lineBack;
    private double lengLong;
    private double lengShort;
    private double thick;
    private String classNo;
    private String className;
    private String etcOtcName;
    private String formCodeName;
    private String itemEngName;

}