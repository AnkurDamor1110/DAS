package Array;

public class A10_TrappedWater {
    public static int TrappedRainWater(int height[]) {
        int n = height.length;


        // calculate left max boundary -- arry

        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }


        // calculate Right max boundary -- arry

        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }


        int TrappedWater = 0;


        // loop

        for (int i = 0; i < n; i++) {
            // WaterLevel = min(leftMax bound,rightMax bound)

            int WaterLevel = Math.min(leftMax[i], rightMax[i]);

            // TrappedWater = WaterLevel - height[i]

            TrappedWater += WaterLevel - height[i];

        }


        return TrappedWater;

    }

    public static void main(String[] args) {
        int height[] = { 0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};

        System.out.println(TrappedRainWater(height));
    }
}
