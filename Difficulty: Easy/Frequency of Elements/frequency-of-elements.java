class Solution {
    ArrayList<ArrayList<Integer>> countFreq(int[] arr) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Maintain order of appearance
        for (int x : arr) {
            if (map.containsKey(x)) {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(x);
                temp.add(map.get(x));
                res.add(temp);
                map.remove(x); // prevent duplicates
            }
        }

        return res;
    }
}
