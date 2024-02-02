module Service {
    /* junto a exports se especifica el nombre del paquete a exportar */
    /* exportamos todo lo que haya dentro de my.service.spi solo para los modulos
    *  Client y ProviderTwo */
    exports my.service.spi to Client, ProviderTwo;

    /* permitimos el mecanismo de reflection */
    /* la palabra reserva open puede ser usando antes de module, ex: open module Service */
    opens my.service.impl to Client, ProviderTwo;

    /* declaramos una service interface que esta disponible con su implementacion*/
    provides my.service.spi.MyService with my.service.impl.MyServiceImpl;

    /* modulo service requiere al modulo Shape*/
//    requires Shapes;

    requires transitive Shapes;
}