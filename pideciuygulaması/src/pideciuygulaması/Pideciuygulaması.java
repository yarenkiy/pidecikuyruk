package pideciuygulaması;

import java.util.Scanner;


public class Pideciuygulaması {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int secim= -1;
        int n ;
        System.out.println("kuyruk yapısının eleman sayısı : ") ;
        n=sc.nextInt();
        
        Queuepide kuyruk = new Queuepide(n);
        
         while(secim!=0){
            System.out.println("1- yeni musteri ekle");
            System.out.println("2- satış yap");
            System.out.println("3- bekleyen musteriler");
            System.out.println("4- toplam gelir");
            System.out.println("0- cıkıs");
            secim = sc.nextInt();
            
            switch(secim){
                case 1: kuyruk.enQueue(); break;
                case 2: kuyruk.deQueue(); break;
                case 3: kuyruk.print(); break;
                case 4: System.out.println("toplamgelir: "+kuyruk.toplamgelir);
                case 0: System.out.println("cıkıs yaptınız");break;
                default :System.out.println("hatalı işlem");
            }
        }
    }
    
}
