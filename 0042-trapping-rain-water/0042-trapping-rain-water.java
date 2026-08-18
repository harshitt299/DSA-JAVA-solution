class Solution {
    public static int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int leftMax = 0;
        int rightMAx = 0;
        int trapwater = 0;
        while (left <= right) {
            if (leftMax <= rightMAx) {
                if (leftMax <= height[left]) {
                    leftMax = height[left];
                } else {
                    trapwater += leftMax - height[left];
                }
                left++;
            } else {
                if (rightMAx <= height[right]) {
                    rightMAx = height[right];
                } else {
                    trapwater += rightMAx - height[right];
                }
                right--;
            }

        }
        return trapwater;
    }
}