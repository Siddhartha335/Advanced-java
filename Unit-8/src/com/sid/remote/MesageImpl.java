package com.sid.remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MesageImpl extends UnicastRemoteObject implements Message {

    public MesageImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello(String name) throws RemoteException {
        return "My name is " + name;
    }

    @Override
    public int doSquareRoot(int num) throws RemoteException {

        return (int)Math.sqrt(num);
    }
}
