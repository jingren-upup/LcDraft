package Sword;

import java.util.LinkedList;

class CQueue {
    LinkedList<Integer> A;
    LinkedList<Integer>B;
    public CQueue(){
        A = new LinkedList<Integer>();
        B = new LinkedList<Integer>();
    }

    public void appendTail(int value){
        A.addLast(value);
    }
    public int deleteHead(){
        if (!B.isEmpty()){
            return B.removeLast();
        }
        if (A.isEmpty()){
            return -1;
        }
        while(!A.isEmpty()){
            B.addLast(A.removeLast());
        }
        return B.removeLast();
    }
}
