class Solution {
    
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0;
        int j = people.length - 1;
        int boat = 0;
        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                boat++;
                j--;
                i++;
            } else {
                boat++;
                j--;
            }
        }
        return boat;
    }
}