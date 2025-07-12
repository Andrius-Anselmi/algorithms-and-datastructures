public class fMaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int[] max  = new int[nums.length];
        int ConsecutiveOnes = 0;
        int j = 0;
        int maior = max[0];
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum =  sum + nums[i];
        }

        if(sum == 0 ){

            return 0;
        }


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                ConsecutiveOnes++;
                max[j] = ConsecutiveOnes;
            }
            else {
                j++;
                ConsecutiveOnes = 0;
                max[j] = ConsecutiveOnes;
            }
        }

        for(int k = 0; k <  max.length; k++){
            if(max[k] > maior)
                maior = max[k];
        }
        return maior;
    }
}
