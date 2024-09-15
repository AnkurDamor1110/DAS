package TCS;

import java.util.*;

public class T8_Query {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int totalFemale=0;
        int totalGrade=0;

        ArrayList<String> res = new ArrayList<>();

        while (n-- > 0) {
            String name,gender;
            int age;
            char grade;

            name = sc.next();
            age = sc.nextInt();
            grade = sc.next().charAt(0);
            gender = sc.next();


            if(age > 20){
                res.add(name);
            }

            if(gender.equals("Female")){
                totalFemale++;
                totalGrade += grade;
            }
            
        }

        double avg = (totalFemale == 0)? 0 : (double) totalGrade / totalFemale;

        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i) + " ");
        }
        System.out.println();

        System.out.println(avg);
        sc.close();
    }
}
