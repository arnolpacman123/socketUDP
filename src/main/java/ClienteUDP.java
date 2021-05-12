
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClienteUDP {

    public static void main(String[] args) {
        System.out.println("--------------------CLIENTE--------------------");
        try {
            DatagramSocket socketUDP = new DatagramSocket();
            int puerto = 6543;
            InetAddress host = InetAddress.getByName("localhost");
            
            BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
            String texto;
            texto = sc.readLine();
            
            byte[] mensaje = texto.getBytes();
            DatagramPacket peticion = new DatagramPacket(mensaje, texto.length(), host, puerto);
            socketUDP.send(peticion);
        } catch (Exception e) {
            
        }
    }
}
