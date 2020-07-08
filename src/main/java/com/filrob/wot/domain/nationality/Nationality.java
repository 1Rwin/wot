package com.filrob.wot.domain.nationality;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public enum Nationality {

    Russia(Value.Russia),
    German(Value.German),
    French(Value.French),
    GreatBritain(Value.USA);

    private String name;

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class Value {
        public static final String Russia = "Russia";
        public static final String German = "German";
        public static final String French = "French";
        public static final String USA = "USA";
    }
}
