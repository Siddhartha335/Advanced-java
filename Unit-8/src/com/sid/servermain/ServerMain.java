package com.sid.servermain;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import com.sid.remote.MesageImpl;

public class ServerMain {
    private void startServer() {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("myMessage", new MesageImpl());
        }
        catch (Exception e) {

        }
        System.out.println("System is ready!");
    }

    public static void main(String[] args) {
        ServerMain smain = new ServerMain();
        smain.startServer();
    }
}
