package com.rakovets.course.java.core.practice.jcf_set.TexService;

public enum FineTypes {
    HIGH_SPEEDING("High speeding"),
    DRUNK_DRIVING("Drunk driving"),
    LEAVING_THE_SCENE_OF_ACCIDENT("Leaving the scene of accidents");
    private String fineTypes;

    FineTypes(String fineTypes) {
        this.fineTypes = fineTypes;
    }

    public String getFineTypes() {
        return fineTypes;
    }
}
