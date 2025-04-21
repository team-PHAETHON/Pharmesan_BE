package com.phaethon.pharmesan.Entity;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter // Lombok : Getter, Setter 자동 생성
@Setter
@Entity                         // 이 클래스가 JPA 엔티티임.
@Document(collection = "search")
@Table(name = "drug_details")   // 이 클래스가 'drug_details' 테이블에 매핑됨
public class Drug {
    @Id
    @Column(name = "_id")
    private String id; // 도큐먼트 아이디

    @Column(name = "ITEM_SEQ")
    private String itemSeqI; // 품목일련번호 - FK(Identification)

    @Column(name = "itemSeqE")
    private String itemSeqE; // 품목기준코드 - FK(easyInfo)

    @Column(name = "enterprise_name")
    private String enterpriseName; // 업체명

    @Column(name = "item_name")
    private String itemName; // 제품명

    @Column(name = "efficacy")
    private String efficacy; // 효능

    @Column(name = "method")
    private String method;  // 사용법

    @Column(name = "warning")
    private String warning;  // 주의사항경고

    @Column(name = "attention")
    private String attention;  // 주의사항

    @Column(name = "interaction")
    private String interaction;  // 상호작용

    @Column(name = "side_effect")
    private String sideEffect;  // 부작용

    @Column(name = "item_image")
    private String itemImage;  // 낱알 이미지

    @Column(name = "chart")
    private String chart;  // 성상

    @Column(name = "print_front")
    private String printFront;  // 표시(앞)

    @Column(name = "print_back")
    private String printBack;  // 표시(뒤)

    @Column(name = "drug_shape")
    private String drugShape;  // 의약품모양

    @Column(name = "color_front")
    private String colorFront;  // 색깔(앞)

    @Column(name = "color_back")
    private String colorBack;  // 색깔(뒤)

    @Column(name = "line_front")
    private String lineFront;  // 분할선(앞)

    @Column(name = "line_back")
    private String lineBack;  // 분할선(뒤)

    @Column(name = "line_long")
    private double lineLong;  // 크기(장축)

    @Column(name = "line_short")
    private double lineShort;  // 크기(단축)

    @Column(name = "thick")
    private double thick;  // 크기(두께)

    @Column(name = "class_no")
    private String classNo;  // 분류번호

    @Column(name = "class_name")
    private String className;  // 분류명

    @Column(name = "etc_otc")
    private String etcOtc;  // 전문/일반

    @Column(name = "form_code_name")
    private String formCodeName;  // 제형코드이름

    @Column(name = "item_eng_name")
    private String itemEngName;  // 제품영문명
}