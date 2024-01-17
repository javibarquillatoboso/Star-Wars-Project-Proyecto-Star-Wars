//Lo que hacen estas dos líneas es incorporar las clases Scanner y Random del paquete java.util. Scanner se usa para leer la entrada del usuario, y Random para generar números aleatorios.
import java.util.Random;
import java.util.Scanner;

//Esto es para declarar la clase de proyecto Star Wars
public class proyectostarwars {

    //Aca es donde comienza el programa. Se inicia el scanner para leer la entrada del usuario.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Muestra la introducción y espera a que presionemos Intro
        IntroduccionAlepisodiodestarwars();
        scanner.nextLine();

        // Se inicia el juego de Star Wars
        int nivelenelqueestamos = 1;

        // Bucle principal el cual va a avanzando con cada nivel que ganamos
        while (nivelenelqueestamos <= 5) {
            // Aquí es donde se almacena el resultado del nivel actual
            boolean ElresultadodelNivel = false;

            // Se utiliza para saber el nivel actual y llamar al método correspondiente
            switch (nivelenelqueestamos) {
                case 1:
                    ElresultadodelNivel = jugarNivel1delepisodiodestarwars(scanner);
                    break;
                case 2:
                    ElresultadodelNivel = jugarNivel2delepisodiodestarwars(scanner);
                    break;
                case 3:
                    ElresultadodelNivel = jugarNivel3delepisodiodestarwars(scanner);
                    break;
                case 4:
                    ElresultadodelNivel = jugarNivel4delepisodiodestarwars(scanner);
                    break;
                case 5:
                    ElresultadodelNivel = jugarNivel5delepisodiodestarwars(scanner);
                    break;
            }

            // Aquí es donde el programa comprueba en el caso de que hayamos ganado o perdido el nivel.
            if (!ElresultadodelNivel) {

                //Aquí se muestra en el caso de que hayamos perdido se muestre el mensaje de que hemos perdido y luego el programa hace que termine el juego
                HayquemostrarestodeaquísiPierdes();
                break;
            }

            //Con esto hacemos que el programa avanze al siguiente nivel.
            nivelenelqueestamos++;
        }

        // Esto verifica en el caso de que hayamos completado todos los niveles
        if (nivelenelqueestamos == 6) {
            // Esto es para que en el caso de que ganemos se muestre el mensaje de que hemos ganado
            HayquemostrarestodeaquísiGanas();
        }

