import java.util.Scanner;
    public class Sorting {

        public static void main(String[] args){
            System.out.println("Let's sort the numbers");
            System.out.println("How many numbers do you want?");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            int[] num = new int[n];

            for(int i=0;i<n;i++) {
                System.out.println("Enter the number at " + i);
                num[i] = input.nextInt();
                System.out.println();
            }

            System.out.println("Unsorted data is:");
            for (int i=0;i<n;i++) {
                System.out.print(num[i] + " ");
            }
            System.out.println("");
            //sorting the data
            for(int i=0;i<n-1;i++) {
                for(int j=i+1;j<n;j++) {
                    if(num[i]>num[j]) {
                        int temp = num[i];
                        num[i] = num[j];
                        num[j] = temp;
                    }
                }
            }

            System.out.println("Sorted data is:");
            for(int i=0;i<n;i++) {
                System.out.print(num[i] + " ");
            }
        }
    }
