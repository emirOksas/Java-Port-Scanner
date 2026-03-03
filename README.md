# Java Port Scanner

Bu proje, belirtilen bir IP adresi veya alan adı üzerindeki açık ağ bağlantı noktalarını (portları) tespit etmek için Java ile geliştirilmiş basit bir Port Tarayıcı (Port Scanner) uygulamasıdır. Ağ güvenliği ve TCP/IP soket bağlantılarının temel prensiplerini anlamak amacıyla oluşturulmuştur.

## Özellikler
* Kullanıcıdan hedef IP adresi ve taranacak port aralığını dinamik olarak alır.
* `java.net.Socket` kütüphanesi kullanılarak TCP bağlantı (handshake) denemeleri gerçekleştirir.
* Belirlenen zaman aşımı (timeout) süresi ile hızlı ve verimli bir tarama yapar.
* Sadece dinlenen (açık) portları konsola yazdırarak temiz bir çıktı sunar.

## Nasıl Çalıştırılır?

1. Kodu derleyin:
   `javac PortScanner.java`
2. Programı başlatın:
   `java PortScanner`
3. Konsol ekranında istenen hedef IP/Domain (örn: 127.0.0.1) ve port aralıklarını girin.
