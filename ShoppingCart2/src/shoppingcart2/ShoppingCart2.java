package shoppingCart2;
 
/*
auther : Abdullah Shublaq
*/

import java.util.Scanner;
import java.util.ArrayList;

public class ShoppingCart2 {
  static ArrayList<Product> cart=new ArrayList< Product >();
  static double total=0;
  static double finalTotal=0;
  static Scanner in=new Scanner(System.in);
  
  public static void view(Product []p, /*ItemOrder []o,*/ String type){
    boolean loop3=true;
    while(loop3){
      System.out.println("\n====================");  
      System.out.println("\n"+type+" :");
      for(int i=0; i<p.length; i++){
        System.out.println((i+1)+". "+p[i].toString());
        }
        System.out.print("\t1. Buy.\n\t2. Show Details.\n\t3. Back.\n\tChoice :");
        int choice3=in.nextInt();
        switch(choice3){
          case 1:
            System.out.print("\t\tenter number of item :");
            int num=in.nextInt();
            if((num-1)>=p.length || (num-1)<0){
              System.out.println("\n invalid itemÂ¿ \n");
              break;
              }
            System.out.print("\t\tenter quantity :");
            int qua=in.nextInt();
            if(qua>p[num-1].getBulkQuantity() || qua<=0){
              System.out.println("\n invalid quantityÂ¿ \n");
              break;                      
              }
            Add(p,/*o,*/num,qua);
            System.out.println("\n Add completeÂ¡ \n");                    
            break;
          case 2:
            System.out.print("\t\tenter number of item :");
            int num2=in.nextInt();
            if((num2-1)>p.length || (num2-1)<0){
              System.out.println("\n invalid itemÂ¿ \n");
              break;
              }
            boolean loop4=true;
            while(loop4){
              System.out.println("\n--------------------");
              System.out.println("\n"+p[num2 - 1].details());  
              System.out.print("\t\t1. Buy.\n\t\t2. Back.\n\t\tChoice :");
              int choice4=in.nextInt();
              switch(choice4){
                case 1:
                  System.out.print("\t\t\tenter quantity :");
                  int qua2=in.nextInt();
                  if(qua2>p[num2-1].getBulkQuantity() || qua2<=0){
                    System.out.println("\n invalid quantityÂ¿ \n");
                    break;                      
                    }
                  Add(p,/*o,*/num2,qua2);
                  System.out.println("\n Add completeÂ¡ \n");
                  loop4=false;
                  break;
                case 2:
                  loop4=false;
                  break;
                default :
                  System.out.println("\n invailed codeÂ¿ \n");
              }
            }
            break;
          case 3:
            loop3=false;
            break;  
          default :
            System.out.println("\n invailed codeÂ¿ \n");     
        }
     }
  }
  
    
  public static void Add(Product[] p,/*ItemOrder [] o,*/ int num,int qua){
    boolean found=false;
    for(int i=0; i<cart.size(); i++){
      if(cart.get(i).getId()==p[num-1].getId()){
        //total = o[num - 1].getPrice();
        //finalTotal-=total;
        /*o*/p[num - 1].setQuantity(qua);                                                                            
        p[num - 1].decreaseBulkQuantity(qua);                                      
        total = /*o*/p[num - 1].getPrice(qua);
        finalTotal+=total;
        found=true;
        break;                      
          }
        }
        if(!found){
          /*o*/p[num - 1].setQuantity(qua);                                                                            
          p[num - 1].decreaseBulkQuantity(qua);                                      
          cart.add(/*o*/p[num - 1]);
          total = /*o*/p[num - 1].getPrice();
          finalTotal+=total;
          }                                
   }
  
  
  public static void main(String[] args) {
            
    TV tv_1=new TV(11,127,10,"LG",24);/*id,p,q,m,z*/
    TV tv_2=new TV(12,468,10,"Samsung",43);
    MP3Player mp3_1=new MP3Player(21,56,15,"Zero fire","Black");/*id,p,q,m,c*/
    MP3Player mp3_2=new MP3Player(22,29,15,"SanDisk","Black");
    Electronics []elc={tv_1,tv_2,mp3_1,mp3_2};
    /*ItemOrder eo_1=new ItemOrder(elc[0]);
    ItemOrder eo_2=new ItemOrder(elc[1]);
    ItemOrder eo_3=new ItemOrder(elc[2]);
    ItemOrder eo_4=new ItemOrder(elc[3]);
    ItemOrder []elcOr={eo_1,eo_2,eo_3,eo_4};*/
    
    Cartoon cr_1=new Cartoon(31,11,35,"Marvel",1987,"Spiper man");/*id,p,q,pr,yp,cn*/
    Cartoon cr_2=new Cartoon(32,11,35,"DC",1988,"Batman");
    Manga m_1=new Manga(41,12,40,"Tokyo ghoul:re","Ishida sui",2014,13);/*id,p,q,n,pr,yp,a*/
    Manga m_2=new Manga(42,10,40,"Bleach","Kobu tite",2001,13);
    Book []book={cr_1,cr_2,m_1,m_2};
    /*ItemOrder bo_1=new ItemOrder(book[0]);
    ItemOrder bo_2=new ItemOrder(book[1]);
    ItemOrder bo_3=new ItemOrder(book[2]);
    ItemOrder bo_4=new ItemOrder(book[3]);
    ItemOrder []bookOr={bo_1,bo_2,bo_3,bo_4};*/
     
    System.out.println("=Hello=.\n");            
    boolean loop1=true;
    while(loop1){
      System.out.print("~~~~~~~~~~~~~~~~~~~~");
      System.out.print("\n1. Show the products.\n2. Check out the shopping cart.\n3. Exit.\n\tChoice :");
      int choice1=in.nextInt();
      switch(choice1){
        case 1:
          boolean loop2=true;
          while(loop2){
            System.out.println("____________________");
            System.out.print("\n1. Electronics.\n2. Books.\n3. Back.\n\tChoice the type :");
            int choice2=in.nextInt();
            switch(choice2){
              case 1:
                view(elc,/*elcOr,*/"Electronics");                                                  
                break;
              case 2:
                view(book,/*bookOr,*/"Book");                
                break;
              case 3:
                loop2=false;
                break;
              default :
                System.out.println("\n invailed codeÂ¿ \n");      
            }          
          }
          break;          
        case 2:                        
          boolean loop5=true;
          while(loop5){
            System.out.println("\n::::::::::::::::::::");
            if(cart.isEmpty()){
              System.out.println("\n there is no thing in the cartÂ¿ \n");
              break;
            }      
            System.out.println();
            for(int i=0; i<cart.size(); i++){              
              System.out.println((i+1)+". "+cart.get(i).ShowCart()+"\n");            
            }
            System.out.println("#. price total is :"+finalTotal+"$\n");          
            System.out.print("\t\t1. Remove.\n\t\t2. Finish.\n\t\tChoice :");
            int choice5=in.nextInt();
            switch(choice5){
 /*remove*/   case 1:                
                System.out.print("\t\t\tenter the number of item :");
                int num3=in.nextInt();
                if(num3>cart.size() || num3<=0){
                  System.out.println("\n invalid itemÂ¿ \n");
                  break;  
                }
                System.out.print("\t\t\tenter the quantity :");
                int qua3=in.nextInt();
                if(qua3>cart.get(num3-1).getQuantity() || qua3<=0){
                  System.out.println("\n invalid quantityÂ¿ \n");
                  break;
                }                
                cart.get(num3-1).increaseBulkQuantity(qua3);
                cart.get(num3-1).decreaseQuantity(qua3);
                total=cart.get(num3-1).getPrice(qua3);
                finalTotal-=total;
                if(cart.get(num3-1).getQuantity()==0){
                  cart.remove((num3-1));
                }
                System.out.println("\n remove completeÂ¡ \n");
                break;
              case 2:                
                loop5=false;
                break;
              default :
                System.out.println("\n invailed codeÂ¿ \n");
            }
          }
          break;
        case 3:
          System.out.println("\n ~Good byeÂ¡~ ");
          loop1=false;
          break;
        default :
          System.out.println("\n invalid codeÂ¿ \n");      
      }
    }
  }
}
