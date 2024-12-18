package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution1 {
    List<Integer> left;
    List<Integer> right;

    public Solution1(List<String> left, List<String> right) {
        this.left = left.stream().map(Integer::valueOf).sorted().toList();
        this.right = right.stream().map(Integer::valueOf).sorted().toList();
    }

    // problem 1
    public int findDistanceSum() {
        List<Integer> differences = new ArrayList<>();

        for (int i = 0; i < left.size(); i++) {
            differences.add(Math.abs(left.get(i) - right.get(i)));
        }

        return differences.stream().reduce(0, Integer::sum);
    }

    // problem 2
    public int calculateSimilarityScore() {
        int sum = 0;
        Integer prev = null;
        int similarityScore = 0;

        for (Integer id: left) {
            if (!id.equals(prev)) {
                int dupCount = right.stream().filter(x -> x.equals(id)).toList().size();
                similarityScore = dupCount * id;
                prev = id;
            }

            sum += similarityScore;
        }

        return sum;
    }
}
