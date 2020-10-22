public class Demo {
  public static void main(String[] args){
    //if (args.length == 0){
    //  printLoop(5);
    //}
    //else {
    //  int a = Integer.valueOf(args[0]);
    //  printLoop(a);
    //}
  //}

    int[]array1 = {1,2,3};
    int[]array2 = {4,5,7,13};
    int[]array3 = {6,10,11,17,20};
    int[]array4 = {8,9,12,14,15,21};
    int[]array5 = {16,18,19,22,25,27,28};
    int[][]a = {array1, {}, array2, {} , array3, array4, array5};
    System.out.println(arrayDeepToString(a).replace("}, ", "}, \n "));
    System.out.println();
    System.out.println(arrayDeepToString(create2DArray(5,4,4)).replace("}, ","}, \n "));
    System.out.println();
    System.out.println(arrayDeepToString(create2DArrayRandomized(6,4,4)).replace("}, ","}, \n "));
  }
  
  public static void printLoop(int n){
    for (int i = 1; i <= n; i++){
      for(int j = n; j >= i; j--){
        System.out.print(i);
      }
      System.out.println();
  }
}

  public static String arrToString(int[]arr){
    String new_string = "{";

    for (int i = 0; i < arr.length; i++) {
      if (i == 0) {
        new_string = new_string + arr[i];
      }
      else {
        new_string = new_string + ", " + arr[i];
      }
    }
    new_string = new_string + "}";
    return new_string;
  }

  public static String arrayDeepToString(int[][]arr){
    String result = "";
    for (int i = 0; i < arr.length; i ++){
      result = result + "{";
      for (int j = 0; j < arr[i].length; j ++){
        result = result + arr[i][j];
        if (j != arr[i].length - 1){
          result = result + ",";
        }
      }
      if (i == arr.length - 1){
        result = result + "}";
      }
      else {
      result = result + "}, ";
    }
  }
    return "{" + result + "}";
  }

  public static int[][] create2DArray(int rows, int cols, int maxValue){
    int[][]arr  = new int[rows][cols];
    int value = 0;
    for (int i = 0; i < rows; i++){
      for (int j = 0; j < cols; j++){
        arr[i][j] = (int) (Math.random() * (maxValue + 1));
        value++;
        if (value == maxValue + 1){
          j = cols;
          value = 0;
        }
      }
    }
    return arr;
  }

 public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
   int[][]arr = new int[rows][];
   for(int i = 0; i < rows; i++){
     arr[i] = new int[(int) (Math.random() * (cols + 1))];
     for(int j = 0; j < arr[i].length; j++){
       arr[i][j]  = (int) (Math.random() * maxValue + 1);
     }
   }
   return arr;
 }
}
