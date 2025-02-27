class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        HashMap<Integer, Integer> hmp = new HashMap<>();
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            hmp.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int a = arr[i], b = arr[j], count = 2;

                while (hmp.containsKey(a + b)) {
                    int sum = a + b;
                    a = b;
                    b = sum;
                    count++;
                }

                max = Math.max(max, count);
            }
        }

        return max > 2 ? max : 0;
    }
}
