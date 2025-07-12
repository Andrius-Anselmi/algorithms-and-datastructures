public class Main {

    public static void main(String[] args) {

        fMaxConsecutiveOnes f =  new fMaxConsecutiveOnes();
        int[] nums = {1,1,0,1,1,1};
        int MaxConsecutive = f.findMaxConsecutiveOnes(nums);
        System.out.println(MaxConsecutive);



    }
}
