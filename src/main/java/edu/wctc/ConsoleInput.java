package edu.wctc;

import java.util.Scanner;

public class ConsoleInput implements AppInput{
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
