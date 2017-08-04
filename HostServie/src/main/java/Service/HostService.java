package Service;

import ServiceInterface.ServiceInterface;
import org.springframework.stereotype.Component;

/**
 * Created by panting1 on 2017/8/4.
 */
@Component
public class HostService implements ServiceInterface{
    @Override
    public String Echo(String arg){
        System.out.println("HostService Echo: " + arg);
        return  "HostService Echo: " + arg;
    }
}
