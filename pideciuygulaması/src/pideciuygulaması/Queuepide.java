/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pideciuygulaması;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Queuepide {
    Scanner sc = new Scanner(System.in);
    Node front;// head
    Node rear; // tail
    int size ;
    int cnt; // kuyrugun dolu ya da bos oldugunu bununla kontrol ediyoruz.

    public Queuepide(int size) {
        this.size = size;
        cnt = 0;
        front =  null;
        rear = null;
        
    }
    int toplamgelir = 0 ;
    String isim;
    int adet;
    void enQueue(){
        if(isFull()){
            System.out.println("kuyruk sırası dolu");
        }
        else{
            System.out.println("müsteri ismi:");
            isim = sc.next();
            System.out.println("almak istediği pide sayısı: ");
            adet = sc.nextInt();
            Node eleman = new Node(isim,adet);
         
            if(isEmpty()){
                front = eleman;
                rear = eleman;
                System.out.println("kuyruk yapısı olusturuldu ve ilk musteri sıraya girdi.");
                
            }
        
        else{
                rear.next = eleman;
                rear = eleman;
                System.out.println(rear.isim + " sıraya girdi.");
                
                }
                    cnt++;
        }
        
    }
      void deQueue(){
          if(isEmpty()){
              System.out.println("pide sırasında bekleyen musteri yok .");
          }
          else{
              toplamgelir += front.ucret;
              System.out.println(front.isim +" "+front.adet+" adet pidesini aldi ,toplam borcu "+front.ucret);
              front = front.next ;
              cnt--;
              
          }
          
    }
      void print(){
          if(isEmpty()){
              System.out.println("bekleyen musteri yok.");
          }
          else{
              Node tmp = front;
              System.out.println("baş <- ");
              while(tmp!=null){
                  System.out.println(tmp.isim+" <-");
                  tmp = tmp.next;
              }
              System.out.println("son");
          }
      }
      boolean isEmpty(){
          return cnt == 0;
          
      }
      boolean isFull(){
          return cnt == size;
          
      }
}
