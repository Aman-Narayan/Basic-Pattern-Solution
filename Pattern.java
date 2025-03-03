/*

*
**
***
****

public class pattern{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

****
***
**
*
public class pattern{
    public static void main(String[] args) {
        int n=4;
        for (int i = 0; i <= n; i++) {
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

1
12
123
1234

public class pattern{
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.err.println();
        }
    }
}

A
BC
DFE
GHIJ

public class pattern{
    public static void main(String[] args) {
        int n=4;
        char ch= 'A';
        for (int i = 1; i <=n; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}

****
*  *
*  *
****
public class pattern{
    public static void main(String[] args) {
        int n=4;
        for (int i = 1; i <=n; i++) {
            for(int j=1;j<=n;j++){
                if (i==1 || i==n || j==1 || j==n) {
                 System.out.print("*");   
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

   *
  **
 ***
****
public class pattern{
    public static void main(String[] args) {
        int n=4;

        for (int i = 1; i <=n; i++) {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

12345
1234
123
12
1

public class pattern{
    public static void main(String[] args) {
        int n=5;

        for (int i = 1; i <=n; i++) {
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

1
23
456
78910
public class pattern{
    public static void main(String[] args) {
        int n=5;
        int num =1;
        for (int i = 1; i <=n; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}

1
01
101
0101

public class pattern{
    public static void main(String[] args) {
        int n=5;
        
        for (int i = 1; i <=n; i++) {
            for(int j=1;j<=i;j++){
                int sum = i+j;
                if(sum % 2 ==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

public class pattern{
    public static void main(String[] args) {
        int n=5;

        for (int i = 1; i <n; i++) {
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
         for (int i = 1; i <=n; i++) {
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

   ****
  ****
 ****
****
public class pattern{
    public static void main(String[] args) {
        int n=5;
        
        for (int i = 1; i <=n; i++) {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class pattern{
    public static void main(String[] args) {
        int n=5;
        
        for (int i = 1; i <=n; i++) {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
*/

// *****
// *   *
// *   *
// *****

public class pattern{
    public static void hollowsquare(int totrow,int totcol){
        for (int i = 1; i <= totrow; i++) {
            for(int j=1; j<= totcol; j++){
                if(i==1 || i==totrow || j==1 || j==totcol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //   *
    //  **
    // *** 
    //**** 
    public static void inverted_rotated_half_pyramid(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
            }
        }

       // 1234
       // 123
       // 12
       // 1

    public static void inverted_half_pyramid_withNo(int n){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n-i+1; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
    }
    
// 1
// 2 3
// 4 5 6
// 7 8 9 10

    public static void floyds_triangle(int n){
        int count =1;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(count+" ");
                    count++;
                }
                System.out.println();
            }
    }
// 1
// 01
// 101
// 0101
    public static void zero_one_triangle(int n){
        for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    if( (i+j) % 2 == 0){
                        System.out.print("1");
                    }
                    else{
                        System.out.print("0");
                    }
                }
                System.out.println();
            }
    }

// *     *
// **   **
// *** ***
// *******
// *******
// *** ***
// **   **
// *     *
    public static void Butterfly_pattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    **** 
//   **** 
//  ****
// ****
    public static void rhombus(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if(i==1||j==1||j==n||i==n){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

//   *  
//  ***
// *****
//  ***
//   * 

    public static void diamond_pattern(int n){
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // hollowsquare(4, 5);
        // inverted_rotated_half_pyramid(5);
        // inverted_half_pyramid_withNo(5);
        // floyds_triangle(5);
        // zero_one_triangle(5);
        // Butterfly_pattern(5);
        // rhombus(5);
        // hollow_rhombus(5);
        diamond_pattern(5);
    }
}
