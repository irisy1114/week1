package edu.wctc;

public class ConsoleOutput implements AppOutput{
    @Override
    public void output(String text) {
        System.out.println(text);
    }
}
