package com.sid.remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MesageImpl extends UnicastRemoteObject implements Message {

    protected MesageImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayName(String name) throws RemoteException {
        return "My name is" + name;
    }

    @Override
    public int FindFactorial(int num) throws RemoteException {
        if(num==0 || num==1) {
            return 1;
        }
        else {
            return num* FindFactorial(num-1);
        }
    }
}
