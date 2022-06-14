package pl.betiuk.project.model;

import java.util.Arrays;
import java.util.Optional;

public enum EmployeeTypeEnum {


    AM("AM"),
    DM("DM"),
    AGENT("AGENT");

    private final String name;

    EmployeeTypeEnum(String name){
        this.name=name();
    }
    @Override
    public String toString() {
        return name;
    }

    public static EmployeeTypeEnum fromString(String s) throws IllegalArgumentException{
        return Arrays.stream(EmployeeTypeEnum.values())
                .filter(v -> v.name.equalsIgnoreCase(s))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("unknown value: " + s));
    }

    public String getValue() {
        return name;
    }
}
