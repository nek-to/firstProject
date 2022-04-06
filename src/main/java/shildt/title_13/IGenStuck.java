package shildt.title_13;

import shildt.title_9.StackEmptyException;
import shildt.title_9.StackFullException;

public interface IGenStuck <T>{
    void push(T ob) throws StackFullException;
    T pop() throws StackEmptyException, shildt.title_13.StackEmptyException;
}
