import java.util.Arrays;

public class MyMain {

    // Rotates all values in an array to the left
    // Ex. rotateLeft([1, 2, 3, 4, 5]) => [2, 3, 4, 5, 1]
    public static int[] rotateLeft(int[] arr) {
        for (int i=0;i<arr.length-1;i++){
            if (i==0){
                int tmp = arr[i];
                arr[i]=arr[arr.length-1];
                arr[arr.length-1] = tmp;
            }
            else{
                int n=arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=n;
            }
        }
        return arr;
    }

    // Rotates all values in an array to the right
    // Ex. rotateRight([1, 2, 3, 4, 5]) => [5, 1, 2, 3, 4]
    public static int[] rotateRight(int[] arr) {
        for (int i=arr.length-1;i>0;i--){
            if (i==0){
                int tmp = arr[i];
                arr[i]=arr[arr.length-1];
                arr[arr.length-1] = tmp;
            }
            else{
                int n=arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=n;
            }
        }
        return arr;
    }


    // Replaces all duplicate values with -1
    // Ex. duplicateReplacer([1, 2, 1, 2, 1, 1]) => [1, 2, -1, -1, -1, -1]
    public static int[] duplicateReplacer(int[] arr) {
        for (int i=0;i<=arr.length-1;i++){
            for (int j=i+1;j<=arr.length-1;j++){
                if (arr[i]==arr[j]){
                    arr[j]=-1;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(MyMain.rotateLeft(new int[] {3,0,2,4,1})));
        System.out.println(Arrays.toString(MyMain.rotateRight(new int[] {1,2,4,2,3})));
        System.out.println(Arrays.toString(MyMain.duplicateReplacer(new int[] {1,2,1,3,1,4,1,5})));
        System.out.println(Arrays.toString(MyMain.rotateLeft(new int[] {2,4,6,3,7,5,9})));
        System.out.println(Arrays.toString(MyMain.rotateRight(new int[] {1,3,2,6,4,7,6})));
        System.out.println(Arrays.toString(MyMain.duplicateReplacer(new int[] {0,96,45,3,5,2,4,6,})));
    }
}
