package todo;

import java.util.Scanner;

public class todoApp {
    public static void main(String[] args){

        Task task1 = new Task(1, "Build App","Todo", "October 13th");
        System.out.printf("%s%n", task1.getTitle());


    }
}
