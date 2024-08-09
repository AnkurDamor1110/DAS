package Greedy;

import java.util.ArrayList;
import java.util.Collections;

public class G6_JobSequencing {
    static class Job {
        int deadLine;
        int profit;
        int id;

        public Job(int i,int p,int d){
            id=i;
            deadLine=d;
            profit = p;
        }
    }
    public static void main(String[] args) {
        int jobInfo[][] = {{4,20},{1,20},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0;i<jobInfo.length;i++){
            jobs.add(new Job(i, jobInfo[i][1], jobInfo[i][0]));

        }
        Collections.sort(jobs, (obj1,obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time =0;

        for(int i=0;i<jobs.size();i++){
            Job curr = jobs.get(i);

            if(curr.deadLine > time){
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println(seq.size());
        System.out.println(seq);
    }
}
