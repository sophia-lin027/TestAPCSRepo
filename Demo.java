public class Demo {
  public static void main(String[] args){

    if (args.length == 0){
      printLoop(5);
    }
    else {
      int a = Integer.valueOf(args[0]);
      printLoop(a);
    }
  }

  public static void printLoop (int n){
    for (int i = 1; i <= n; i++){
      for(int j = n; j >= i; j--){
        System.out.print(i);
      }
      System.out.println();
    }
  }
}
