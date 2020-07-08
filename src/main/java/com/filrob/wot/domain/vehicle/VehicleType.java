package com.filrob.wot.domain.vehicle;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public enum VehicleType {

    Light(Value.Light),
    Medium(Value.Medium),
    Heavy(Value.Heavy),
    TankDestroyer(Value.TankDestroyer),
    Artillery(Value.Artillery),
    Support(Value.Support);

    private String name;

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class Value {
        public static final String Light = "Light";
        public static final String Medium = "Medium";
        public static final String Heavy = "Heavy";
        public static final String TankDestroyer = "TankDestroyer";
        public static final String Artillery = "Artillery";
        public static final String Support = "Support";

    }
}
