open module Service {
    /* junto a exports se especifica el nombre del paquete a exportar */
    exports my.service.spi;

    /* permitimos el mecanismo de reflection */
    /* la palabra reserva open puede ser usando antes de module, ex: open module Service */
//    opens my.service.impl;

    /* declaramos una service interface que esta disponible con su implementacion*/
    provides my.service.spi.MyService with my.service.impl.MyServiceImpl;
}