package Hallway_Class;

import com.careerdevs.hallwayProject.users.Student;

import java.time.LocalDateTime;
import java.util.Map;

public class MessageBoard {

    private Map<Title, String> board;

    public MessageBoard(Map<Title, String> board) {
        this.board = board;
    }
    
    public void showBoard(){
        for (Map.Entry<Title, String> entry:board.entrySet()
             ) {
            Title keyvalue = entry.getKey();
            String value = entry.getValue();

            System.out.println(keyvalue + "\n" + value);
            System.out.println("- ".repeat(20)); //Used to separate each message.
        }
    }


    private class Title{ //Inner Class for Map
        String title;
        LocalDateTime timePosted;

        public Title(String title, LocalDateTime timePosted) {
            this.title = title;
            this.timePosted = timePosted;
        }
        //TODO: Create methods that prompt student to input the name of their message while it grabs the date, time, and student name. Impliment in constructor?
    }
}
