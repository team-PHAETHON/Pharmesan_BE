package com.phaethon.pharmesan.Entity;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "drug_details")
public class Drug {
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "entp_name")
    private String entpName;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "item_seq")
    private String itemSeq;

    @Column(name = "efcy_qesitm")
    private String efcyQesitm;

    @Column(name = "use_method_qesitm")
    private String useMethodQesitm;

    @Column(name = "atpn_warn_qesitm")
    private String atpnWarnQesitm;

    @Column(name = "atpn_qesitm")
    private String atpnQesitm;

    @Column(name = "intrc_qesitm")
    private String intrcQesitm;

    @Column(name = "se_qesitm")
    private String seQesitm;

    @Column(name = "item_image")
    private String itemImage;

    @Column(name = "chart")
    private String chart;

    @Column(name = "print_front")
    private String printFront;

    @Column(name = "print_back")
    private String printBack;

    @Column(name = "drug_shape")
    private String drugShape;

    @Column(name = "color_class1")
    private String colorClass1;

    @Column(name = "color_class2")
    private String colorClass2;

    @Column(name = "line_front")
    private String lineFront;

    @Column(name = "line_back")
    private String lineBack;

    @Column(name = "leng_long")
    private double lengLong;

    @Column(name = "leng_short")
    private double lengShort;

    @Column(name = "thick")
    private double thick;

    @Column(name = "class_no")
    private String classNo;

    @Column(name = "class_name")
    private String className;

    @Column(name = "etc_otc_name")
    private String etcOtcName;

    @Column(name = "form_code_name")
    private String formCodeName;

    @Column(name = "item_eng_name")
    private String itemEngName;

}