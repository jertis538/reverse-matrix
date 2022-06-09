public class PoZhope {
    public static void main(String[] args) {
        int num = 1;
        int a = 15;
        int arr1[][] = new int[a][a];
        int arr2[][] = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                arr1[i][j] = num;
                num++;
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        int num1 = 1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                for (int k = 0; k < a; k++) {
                    for (int n = 0; n < a; n++) {
                        if (n >= k) {
                            arr2[k][n] = arr1[n][k];
                        }
                        else arr2[k][n] = arr1[n][k];
                    }
                }
                arr1[i][j] = num1;
                num1++;

            }
        }
        System.out.println( );
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
