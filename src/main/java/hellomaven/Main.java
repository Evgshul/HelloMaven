package hellomaven;

import asg.cliche.Shell;
import asg.cliche.ShellFactory;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        HelloMaven commands = new HelloMaven();
        Shell shell = ShellFactory.createConsoleShell(
            "hello",
            "HelloMaven",
            commands) ;
        shell.commandLoop();
    }


    }
