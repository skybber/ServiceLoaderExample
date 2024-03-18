package org.hotswap.patcher.example.serviceloader;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        new Main().process();
    }

    private void process() {
        ServiceLoader<HelloService> services = ServiceLoader.load(HelloService.class);
        for (HelloService service : services) {
            service.hello();
        }
    }
}