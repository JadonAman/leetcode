class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arrayList = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(arrayList.get(i - 1).get(j - 1) + arrayList.get(i - 1).get(j));
                }
            }

            arrayList.add(row);
        }

        return arrayList;
    }
}