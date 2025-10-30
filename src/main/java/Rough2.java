import java.util.*;
import java.util.stream.Collectors;


public class Rough2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t>0){
//            int n = sc.nextInt();
//            int[] ans = new int[n];
//            int o=0, e=0;
//            for(int i=0;i<n;i++){
//                ans[i] = sc.nextInt();
//                if(ans[i]%2 == 0) e++;
//                else o++;
//            }
//            if(e>0 && o>0){
//                Arrays.sort(ans);
//            }
//            for(int a:ans) System.out.printf(a + " ");
//            System.out.println();
//            t--;
//        }


        // write algorithm to do merge sort
        int curr = 5;
        Random random = new Random();
        int i = random.nextInt(0, curr);
        System.out.println(i);

        i = random.nextInt(0, curr);
        System.out.println(i);

        i = random.nextInt(0, curr);
        System.out.println(i);

        i = random.nextInt(0, curr);
        System.out.println(i);

        i = random.nextInt(0, curr);
        System.out.println(i);

        List<Integer> list = new ArrayList<>();

        list.add(1); list.add(2);
        int[] array = list.stream().mapToInt(Integer::intValue).toArray();

        List<Integer> integerList = Arrays.stream(array).boxed().toList();

        String[] strings = new String[10];
        List<String> stringList = Arrays.stream(strings).toList();

        Queue<Integer> Q = new ArrayDeque<>();

    }


}


