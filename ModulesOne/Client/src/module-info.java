module Client {
    /* junto a requires se especifica el nombre del modulo requerido */
    /* el modulo Client requiere a los modulos Service y Shape para funcionar*/
    requires Service;

    /* si anulamos requires Shape pero en Service colocamos requires transitive Shapes
    * entonces Client trendra acceso a Shape */
//    requires Shapes;

    /* declaramos que usamos un service */
    uses my.service.spi.MyService;
}