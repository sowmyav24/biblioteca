package com.twu.menuoptions;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

public class QuitMenuTest {

    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void exitsWithStatusCode() {
        exit.expectSystemExitWithStatus(0);

        QuitMenu quitMenu = new QuitMenu();

        quitMenu.compute("abc");
    }
}