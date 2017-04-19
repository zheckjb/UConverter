package UConverter;

import asg.cliche.ShellFactory;

import java.io.IOException;
//cbcb

public class Main {
    public static void main(String[] args) throws IOException {
        ShellFactory
                .createConsoleShell("Command", "This is Phone book", new UniversalConverter())
                .commandLoop();
    }
}
