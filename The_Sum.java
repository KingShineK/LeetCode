
public class The_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums={1,3,5,7,9};
		int [] ins={};
		//for(int i=0;i<2;i++)
			//System.out.println(ins[i],12);
	}
	public int[] twoSum(int[] nums, int target) {
		int [] result=new int[2];
		for(int i=0;i<nums.length;i++)
			for(int j=i+1;j<nums.length;j++)
				if(nums[i]+nums[j]==target)
				{
					result[0]=i;
					result[1]=j;
					return result;
				}
        throw new IllegalArgumentException("no two sum solution");
    }
}
