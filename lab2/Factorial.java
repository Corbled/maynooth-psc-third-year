package PSC.lab2;

public class Factorial {
    public static void main(String args[]){
        int n = 2, m=5;
        getFactorialIterative(n,m);
    }

        public void getFacorialRecursive(int n, int m) {
            int fac = n;
            if(m == 0){
                System.out.println(fac);
            }
    }

        public static void getFactorialIterative(int n, int m){
            int fac = 1;

            for(int start = 1; start <= n ;start++){
                fac = fac*start;

            }
            System.out.println(fac);
            if(n<m){
                getFactorialIterative(n+1, m);
            }

        }
}