        //El programa nos agradece que hayamos jugado y finaliza el scanner.
        System.out.println("Gracias por jugar :D");
        scanner.close();
    }

    //Esto lo que hace es que nos muestre la introduccion del juego. El codigo Asci lo he puesto porque quedaba muy guapo en la intro.
    public static void IntroduccionAlepisodiodestarwars() {
        System.out.println("             ##");
        System.out.println("   #####    #####    ####    ######            ##   ##   ####    ######    #####");
        System.out.println("  ##         ##         ##    ##  ##           ## # ##      ##    ##  ##  ##");
        System.out.println("   #####     ##      #####    ##               #######   #####    ##       #####");
        System.out.println("       ##    ## ##  ##  ##    ##               #######  ##  ##    ##           ##");
        System.out.println("  ######      ###    #####   ####               ## ##    #####   ####     ######");
        System.out.println(" ");
        System.out.println("=== STAR WARS CÓDIGOS SECRETOS ===");
        System.out.println("Hace mucho tiempo, en una galaxia muy, muy lejana...");
        System.out.println("La Princesa Leia, Luke Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en");
        System.out.println("una nave imperial robada en una misión secreta para infiltrarse en otra");
        System.out.println("estrella de la muerte que el imperio está construyendo para destruirla.");
        System.out.println("(Presiona Enter para continuar)");
    }

    //Esto es para que podamos jugar el nivel 1
    public static boolean jugarNivel1delepisodiodestarwars(Scanner scanner) {

        //Esto es para generar numeros aleatorios
        Random random = new Random();

        //Esto lo que hace es asignar esos numeros aleatorios para sistemas1 y sectors2
        int sistemas1 = random.nextInt(10) + 1;
        int sectors2 = random.nextInt(11) + 20;

        //Esto es para que se nos muestre el texto del nivel 1
        System.out.println("NIVEL 1");
        System.out.println("Los problemas empiezan cuando deben realizar un salto hiperespacial");
        System.out.println("hasta al sistema S1 en el sector S2, pero el sistema de navegación está");
        System.out.println("estropeado y el computador tiene problemas para calcular parte de las");
        System.out.println("coordenadas de salto.");
        System.out.println("Chewbacca, piloto experto, se da cuenta que falta el cuarto número de");
        System.out.println("la serie.");
        System.out.println("Recuerda de sus tiempos en la academia de pilotos que para calcularlo");
        System.out.println("hay que calcular el sumatorio entre el nº del sistema y el nº del sector");
        System.out.println("(ambos inclusive).");

        //Nos muestra las variables de sistemas1 y sectors2 generadas aleatoriamente
        System.out.println("Variables S1: " + sistemas1);
        System.out.println("Variables S2: " + sectors2);

        //Nos solicita la respuesta y la compara con la real
        int larespuestadelUsuario = solicitarRespuestaUsuario(scanner);

        return larespuestadelUsuario == calcularelSumatoriodelosnumeros(sistemas1, sectors2);
    }

    //Esto es para que podamos jugar el nivel 2
    public static boolean jugarNivel2delepisodiodestarwars(Scanner scanner) {

        //Esto es para generar numeros aleatorios
        Random random = new Random();

        //Esto lo que hace es asignar esos numeros aleatorios para espaciopuertop1 y naveimperialp2
        int espaciopuertop1 = random.nextInt(7) + 1;
        int naveimperialp2 = random.nextInt(5) + 8;

        //Esto es para que se nos muestre el texto del nivel 2
        System.out.println("NIVEL 2");
        System.out.println("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo");
        System.out.println("lejos la estrella de la muerte. Como van en una nave imperial robada se");
        System.out.println("aproximan lentamente con la intención de pasar desapercibidos. De");
        System.out.println("repente suena el comunicador. “Aquí agente de espaciopuerto P1");
        System.out.println("contactando con nave imperial P2. No están destinados en este sector.");
        System.out.println("¿Qué hacen aquí?”. Han Solo coge el comunicador e improvisa.");
        System.out.println("“Eh... tenemos un fallo en el... eh... condensador de fluzo... Solicitamos");
        System.out.println("permiso para atracar y reparar la nave”. El agente, que no se anda con");
        System.out.println("tonterías, responde “Proporcione código de acceso o abriremos fuego”.");
        System.out.println("Han Solo ojea rápidamente el manual del piloto que estaba en la");
        System.out.println("guantera y da con la página correcta. El código es el productorio entre");
        System.out.println("el nº del agente y el nº de la nave (ambos inclusive).");

        //Nos muestra las variables de espaciopuertop1 y naveimperialp2 generadas aleatoriamente
        System.out.println("Variables P1: " + espaciopuertop1);
        System.out.println("Variables P2: " + naveimperialp2);

        //Nos solicita la respuesta y la compara con la real
        int larespuestadelUsuario = solicitarRespuestaUsuario(scanner);

        return larespuestadelUsuario == calcularProductorio(espaciopuertop1, naveimperialp2);
    }

    //Esto es para que podamos jugar el nivel 3
    public static boolean jugarNivel3delepisodiodestarwars(Scanner scanner) {

        //Esto es para generar numeros aleatorios
        Random random = new Random();

        //Esto lo que hace es asignar ese numero aleatorio para N con el que luego calcularemos el factorial.
        int n = random.nextInt(51) + 50;

        //Esto es para que se nos muestre el texto del nivel 3
        System.out.println("NIVEL 3");
        System.out.println("Han Solo proporciona el código correcto. Atracan en la estrella de la");
        System.out.println("muerte, se equipan con trajes de soldados imperiales que encuentran");
        System.out.println("en la nave para pasar desapercibidos y bajan. Ahora deben averiguar");
        System.out.println("en qué nivel de los N existentes se encuentra el reactor principal. Se");
        System.out.println("dirigen al primer panel computerizado que encuentran y la Princesa");
        System.out.println("Leia intenta acceder a los planos de la nave pero necesita introducir");
        System.out.println("una clave de acceso. Entonces recuerda la información que le");
        System.out.println("proporcionó Lando Calrissian “La clave de acceso a los planos de la");
        System.out.println("nave es el factorial de N/10 (redondeando N hacia abajo), donde N es");
        System.out.println("el nº de niveles”.");

        //Nos muestra la variable de N generada aleatoriamente
        System.out.println("Variables N: " + n);

        //Nos solicita la respuesta y la compara con la real
        int larespuestadelUsuario = solicitarRespuestaUsuario(scanner);

        return larespuestadelUsuario == calcularlosFactorialescorrespondientes(n / 10);
    }

    //Esto es para que podamos jugar el nivel 4
    public static boolean jugarNivel4delepisodiodestarwars(Scanner scanner) {

        //Esto es para general numeros aleatorios
        Random random = new Random();

        //Esto lo que hace es asignar ese numero aleatorio para primo para luego calcular si el numero es primo o no.
        int primo = random.nextInt(91) + 10;

        //Esto es para que se nos muestre el texto del nivel 4
        System.out.println("NIVEL 4");
        System.out.println("Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran la");
        System.out.println("puerta acorazada que da al reactor principal. R2D2 se conecta al panel");
        System.out.println("de acceso para intentar hackear el sistema y abrir la puerta. Para");
        System.out.println("desencriptar la clave necesita verificar si el número P es primo o no. Si");
        System.out.println("es primo introduce un 1, si no lo es introduce un 0.");

        //Nos muestra la variable de "primo" generada aleatoriamente
        System.out.println("Variables P: " + primo);

        //Nos solicita la respuesta y la compara con la real
        int larespuestadelUsuario = solicitarRespuestaUsuario(scanner);

        return larespuestadelUsuario == (ElnumeroesPrimo(primo) ? 1 : 0);
    }

    //Esto es para que podamos jugar el nivel 5
    public static boolean jugarNivel5delepisodiodestarwars(Scanner scanner) {

        //Esto es para generar numeros aleatorios
        Random random = new Random();

        //Esto lo que hace es asignar esos numeros aleatorios para minutos y segundos
        int minutos = random.nextInt(6) + 5;
        int segundos = random.nextInt(6) + 5;

        //Esto es para que se nos muestre el texto del nivel 5
        System.out.println("NIVEL 5");
        System.out.println("Consiguen entrar al reactor. Ya solo queda que Luke Skywalker coloque");
        System.out.println("la bomba, programe el temporizador y salir de allí corriendo. Necesita");
        System.out.println("programarlo para que explote en exactamente M minutos y S segundos,");
        System.out.println("el tiempo suficiente para escapar antes de que explote pero sin que el");
        System.out.println("sistema de seguridad anti-explosivos detecte y");
        System.out.println("desactive la bomba. Pero el temporizador utiliza un reloj Zordgiano un");
        System.out.println("tanto peculiar. Para convertir los minutos y segundos al sistema");
        System.out.println("Zordgiano hay que sumar el factorial de M y el factorial de S. ¿Qué");
        System.out.println("valor debe introducir?");

        //Nos muestra las variables de minutos y segundos generadas aleatoriamente
        System.out.println("Variables M: " + minutos);
        System.out.println("Variables S: " + segundos);

        //Nos solicita la respuesta y la compara con la real
        int larespuestadelUsuario = solicitarRespuestaUsuario(scanner);

        return larespuestadelUsuario == calcularlaSumadelosnumerosFactoriales(minutos, segundos);
    }

    // Esto sirve para solicitarnos la respuesta. Nos pide a nosotros que pongamos la respuesta y la devuelva como numero entero.
    public static int solicitarRespuestaUsuario(Scanner scanner) {
        System.out.print("Tu respuesta: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, introduce un número entero.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    //Acá es donde se hacen los respectivos metodos matemáticos para los diferentes niveles. Sino no valdría de nada el programa v:
    public static int calcularelSumatoriodelosnumeros(int sistemas1, int sectors2) {
        int sumatorio = 0;
        for (int i = sistemas1; i <= sectors2; i++) {
            sumatorio += i;
        }
        return sumatorio;
    }

    public static int calcularProductorio(int espaciopuertop1, int naveimperialp2) {
        int productorio = 1;
        for (int i = espaciopuertop1; i <= naveimperialp2; i++) {
            productorio *= i;
        }
        return productorio;
    }

    public static int calcularlosFactorialescorrespondientes(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static boolean ElnumeroesPrimo(int primo) {
        boolean ElnumeroesPrimo = true;

        if (primo <= 1) {
            ElnumeroesPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(primo); i++) {
                if (primo % i == 0) {
                    ElnumeroesPrimo = false;
                    break;
                }
            }
        }

        return ElnumeroesPrimo;
    }

    public static int calcularlaSumadelosnumerosFactoriales(int minutos, int segundos) {
        return calcularlosFactorialescorrespondientes(minutos) + calcularlosFactorialescorrespondientes(segundos);
    }

    //Esto lo que hace es mostrar este mensaje en el caso de que pierdas en cualquier nivel.
    public static void HayquemostrarestodeaquísiPierdes() {
        System.out.println("Ese no era el código correcto... La misión ha sido un fracaso... :( :( :(");
    }

    //Esto lo que hace es mostrar el mensaje de cuando ganas el juego.
    public static void HayquemostrarestodeaquísiGanas() {
        System.out.println("¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas!");
        System.out.println("Enhorabuena ;D");
    }

}