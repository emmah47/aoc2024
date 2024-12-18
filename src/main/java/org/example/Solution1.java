package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution1 {
    // problem 1
    public int findDistanceSum(List<String> left, List<String> right) {
        List<Integer> sortedLeft = left.stream().map(Integer::valueOf).sorted().toList();
        List<Integer> sortedRight = right.stream().map(Integer::valueOf).sorted().toList();
        List<Integer> differences = new ArrayList<>();

        for (int i = 0; i < left.size(); i++) {
            differences.add(Math.abs(sortedLeft.get(i) - sortedRight.get(i)));
        }

        return differences.stream().reduce(0, Integer::sum);
    }

    // problem 2
}
