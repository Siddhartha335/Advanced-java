package com.sid.clientmain;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import com.sid.remote.Message;

public class ClientMain {
    private void doTest() {
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1",1099);
            Message impl = (Message) registry.lookup("myMessage");
            String s = impl.sayHello("Sid");
            int num = impl.doSquareRoot(25);
            System.out.println("Message sent and response received!");
            System.out.println(s + "\n" + num);
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        ClientMain cmain = new ClientMain();
        cmain.doTest();
    }
}
