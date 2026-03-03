import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class PortScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Java Ağ Port Tarayıcı (Port Scanner) ---");
        
        System.out.print("Taranacak Hedef IP veya Domain (Örn: 127.0.0.1): ");
        String targetIp = scanner.nextLine();

        System.out.print("Başlangıç Portu (Örn: 1): ");
        int startPort = scanner.nextInt();

        System.out.print("Bitiş Portu (Örn: 1024): ");
        int endPort = scanner.nextInt();

        System.out.println("\n[Bilgi] " + targetIp + " adresi için " + startPort + " ile " + endPort + " arasındaki portlar taranıyor...");
        System.out.println("Sadece açık olan portlar listelenecektir. Lütfen bekleyin...\n");

        for (int port = startPort; port <= endPort; port++) {
            try {
                Socket socket = new Socket();
                // 200 milisaniye zaman aşımı (timeout) ile bağlantı dener
                socket.connect(new InetSocketAddress(targetIp, port), 200);
                System.out.println("[AÇIK] Port " + port + " erişilebilir durumda.");
                socket.close();
            } catch (Exception e) {
                // Port kapalıysa veya zaman aşımına uğrarsa program çökmesin diye hatayı yutuyoruz
            }
        }
        
        System.out.println("\nTarama tamamlandı!");
        scanner.close();
    }
}
