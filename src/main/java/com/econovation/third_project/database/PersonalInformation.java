package com.econovation.third_project.database;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PersonalInformation {
    private String registrationId;

    // 이름
    private String name;

    // 핸드폰 번호
    private String phoneNumber;

    // 학번
    private Integer studentId;

    // 학년
    private Integer grade;

    // 학기
    private Integer semester;

    // 전공
    private String major;

    // 복수전공
    private String doubleMajor;
    // 부전공
    private String minor;



    // 이메일
    private String email;
}
