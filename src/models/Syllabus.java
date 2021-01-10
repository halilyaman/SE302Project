package models;

import java.util.ArrayList;

public class Syllabus {
    public final int id;
    public final String courseName;
    public final String code;
    public final String semester;
    public final int theoryHours;
    public final int labHours;
    public final int localCredits;
    public final ArrayList<String> prerequisites;
    public final String courseLanguage;
    public final String courseType;
    public final String courseLevel;
    public final String courseCoordinator;
    public final ArrayList<String> courseLecturers;
    public final ArrayList<String> courseAssistants;
    public final String courseObjectives;
    public final ArrayList<String> learningOutcomes;
    public final String courseDescription;
    public final String courseCategory;
    public final ArrayList<String> weeklySubjects;
    public final ArrayList<String> courseNotesAndBooks;
    public final ArrayList<String> suggestedMaterials;
    public final ArrayList<EvaluationActivity> evaluationActivities;
    public final ArrayList<EctsActivity> ectsTable;
    public final ArrayList<Clopq> clopqRelationship;

    public Syllabus(
            int id,
            String courseName,
            String code,
            String semester,
            int theoryHours,
            int labHours,
            int localCredits,
            ArrayList<String> prerequisites,
            String courseLanguage,
            String courseType,
            String courseLevel,
            String courseCoordinator,
            ArrayList<String> courseLecturers,
            ArrayList<String> courseAssistants,
            String courseObjectives,
            ArrayList<String> learningOutcomes,
            String courseDescription,
            String courseCategory,
            ArrayList<String> weeklySubjects,
            ArrayList<String> courseNotesAndBooks,
            ArrayList<String> suggestedMaterials,
            ArrayList<EvaluationActivity> evaluationActivities,
            ArrayList<EctsActivity> ectsTable,
            ArrayList<Clopq> clopqRelationship) {
        this.id = id;
        this.courseName = courseName;
        this.code = code;
        this.semester = semester;
        this.theoryHours = theoryHours;
        this.labHours = labHours;
        this.localCredits = localCredits;
        this.prerequisites = prerequisites;
        this.courseLanguage = courseLanguage;
        this.courseType = courseType;
        this.courseLevel = courseLevel;
        this.courseCoordinator = courseCoordinator;
        this.courseLecturers = courseLecturers;
        this.courseAssistants = courseAssistants;
        this.courseObjectives = courseObjectives;
        this.learningOutcomes = learningOutcomes;
        this.courseDescription = courseDescription;
        this.courseCategory = courseCategory;
        this.weeklySubjects = weeklySubjects;
        this.courseNotesAndBooks = courseNotesAndBooks;
        this.suggestedMaterials = suggestedMaterials;
        this.evaluationActivities = evaluationActivities;
        this.ectsTable = ectsTable;
        this.clopqRelationship = clopqRelationship;
    }
}