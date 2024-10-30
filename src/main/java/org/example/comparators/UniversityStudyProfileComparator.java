package org.example.comparators;

import org.example.University;

import java.util.Comparator;

public class UniversityStudyProfileComparator implements UniversityComparator{
    @Override
    public int compare(University u1, University u2){
        return u1.getMainProfile().compareTo(u2.getMainProfile());
    }
}
