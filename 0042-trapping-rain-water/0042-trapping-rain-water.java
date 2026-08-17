class Solution {
 public  int trap(int[] height) {
        int n = height.length;
        int leftbound[] = new int[n];
        leftbound[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftbound[i] = Math.max(height[i], leftbound[i - 1]);
        }
        int rightbound[] = new int[n];
        rightbound[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightbound[i] = Math.max(height[i], rightbound[i + 1]);
        }
        int trapRainwater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftbound[i], rightbound[i]);
            trapRainwater += waterlevel - height[i];
        }
        return trapRainwater;
    }
}