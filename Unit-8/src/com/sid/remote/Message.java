package com.sid.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Message extends Remote {
    String sayName(String name) throws RemoteException;

    int FindFactorial(int num) throws RemoteException;
}
