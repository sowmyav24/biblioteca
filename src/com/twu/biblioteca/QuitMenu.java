package com.twu.biblioteca;

public class QuitMenu implements MenuActionPerformed {
    public static String quitMessage;

    public void compute(String userId) {
        quitMessage = "End";
        System.exit(0);
    }
}
