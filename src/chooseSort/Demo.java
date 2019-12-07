package chooseSort;

public class Demo {

    public static void main(String[] args) {
        int[] arr = {22,34,34,45,454};
        method1(arr);

    }
    public static void method1(int[] arr){
        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr.length-i;j++){
                if(arr[j]<arr[j+1]){
                    arr[j+1] = arr[j];

                }
            }
            int tmp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i];
        }
        for (int a:arr
             ) {
            System.out.println(a);

        }

    }
}
