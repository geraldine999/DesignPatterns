public class Main {

    //PATRÓN DE DISEÑO: técnicas que nos permiten resolver problemas comunes en el mundo
    //de la programación
    //Hay de 3 tipos:
    //💜Creacionales -> son utilizados en lugar de la instanciación directa a través de constructor.
    //Concierne al proceso de creación de objetos. Flexibilidad a la hora de crear objetos y cómo se
    //inicializan.
    //💜Estructurales -> tratan la composición de las clases y objetos. Separan la interfaz de la
    // implementación con el objetivo de crear estructuras más complejas. Nos garantizan que
    //cuando una de las partes cambia, no es necesario cambiar toda la estructura de la aplicación.
    //💜Comportamiento -> se encargan de definir las formas en las que interactúan y
    //reparten responsabilidades las distintas clases y objetos

    //Beneficios:
    //1- Nos ofrecen una manera de solucionar problemas relacionados con el desarrollo de software
    //utilizando una solución ampliamente probada.
    //2- La comunicación
    //entre los programadores es mucho más eficiente puesto que utilizando el patrón
    // tod el equipo entiende el código a la primera

    //UML-> lenguaje gráfico para modelar, especificar y documentar software
    public static void main(String[] args) {
        testFactoryMethod();
    }

    private static void testFactoryMethod(){
        Payment payment = PaymentFactory.buildPayment(PaymentType.GOOGLE_PAY);

        payment.doPayment();
    }
}