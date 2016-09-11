package com.careercup.recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * @author Kuldeep Singh
 * 
 *         This is the problem number 8.3 from career cup book
 * 
 *         As writer suggest few method to find out that if problem is recursive
 *         or not. It's very simple to do this recursively. The basic idea is
 *         that for each element, the set of subsets can be divided equally into
 *         those that contain that element and those that don't, and those two
 *         sets are otherwise equal.
 * 
 *         For n=1, the set of subsets is {{}, {1}} For n>1, find the set of
 *         subsets of 1,...,n-1 and make two copies of it. For one of them, add
 *         n to each subset. Then take the union of the two copies. Edit To make
 *         it crystal clear:
 * 
 *         The set of subsets of {1} is {{}, {1}} For {1, 2}, take {{}, {1}},
 *         add 2 to each subset to get {{2}, {1, 2}} and take the union with
 *         {{}, {1}} to get {{}, {1}, {2}, {1, 2}} Repeat till you reach n
 */

public class SubsetProblem {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		Set<Set<Integer>> allSets = powerSet(s);
		System.out.println(allSets.size());
		for(Set<Integer> in : allSets){
			System.out.print("{");
			for(Integer i : in){
				System.out.print(i);
				System.out.print(",");
			}
			System.out.print("}");
			System.out.println("");
		}
	}
	
	public static Set<Set<Integer>> powerSet(Set<Integer> originalSet) {
        Set<Set<Integer>> sets = new HashSet<Set<Integer>>();
        if (originalSet.isEmpty()) {
            sets.add(new HashSet<Integer>());
            return sets;
        }
        List<Integer> list = new ArrayList<Integer>(originalSet);
        Integer head = list.get(0);
        Set<Integer> rest = new HashSet<Integer>(list.subList(1, list.size()));
        for (Set<Integer> set : powerSet(rest)) {
            Set<Integer> newSet = new HashSet<Integer>();
            newSet.add(head);
            newSet.addAll(set);
            sets.add(newSet);
            sets.add(set);
        }
        return sets;
    }

}
