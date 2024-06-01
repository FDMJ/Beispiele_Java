public class GGTtest {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        System.out.println("Der GGT von " + m + " und " + n + " ist: " + ggt(m, n));
    }

    static int ggt(int m, int n) {
        if(m == n) {
            return m;
        }
        int gr = (m > n) ? m : n;
        int kl = (m < n) ? m : n;
        for(int i = gr / 2; i >= 2; i--) {
            if(gr % i == 0 && kl % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
