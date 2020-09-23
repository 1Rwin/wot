package com.filrob.wot.domain.cards.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public enum CardType {

    Achievement(Value.Achievement),
    Vehicle(Value.Vehicle),
    Medal(Value.Medal),
    Base(Value.Base),
    Barracks(Value.Barracks);

    private String name;

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class Value {
        public static final String Achievement = "Achievement";
        public static final String Vehicle = "Vehicle";
        public static final String Medal = "Medal";
        public static final String Base = "Base";
        public static final String Barracks = "Barracks";
    }
}
