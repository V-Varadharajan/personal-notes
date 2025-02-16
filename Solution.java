class Solution {

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        maxArea(height);
    }
    static int maxArea(int[] height) {
        int start = 0, end = height.length-1, col = 0;
        while(start < end) {
            col = Math.max(col, (end - start) * Math.min(height[start], height[end]));
            if(height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return col;
    }
}