package ru.bpdu;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {
    public static void main(String[] args) {
    }

    public static int singleNumber(int[] nums) {
/*        List<Integer> list = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());

        return list.stream()
                .sorted(Comparator.comparing(i -> Collections.frequency(list, i)))
                .limit(1)
                .mapToInt(i -> i)
                .sum();
*/

        List<Integer> singleOccurrence = new ArrayList<>();
        for (int num : nums) {
            if (singleOccurrence.contains(num)) {
                singleOccurrence.remove(singleOccurrence.indexOf(num));
            } else {
                singleOccurrence.add(num);
            }
        }
        return singleOccurrence.get(0);
    }
}
