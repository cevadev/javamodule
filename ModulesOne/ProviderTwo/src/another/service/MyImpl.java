package another.service;

import my.service.spi.MyService;

public class MyImpl implements MyService {
    @Override
    public String getMessage() {
        return "Another secret message";
    }
}
