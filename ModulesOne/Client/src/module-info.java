module Client {
    /* junto a requires se especifica el nombre del modulo requerido */
    requires Service;

    /* declaramos que usamos un service */
    uses my.service.spi.MyService;
}