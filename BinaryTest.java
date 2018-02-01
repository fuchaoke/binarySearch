public class BinaryTest {
    public static int binary(int [] nums,int keys ){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=((low+high)/2);
            if (keys==nums[mid]){
                return mid;
            }
            if(keys<=nums[mid]){
                high=mid-1;
            }
            if(keys>=nums[mid]){
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String []args){
        int [] a={1,3,5,7,9,11,13,14,15,16};
        int value=binary(a,11);
        System.out.println(value);
    }
}
