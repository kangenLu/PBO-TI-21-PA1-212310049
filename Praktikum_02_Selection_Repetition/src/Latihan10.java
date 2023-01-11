import java.util.Scanner;  
    
public class Latihan10 
{  
      
    public static void main(String args[] )  
    {  
 
        int saldo = 99999999, tarik, setor;  
        int pin = 250402;
        int inpin;
          
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan PIN :");
        inpin = input.nextInt();
          
        while(inpin == pin)
        {  
        
            System.out.println("ATM");  
            System.out.println("1 Tarik Tunai");  
            System.out.println("2 Setor Tunai");  
            System.out.println("3 Lihat Saldo");  
            System.out.println("4 keluar");  
            System.out.print("Pilih Menu :");  
              
           
            int choice = input.nextInt();  
            switch(choice)  
            {  
                case 1:  
        System.out.print("Masukan uang ingin di tarik:");  
                      
        
        tarik = input.nextInt();  
        if(saldo >= tarik)  
        {  
            saldo = saldo - tarik;  
            System.out.println("Silahkan ambil uangnya");  
        }  
        else  
        {  
            System.out.println("saldo tidak mencukupi");  
        }  
        System.out.println("");  
        break;  
   
                case 2:  
                      
        System.out.print("masukan uang yang ingin di setor:");  
                      
        setor = input.nextInt();  
                      
        saldo = saldo + setor;  
        System.out.println("uang berhasil di setor");  
        System.out.println("");  
        break;  
   
        case 3:  
        System.out.println("saldo : "+saldo);  
        System.out.println("");  
        break;  
   
        case 4:  
        System.exit(0);  
        
            }  
        }  
        input.close();
    }  
}