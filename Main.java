class Main {
  public static void main(String[] args) {
    
    int i = 1;
    int sum = 0;



    //복습 문제 #1 - 구구단 8단 1000 부터 1까지.
    int x = 8;
    i = 1000;

    while (i >= 1) {
      System.out.println( x + " x " + i + " = " + x * i );
      i--;
    }

    //복습 문제 #2 - 구구단 8단 1000 부터 -500까지

    i = 1000;
    while ( i >= -500){
      System.out.println( x + " x " + i + " = " + x * i );
      i--;
    }

    //복습 문제 #3 - 1부터 5까지의 합 출력

    i = 1;
    sum = 0;
    while ( i <= 5){
      sum += i;
      System.out.println( sum );
      i++;
    }
  }
}