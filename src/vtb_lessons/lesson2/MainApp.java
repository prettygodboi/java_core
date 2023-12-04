package vtb_lessons.lesson2;

import java.io.BufferedReader;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Participant[] participants = {
                new Human(1000, 500),
                new Cat(5000, 2500),
                new Robot(10000, 10000)
        };
        Obstacle[] obstacles = {
                new Treadmill(6000),
                new Wall(2300)
        };

        for(Participant participant: participants){
            for (Obstacle obstacle:obstacles){
                obstacle.contest(participant);
            }
        }
    }
}
