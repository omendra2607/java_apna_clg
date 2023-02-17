public class patternLoops {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        //solid rectangle
        /*for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/


        //hollow rectangle
        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= m; j++) {
                //cell--> (i,j)
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //HalfPyramid
        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        //inverted half pyramid
        //outerloop
        for (int i = 1; i <= n; i++) {
            //innerloop-->space print
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //innerloop-->star print
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //half pyramid with numbers
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //inverted half pyramid with numbers
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //floyd triangle
        int number=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number);
                number++;//number=number+1
            }
            System.out.println();
        }

        //101 pattern

        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1");//even
                } else {
                    System.out.print("0");//odd
                }
            }
                System.out.println();
            }
        
        }

    }




