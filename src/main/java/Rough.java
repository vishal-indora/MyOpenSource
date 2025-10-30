import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Rough {
    public static void main(String[] args) {

//        Queue<String> Q = new ArrayDeque<>();
//        Q.poll();
//        String s;
//        String s2;
//        //s.compareTo(s2);
//
//        int[] nums = {1,23,4,5};
//        OptionalDouble average = Arrays.stream(nums).average();
//        Set<Integer> collect = Arrays.stream(nums).boxed().collect(Collectors.toSet());
//
//        StringBuilder sb = new StringBuilder();
//        int length = sb.length();
//        new StringBuilder(sb.substring(0, 5));
//        Instant now = Instant.now();
//        long epochSecond = now.getEpochSecond();
//        int nano = now.getNano();
//        System.out.println(nano);
//        System.out.println(epochSecond);
//        System.out.println(System.currentTimeMillis());

        String url = "https://www.google.com";
        long counter = 1000000L;

        Base64.Encoder base64 = Base64.getUrlEncoder();
        String encode = base64.encodeToString(url.getBytes(StandardCharsets.UTF_8));
        System.out.println(encode);
        System.out.println(encode.length());

        Map<String, String> mp = new HashMap<>();
        Object o = new Object();
        System system;
        List<Integer> integers = List.of(-1);
        List<Integer> integers1 = List.of(1, 2);
        String str = "hello";
        boolean m = str.contains("M");
        int n = 5;
        StringBuilder sb = new StringBuilder((CharSequence) Collections.nCopies(n, "0"));
        System.out.println(sb);

        int[] nums = new int[3];
        //R collect = Arrays.stream(nums).map(x -> x * x).collect(Collectors.toList());
    }
}


class Solution {
    public long countStableSubarrays(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int idx = 0, sm = 0;
        for(int i:nums){
            sm += i;
            pre[idx++] = sm;
        }
        int soln=0;
        Map<Pair, Boolean> mp = new HashMap<>();
//        for(int i=n-1;i>=0;i--) {
//            if(mp.get())
//        }

        return soln;
    }

    class Pair {
        public int val;
        public int sum;

        public Pair(int val, int sum){
            this.val = val;
            this.sum = sum;
        }

        @Override
        public int hashCode() {
            int hashCode = Arrays.hashCode(new int[]{val, sum});
            return Objects.hash(val, sum);
        }

        @Override
        public boolean equals(Object obj) {
            Pair p = (Pair) obj;
            return p.val == this.val && p.sum == this.sum;
        }
    }
}

/**
private static final String BASE62 = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

public static String encodeBase62(long value) {
    StringBuilder sb = new StringBuilder();
    while (value > 0) {
        int remainder = (int)(value % 62);
        sb.append(BASE62.charAt(remainder));
        value /= 62;
    }
    return sb.reverse().toString();
}

class Solution {
    public double maxAverageRatio(int[][] classes, int ex) {
        // i can greedily say that always add the student to minimum avg class
        PriorityQueue<Ratio> Q = new PriorityQueue<Ratio>((a,b) -> (int)(a.ratio - b.ratio));
        int n = classes.length;
        for (int[] aClass : classes) {
            Q.add(new Ratio(aClass[0], aClass[1]));
        }

        while(ex>0){
            Ratio R = Q.poll(); // got the minimum ratio
            R.addPass();
            Q.add(R);
            ex--;
        }
        double avg = 0.0;
        while(!Q.isEmpty()){
            avg += Q.poll().ratio;
        }
        return avg/n;
    }

    class Ratio {
        public int pass;
        public final int total;
        public double ratio;
        Ratio(int pass, int total) {
            this.pass = pass;
            this.total = total;
            this.ratio = (double) pass/total;
        }

        public void addPass(){
            this.pass += 1;
            this.ratio = (double) pass/total;
        }
    }
}
 */


