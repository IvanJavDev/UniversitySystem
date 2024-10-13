package org.example;

public enum StudyProfile {

    MEDICINE("Медицина"),
    CONSTRUCTION("Строительство"),
    MECHANICS("Механика"),
    ASTROLOGY("Астрология"),
    PROGRAMMING("Программирование");
    private String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }
}

