package org.hotswap.patcher.example.serviceloader;

public class HelloWorldService implements HelloService {
    @Override
    public void hello() {
        System.out.printf("Hello World!");
    }
}
