
public class histogram {
    public static void calArea(int[] arr)throws Exception{
        int arr2;
        for(int i=0; i<arr.length; i++){
            int count = 1;
            if(i>0){
                int j=i-1;
                while(arr[j]>arr[i]){
                    count = count +1;
                    j--;
                }
            }
            if(i<arr.length-1){
                int k = i+1;
                while(arr[k]>arr[i]){
                    count = count + 1;
                    k++;
                }
            }
            int area = arr[i] * count;
            arr2 = maxCal(area, arr, i);
            System.out.println(arr2);
        }
    }
    public static int maxCal(int area, int[] arr, int idx)throws Exception{
        int[] arr2 = new int[arr.length];
        arr2[idx] = area; 
        int max = arr2[0];
        printmax(arr2, max);
        return max;
    }
    public static int printmax(int[] arr2, int max)throws Exception{
        for(int i=0; i<arr2.length-1; i++){
            if(arr2[i]<arr2[i+1]){
                max = arr2[i+1];
            }else{
                max = arr2[i];
            }
        }
        return max;
    }
    public static void main(String[] args)throws Exception {
        int[] arr = {6, 2, 5, 4, 5, 1, 6};
        calArea(arr);
    }
}
