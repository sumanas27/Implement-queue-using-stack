import java.util.*;

public class Solution {
  private class NewQueue<T>(){
    private Stack<T> stackNew = new Stack<T>();
    private Stack<T> stackOld = new Stack<T>();
    
    public void enqueue(T value){
      //add item in the stackNew
      stackNew.push(value);
    }
    
    public T peek(){
      //move elements from stackNew to stackOld
      moveStacks();
      return stackOld.peek();
    }
    
    private void moveStacks(){
      if(stackold.isEmpty()){
        while(!stackNew.isEmpty()){
          stackOld.push(stackNew.pop());
        }
      }
    }
    
    public T dequeue(){
      //move elements from stackNew to stackOld
      moveStacks();
      return stackOld.pop();
    }
  }
  
}
