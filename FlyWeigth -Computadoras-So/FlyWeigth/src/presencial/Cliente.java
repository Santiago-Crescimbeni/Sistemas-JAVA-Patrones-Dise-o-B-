package presencial;

public class Cliente {
    public static void main(String[] args) {
        ComputadoraFactory fabrica= new ComputadoraFactory();
        Computadora pc1=fabrica.getComputadora(16,500);
        Computadora pc2=fabrica.getComputadora(8,500);
        Computadora pc3=fabrica.getComputadora(16,500);
        Computadora pc4=fabrica.getComputadora(8,500);
        Computadora pc5=fabrica.getComputadora(16,500);
        Computadora pc6=fabrica.getComputadora(8,500);

        System.out.println(pc1);
        System.out.println(pc2);
        System.out.println(pc3);
        System.out.println(pc4);

        System.out.println("Objetos reales: "+Computadora.getContador());
    }
}
