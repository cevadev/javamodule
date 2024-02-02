package my.service.spi;

import my.service.impl.MyServiceImpl;

public class ServiceFactory {
    public static MyService getService(){
        return new MyServiceImpl();
    }
}
