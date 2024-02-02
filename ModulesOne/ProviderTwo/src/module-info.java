module ProviderTwo {
    requires Service;
    provides my.service.spi.MyService with another.service.MyImpl;
}