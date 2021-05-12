
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ServidorUDP {

    public static void main(String[] args) {
        System.out.println("--------------------SERVIDOR--------------------");
        try {
            DatagramSocket socketUDP = new DatagramSocket(6543);
            byte[] buffer = new byte[10000];

            while (true) {
                DatagramPacket peticion = new DatagramPacket(buffer, buffer.length);
                socketUDP.receive(peticion);

                System.out.println("Datos: " + new String(peticion.getData()));
            }

        } catch (Exception e) {
        }
    }
}
