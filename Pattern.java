public class Pattern {
    public static void main(String[] args) {
        int num = 4;
        // left_pyramid(num);
        // square(num);
        // triangle(num);
        // left_triangle(num);
        // upside_down_triangle(num);
        // left_traingle_counter(num);
        // full_triangle(6);
        // rhombus(num);
        diamond(num);
        // star(num);
        // half_butter_fly(num);
        // butter_fly(num);
    }

    static void left_pyramid(int n) {
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void square(int n) {
        for(int i = 0; i<=n; i++) {
            for(int j = 0; j<=n; j++) {
                if(i == 0 || j == 0 || i ==  n || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
             }
             System.out.println();
        }
    }

    static void triangle(int n) {
        for(int i = 1; i<=n; i++) {
            int temp = n - i;
            for(int j = 1; j <= temp; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j<=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void left_triangle(int n) {
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void upside_down_triangle(int n) {
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<= n -i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void left_traingle_counter(int n) {
        int c = 1;
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(c++);
            }
            System.out.println();
        }
    }

    static void full_triangle(int n) {
        for(int i = 1; i<= n; i++) {
            for(int j = 1; j<= 2*(n -i); j++) {
                System.out.print(" ");
            }
            for(int j = i; 0<j; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
    static void rhombus(int n) {
        for(int i = 0;i<=n; i++) {
            for(int j = 0; j< n-i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j<=n; j++) {
                System.out.print("*");
            }  
            System.out.println();
        }
    }

    static void diamond(int n) {
        for(int i = 1; i<=n;i++) {
            for(int j = 1; j<= n-i; j++) {
                System.out.print( " ");
            }
            for(int j = 1; j<=2* i -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n-1; i>=1; i--) {
            for(int j = 1; j<= n-i;j++) {
                System.out.print( " ");
            }
            for(int j = 1; j<=2* i -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void star(int n) {
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void half_butter_fly(int n) {
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            for(int j =0; j<= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void butter_fly(int n) {
        for(int i = 1; i<=n; i++) {
            for(int j = 1;j<=i; j++) {
                System.out.print("*");
            }
            for(int j = 1; j<= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for(int j = 1;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i>=1; i--) {
            for(int j = 1;j<=i; j++) {
                System.out.print("*");
            }
            for(int j = 1; j<= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for(int j = 1;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
