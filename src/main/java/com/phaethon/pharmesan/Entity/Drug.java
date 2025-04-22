package com.phaethon.pharmesan.Entity;
import lombok.Getter;
import lombok.Setter;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter // Lombok : Getter, Setter 자동 생성
@Setter
@Document(collection = "search")
public class Drug {
    @Id
    private String itemNo; // 품목기준코드 - FK(easyInfo)
    private String enterpriseName; // 업체명
    private String itemName; // 제품명
    private String efficacy; // 효능
    private String method;  // 사용법
    private String warning;  // 주의사항경고
    private String attention;  // 주의사항
    private String interaction;  // 상호작용
    private String sideEffect;  // 부작용
    private String itemImage;  // 낱알 이미지
    private String chart;  // 성상
    private String printFront;  // 표시(앞)
    private String printBack;  // 표시(뒤)
    private String drugShape;  // 의약품모양
    private String colorFront;  // 색깔(앞)
    private String colorBack;  // 색깔(뒤)
    private String lineFront;  // 분할선(앞)
    private String lineBack;  // 분할선(뒤)
    private String lineLong;  // 크기(장축)
    private String lineShort;  // 크기(단축)
    private String thick;  // 크기(두께)
    private String classNo;  // 분류번호
    private String className;  // 분류명
    private String etcOtc;  // 전문/일반
    private String formCodeName;  // 제형코드이름
    private String itemEngName;  // 제품영문명
}