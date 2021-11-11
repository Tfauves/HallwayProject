package Hallway_Class;

import com.careerdevs.hallwayProject.models.Student;

import java.util.List;

public class Hallway {

private Long idNum;
private String welcomeMsg;
private String importantMsg;
private String slackLink;
private String zoomLink;
private List<Student> students;


    public Hallway() {
    }

    public Hallway(Long idNum, String welcomeMsg, String importantMsg, String slackLink, String zoomLink, List<Student> students) {
        this.idNum = idNum;
        this.welcomeMsg = welcomeMsg;
        this.importantMsg = importantMsg;
        this.slackLink = slackLink;
        this.zoomLink = zoomLink;
        this.students = students;
    }


    public Hallway(String welcomeMsg, String importantMsg, String slackLink, String zoomLink, List<Student> students) {
        this.welcomeMsg = welcomeMsg;
        this.importantMsg = importantMsg;
        this.slackLink = slackLink;
        this.zoomLink = zoomLink;
        this.students = students;
    }
}
