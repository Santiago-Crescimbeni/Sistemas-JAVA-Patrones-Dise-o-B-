# Sistemas-JAVA-Patrones-Dise-o-B-



Este repositorio es un proyecto adonde encontraras  implementado varios patrones de diseño, incluyendo Flyweight, Facade, Template Method, Proxy y Chain of Responsibility. Estos patrones de diseño son ampliamente utilizados en la industria para resolver problemas comunes en el diseño de software y mejorar la escalabilidad y mantenibilidad del código.

En particular, el patrón Flyweight se utiliza para minimizar el uso de memoria al compartir objetos que son similares entre si.

El patrón Facade simplifica la complejidad de un sistema al proporcionar una interfaz unificada y fácil de usar para acceder a las funcionalidades de un conjunto de clases. 

El patrón Template Method define un esqueleto de un algoritmo en una clase base y permite que las subclases modifiquen ciertos pasos del algoritmo sin cambiar su estructura general.

El patrón Proxy se utiliza para proporcionar un objeto que actúa como sustituto de otro objeto y controla el acceso a ese objeto. 

El patrón Chain of Responsibility se utiliza para encadenar objetos receptores y permitir que un objeto envíe una solicitud a través de la cadena hasta que un objeto receptor adecuado la maneje.

Este proyecto demuestra la aplicación práctica de estos patrones de diseño y proporciona un ejemplo concreto de cómo pueden utilizarse para mejorar la calidad del código y la eficiencia del sistema.

OBJETIVOS GUIA DE IMPLEMENTACION DE PATRONES:

Patrón Template Method:

Desafío I
Una empresa de ventas digitales nos pide modificar el modelado de su sistema.
Actualmente el sistema permite clasificar a los vendedores con base en el cumplimiento
de ciertos requisitos.
Se consideran los siguientes aspectos;
- Tanto empleados como afiliados son vendedores.
- Todo vendedor devuelve una categoría (mostrarCategoria) según la cantidad de
puntos alcanzados.
- El objetivo de los empleados es conseguir afiliados (conseguirAfiliado) y hacer
ventas (vender). Cada uno consigue 10 puntos por cada nuevo afiliado, 5 puntos
por cada venta que realice y 5 puntos por cada año de antigüedad que posea.
- El objetivo de los afiliados es hacer ventas (vender), pero el cálculo de los puntos
es diferente: consiguen 15 puntos por cada nueva venta.
Los vendedores se categorizan de la siguiente manera:
Menos de 20 puntos = novatos.
Entre 20 y 30 puntos = aprendices.
Entre 31 y 40 puntos = buenos.
Más de 40 puntos = maestros.
Se deberá implementar un método mostrarCatetogia que primero deberá
calcularPuntos, luego recategorizar de acuerdo al puntaje obtenido en el método

anterior y por último mostrar por consola el nombre del vendedor el total de puntos y la
categoría.
Realizar los casos de prueba necesarios para garantizar la calidad del método
mostrarCategoría()
Si llegaste hasta acá, ¡felicitaciones!. Si aún te queda tiempo, te proponemos el siguiente
desafío para seguir practicando.

Desafío II
Se nos solicita crear un tercer tipo de vendedor llamado pasante. El objetivo de los
pasantes es hacer ventas, por cada una recibirán 5 puntos. Los pasantes
categorizan de la siguiente manera:
Menos de 50 puntos = pasante novato.
50 puntos o más = pasante experimentado.
Ejemplo de salida:
“Juan tiene un total de 22 puntos, categoriza como aprendiz”.
“Pedro tiene un total de 9 puntos, categoriza como novato”.


cadena de responsabilidad:
En la empresa llamada Colmena hay tres departamentos: gerencia, comercial y técnico.
Cuando reciben un correo electrónico (en su dominio colmena.com) quieren que se
controle de acuerdo con las reglas de inteligencia artificial de la empresa y enviarlo al
departamento que corresponda.
Nosotros vamos a simular este control suponiendo que:
Si se cumpe alguno de los criterios siguientes Se debe enviar a
Tema (subject) Mail de destino Departamento
Gerencia gerencia@colmena.com Gerencial
Comercial comercial@colmena.com Comercial
Técnico tecnica@colmena.com Técnico
Cualquier otro cualquier otro Marcado como SPAM

