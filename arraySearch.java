
public class arraySearch {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int target = 4;
        int flag = 0;
        for (int i = 0;i<num.length;i++){
            if(num[i] == target){
                flag = 1;
            }

        }
        if(flag == 1){
            System.out.println("found");
        }
        else{
            System.out.println("Not found");
        }
    }
}
