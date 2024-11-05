package org.koreait.exam01;

public class Message2 {
    public void init(){
        System.out.println("init() 호출!");
    }
    public void close(){
        System.out.println("close() 호출!");
    }
    public void send(String message){
        System.out.printf("메세지:%s, 전송완료!%n", message);
    }
}
