package com.twu.biblioteca;

public class InvalidMenuOption implements MenuActionPerformed {

    private BibliotecaAppView bibliotecaAppView;
    public InvalidMenuOption(BibliotecaAppView bibliotecaAppView) {
        this.bibliotecaAppView=bibliotecaAppView;
    }
    public void compute() {
        bibliotecaAppView.displayMessage(Message.INVALID_MENU_OPTION_MESSAGE);
    }
}