Para ello vamos a mostrar por pantalla dónde se recibe el pedido en cada caso. El correo
electrónico pertenece a una clase mail que tiene tres datos tipo string: el origen, el
destino y el tema (o subject).
Se desea hacer una clase CompruebaMail que cree una cadena de responsabilidades.
Esta funcionará chequeando cada elemento (parte de la cadena). Si el mail es para
Gerencia, lo informará. Si no, continúa con el siguiente chequeo que prueba si es para
Técnica, y así continuará hasta saber a quién le corresponde. Si no es de nadie, se
marcará como spam.
Por último, desde una clase ProcesaMail, se crea un mail y se le pide a CompruebaMail
que lo procese e informe donde debe ir.
Realizar los casos de prueba necesarios para garantizar la calidad del método
comprobarMail() de la clase CompruebaMail.



PATRON PROXY:

En un centro de vacunación las personas inscriptas y con turno —además de
conocer su nombre, apellido y DNI— tienen asignada una fecha de vacunación y la
vacuna que se les aplicará. Estas pueden concurrir un día posterior a la a fecha
asignada, por lo cual cuando se vacuna es necesario informar, mediante el método
vacunar(), que esta ya fue aplicada. En el momento de la vacunación, se debe
registrar la confirmación con el DNI, fecha y vacuna. Para evitar que la información
sea inconsistente se debe controlar que la fecha sea igual o posterior a la fecha
asignada. Se debe utilizar un proxy para efectuar este control.
Para simplificar el ejercicio, si el registro es correcto se emite un mensaje con la
información registrada.
Crear los casos de prueba requeridos para garantizar la calidad del método
vacunar(). 



PATRON FLYWEIGHT:


Un negocio necesita generar computadoras con distintas especificaciones, así como
también reutilizar las mismas especificaciones. Los tipos de computadoras que hay son :
● Windows
○ RAM: 2
○ Disco Duro: 128
● Mac
○ RAM: 16
○ Disco Duro: 500
Es necesario que la aplicación no genere altos costos en en los recursos: tiene que estar
optimizada. Las computadoras tendrán los siguiente atributos:
● Ram
● Disco Duro
● Id
● Contador(servirá para almacenar el número de instancias)

ComputadoraFactory va ser el contenedor de computadoras que almacenará los
diferentes tipos. Se necesitará aplicar si el la computadora existe obtenerla sino generarla.
Necesitamos que nos informe las computadoras creadas.



PATRON FACADE:

Cuando vamos a contratar un servicio de turismo como un vuelo o un hotel, tenemos que
solicitar cada uno por separado. Vamos a crear un sistema que permita realizar la
búsqueda de hotel y vuelo en un mismo pedido. Para esto será necesario interactuar con
dos sistemas.

Tenemos ya implementados los sistema de vuelo y hoteles que poseen la funcionalidad
de búsqueda según:
● Búsqueda vuelo: por fecha de salida, fecha de regreso, origen y destino.
● Búsqueda hotel: por fecha de entrada, fecha de salida, ciudad.
Se implementará una simple fachada que permita exponer un método que realice las
búsquedas, encargándose en interactuar con los sistemas de búsqueda y no tener que
lidiar con la complejidad de dichos sistemas desde el método main.
Se necesita visualizar por pantalla qué vuelos y hoteles están disponibles. Los parámetros
de búsqueda son solamente la ciudad del hotel (String), que es la misma que la del destino
del vuelo, y la fecha desde-donde, que es igual para la búsqueda de vuelo y hotel.
El pedido a la fachada por lo tanto en una sola llamada incluye los otros dos.
No olvidemos implementar los casos de prueba necesarios para poder garantizar la calidad
del código realizado.



