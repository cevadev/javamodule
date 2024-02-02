package my.client;

import my.service.spi.MyService;
import my.service.spi.ServiceFactory;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

public class Client {
    public static void main(String[] args) throws Throwable{
        // 1era forma de obtener la implementacion
//        MyService service = ServiceFactory.getService();

        // 2da forma - usando service loader
        ServiceLoader<MyService> serviceLoader = ServiceLoader.load(MyService.class);
        for(MyService service : serviceLoader){
            /* reflection */
            Class<?> clazz = service.getClass();
            try{
                System.out.println("Type of our service is " + clazz.getName());
                System.out.println("message field found, altering data...");
                Field msg = clazz.getDeclaredField("message");
                msg.setAccessible(true); // campo private message lo hacemos accesible
                msg.set(null, "007 says hello");
            }catch (NoSuchFieldException nfe){
                System.out.println("No message field in the service");
            }

            System.out.println(service.getMessage());
        }
    }
}
