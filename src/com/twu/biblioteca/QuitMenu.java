package com.twu.biblioteca;

public class QuitMenu implements MenuActionPerformed{
    public static String quitMessage;

    public void compute() {
        quitMessage = "End";
        System.exit(0);}
}
