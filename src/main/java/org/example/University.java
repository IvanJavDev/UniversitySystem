package org.example;

public class University {
    String id;
    String fullName;
    String shortName;
    int yearOfFoundation;
    StudyProfile mainProfile;

    public University(String fullName, String id, StudyProfile mainProfile, String shortName, int yearOfFoundation) {
        this.fullName = fullName;
        this.id = id;
        this.mainProfile = mainProfile;
        this.shortName = shortName;
        this.yearOfFoundation = yearOfFoundation;
    }

    public StudyProfile getMainProfile() {
        return mainProfile;
    }

    public void setMainProfile(StudyProfile mainProfile) {
        this.mainProfile = mainProfile;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    @Override
    public String toString() {
        return "University :" +
                "fullName = '" + fullName + '\'' +
                ", id = '" + id + '\'' +
                ", shortName = '" + shortName + '\'' +
                ", yearOfFoundation = " + yearOfFoundation +
                ", mainProfile = " + mainProfile;
    }
}
