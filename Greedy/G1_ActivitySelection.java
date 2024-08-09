package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class G1_ActivitySelection {
    public static int activity(int start[],int end[]){
        // end time basic sorted
        ArrayList<Integer> list = new ArrayList<>();
        int maxAct=0;

        // select first activity
        maxAct++;
        int lastTime = end[0];
        list.add(0);

        for(int i=1;i<end.length;i++){
            if(start[i] >= lastTime){
                maxAct++;
                list.add(i);
                lastTime = end[i];
            }
        }

        return maxAct;

    }

    public static int activitySections(int start[],int end[]){
        // sorting base on end time

        int activities[][] = new int[start.length][3];

        for(int i=0;i<activities.length;i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        //lamda function for sort 2nd idx 

        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> list = new ArrayList<>();
        int maxAct=0;

        // select first activity
        maxAct++;
        int lastTime = activities[0][2];
        list.add(activities[0][0]);

        for(int i=1;i<end.length;i++){
            if(activities[i][1] >= lastTime){
                maxAct++;
                list.add(activities[i][0]);
                lastTime = activities[i][2];
            }
        }

        return maxAct;
    }
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};

        System.out.println(activity(start, end));
        System.out.println(activitySections(start, end));
    }
}
