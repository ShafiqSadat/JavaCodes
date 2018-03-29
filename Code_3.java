package CodeFight;
public class Code_3 {
public static void main(String[] args){
        int myArray[][] = new int [5][6];
        int counter = 1;
         Row: for (int i = 0; i <5; i++){
           Coulm: for (int j = 0; j <6; j++){
                myArray[i][j]=10*counter*3;
                counter++;
            }
        }
        System.out.format("Min is :%d \nMax is :%d\nAverage is :%d\n",Min(myArray),Max(myArray),Average(myArray));
        }
    public static int Min(int myArray[][]){
        int min = myArray[0][0];
        Row : for(int i = 0; i <myArray.length; i++) {
            Colum: for (int j = 0; j <myArray[i].length; j++){
                if (min>myArray[i][j]){
                    min=myArray[i][j];
                }
            }
        }
        return min;
    }
    public static int Max(int myArray[][]){
        int max = myArray[0][0];
        Row : for (int i = 0; i < myArray.length; i++) {
            Colum : for (int j = 0; j < myArray[i].length; j++) {
                if (max<myArray[i][j]){
                    max=myArray[i][j];
                }
            }
        }
        return max;
    }
    public static int Average(int [][] myArray){
        int jam=0;
          Row: for (int i = 0; i <myArray.length; i++) {
           Colum: for (int j = 0; j <myArray[i].length; j++) {
                  jam = jam+myArray[i][j]/myArray.length;
            }
        }
        return jam;
    }
}
