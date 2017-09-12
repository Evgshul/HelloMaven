package hellomaven;

import asg.cliche.Command;

public class HelloMaven {
    @Command
    public String hello (String name){
        return "Hello "+name ;
    }
    @Command
    public int add(int a,int b){
                return a + b;
}
}
