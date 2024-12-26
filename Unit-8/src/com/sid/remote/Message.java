package com.sid.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Message extends Remote{

    String sayHello(String name ) throws RemoteException;

    int doSquareRoot(int num) throws RemoteException;
}
