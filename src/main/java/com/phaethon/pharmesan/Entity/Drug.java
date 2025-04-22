package com.phaethon.pharmesan.Entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter // Lombok : Getter, Setter 자동 생성
@Setter
@Document(collection = "search")
public class Drug {

    @Id
    private String id; // 도큐먼트 아이디

    @Field("item_no")
    private String itemNo; // 품목기준코드 (FK)

    @Field("enterprise_name")
    private String enterpriseName; // 업체명

    @Field("item_name")
    private String itemName; // 제품명

    @Field("efficacy")
    private String efficacy; // 효능

    @Field("method")
    private String method;  // 사용법

    @Field("warning")
    private String warning;  // 주의사항경고

    @Field("attention")
    private String attention;  // 주의사항

    @Field("interaction")
    private String interaction;  // 상호작용

    @Field("side_effect")
    private String sideEffect;  // 부작용

    @Field("item_image")
    private String itemImage;  // 낱알 이미지

    @Field("chart")
    private String chart;  // 성상

    @Field("print_front")
    private String printFront;  // 표시(앞)

    @Field("print_back")
    private String printBack;  // 표시(뒤)

    @Field("drug_shape")
    private String drugShape;  // 의약품모양

    @Field("color_front")
    private String colorFront;  // 색깔(앞)

    @Field("color_back")
    private String colorBack;  // 색깔(뒤)

    @Field("line_front")
    private String lineFront;  // 분할선(앞)

    @Field("line_back")
    private String lineBack;  // 분할선(뒤)

    @Field("line_long")
    private String lineLong;  // 크기(장축)

    @Field("line_short")
    private String lineShort;  // 크기(단축)

    @Field("thick")
    private String thick;  // 크기(두께)

    @Field("class_no")
    private String classNo;  // 분류번호

    @Field("class_name")
    private String className;  // 분류명

    @Field("etc_otc")
    private String etcOtc;  // 전문/일반

    @Field("form_code_name")
    private String formCodeName;  // 제형코드이름

    @Field("item_eng_name")
    private String itemEngName;  // 제품영문명
}
