package programmers.level1.minRectangle_86491;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[] width = new int[sizes.length];
        int[] height = new int[sizes.length];
        int index = 0;
        for(int[] size:sizes){
            if(size[0] < size[1]){
                width[index] = size[1];
                height[index] = size[0];
            }else{
                width[index] = size[0];
                height[index] = size[1];
            }
            index ++;
        }

        int maxWidth = 0;
        int maxHeight = 0;
        for(int i=0; i<width.length; i++){
            if(height[i] > maxHeight){
                maxHeight = height[i];
            }
            if(width[i] > maxWidth){
                maxWidth = width[i];
            }
        }
        return maxHeight * maxWidth;
    }
}
