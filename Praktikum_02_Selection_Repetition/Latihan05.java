import java.util.Scanner;

public class Latihan05 {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int x = input.nextInt();
		System.out.println("  ");
		int i = 1;
		int j, k, l;
		while (i <= x) {
			j = i;
			while (j <= x) {
				System.out.print("*");
				j++;
			}
			k = 1;
			while (k <= i*2-2) {
				System.out.print(" ");
				k++;
			}
			l = i;
			while (l <= x) {
				System.out.print("*");
				l++;
			}
			System.out.println();
			i++;
		}
		
		i = 1;
		while (i <= x)
        {
			j = 1;
            while (j <= i)
            {
                System.out.print("*");
                j++;
            }
            k = i*2-2;
            while (k < x*2-2)
            {
                System.out.print(" ");
                k++;
            }
            l = 1;
            while (l <= i)
            {
                System.out.print("*");
                l++;
            }
            System.out.println();
            i++;
            
            input.close();
        }
	}
}	
