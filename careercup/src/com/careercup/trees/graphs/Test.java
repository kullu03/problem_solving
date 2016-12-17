package com.careercup.trees.graphs;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {

	public static void main(String[] args) throws IOException {
		Set<Integer> s = new HashSet<Integer>();
		s.addAll(Arrays.asList(1, 2, 3));
		Set<HashSet<Integer>> kk = getSubSet(s);
		Set<HashSet<Integer>> subSets = new HashSet<>();
		subSets.add(new HashSet<>());
		getSubSetRec(s, subSets);
		System.out.println(kk.size());
		System.out.println(subSets.size());
		System.out.println(subSets);

	}

	private static Set<HashSet<Integer>> getSubSet(Set<Integer> inputSet) {
		Set<HashSet<Integer>> subSets = new HashSet<>();
		subSets.add(new HashSet<>());
		if (inputSet.size() == 0)
			return subSets;

		for (Integer i : inputSet) {

			HashSet<Integer> newSubSet = new HashSet<Integer>();
			newSubSet.add(i);
			Set<HashSet<Integer>> cloneSet = new HashSet<>();

			for (Iterator<HashSet<Integer>> iterator = subSets.iterator(); iterator.hasNext();) {
				HashSet<Integer> old = iterator.next();
				HashSet<Integer> newSet = new HashSet<>();
				newSet.addAll(old);
				newSet.add(i);
				cloneSet.add(old);
				cloneSet.add(newSet);

			}

			subSets.add(newSubSet);
			subSets.addAll(cloneSet);

		}

		return subSets;

	}

	private static void getSubSetRec(Set<Integer> inputSet, Set<HashSet<Integer>> subSets) {

		if (inputSet.size() == 0) {
			
			return;
		}

		for (Integer i : inputSet) {
			Set<Integer> inputSetC = new HashSet<>();
			inputSetC.addAll(inputSet);
			inputSetC.remove(i);
			HashSet<Integer> o = new HashSet<>();
			o.add(i);
			Set<HashSet<Integer>> newSubSets = new HashSet<>();
			newSubSets.addAll(subSets);
			for(HashSet<Integer> oldSubSet : subSets){
				oldSubSet.add(i);
				newSubSets.add(oldSubSet);
			}
			newSubSets.add(o);
			//subSets = newSubSets;
			subSets.clear();
			subSets.addAll(newSubSets);
			getSubSetRec(inputSetC, subSets);

		}
	}
}
