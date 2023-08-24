public class FaboReiheGit {
    public static void main(String[] args) {

    }
    public static int fibonacci(int n)
    {
        //da habe ich die Recursion Function benutzt, in diesem Fall soll eine Bedingung zuerst stehen,um das Programm in einem Punkt zu stoppen.
        //und soll wieder die Hauptmethode aufgerufen werden, aber diesmal für den vorherigen index.
      if(n==0||n==1){
          return n;
      } else {
          return fibonacci(n-1) + fibonacci(n-2) ;
      }

    }

     // weitere Art und Weise zu dieser Fibonacci Methode
     /* if(n == 0) return 0;
        if(n == 1) return 1;

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++)
        {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b;
        */
}
