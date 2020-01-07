public class Number {
  public static void main(String[] args) {
    System.out.println("Hello World");

    for (int i = 2; i <= 100; i++) {
      boolean isPrima = true;

      for (int j = 2; j < i; j++) {
          if(i%j==0){
              isPrima = false;
              break;
          }
      }

      if(isPrima==true){
        System.out.println(i);
      }
    }
  }
}

