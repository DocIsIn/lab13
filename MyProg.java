public class MyProg {

    // Method m1
    public int m1(int value) {
        if (value < 5) {
            return 5;
        } else if (value < 10) {
            return value;
        } else {
            return value * value;
        }
    }

    // Method m2
    public int m2(int v1, int v2) {
        int sum = 0;
        if (v1 > v2) {
            int temp = v1;
            v1 = v2;
            v2 = temp;
        }
        for (int i = v1; i <= v2; i++) {
            sum += i;
        }
        return sum;
    }
}
