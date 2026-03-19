/*
 * Aydan Romayor, Giovanni Hinojosa, Manuel Perez
 * 3/23/26
 * LeaderboardAlgorithms.java
 */



package level1;

import java.util.ArrayList;

/**
 * STUDENT TODO FILE
 *
 * You will implement sorting and binary search for the Leaderboard Terminal.
 */
public class LeaderboardAlgorithms {

    /**
     * TODO: Sort the list by score DESCENDING (highest score first).
     *
     * Requirements:
     * - Sort IN PLACE (modify the given list)
     * - You may use Collections.sort + Comparator for the first version.
     * - Week 8 challenge/extra credit: replace with merge sort or quicksort.
     */
	
	/*
	 * - This method sorts the ArrayList of scores in descending order.
	 * - The first for loop iterates over the entire array.
	 * - The second for loop iterates over the array starting from where the first for loop is at.
	 * - The second for loop searches for the maximum score.
	 * - Using a temporary variable, at the end of the second for loop, it swaps the element
	 *   the first for loop is pointing to with the element with the maximum score.
	 * - The first for loop continues until the end of the list. The list is now sorted.
	 */
    public static void sortByScoreDescending(ArrayList<ScoreEntry> list) {
    	int n = list.size();
    	
    	int maxIndex = 0;
    	for (int i = 0; i < n - 1; i++) {
    		for (int j = i; j < n - 1; j++) {
    			int maxScore = list.get(maxIndex).getScore();
    			int currScore = list.get(j).getScore();
    			
    			if (currScore > maxScore) maxIndex = j;
    		}
    		
    		ScoreEntry temp = list.get(i);
    		list.set(i, list.get(maxIndex));
    		list.set(maxIndex, temp);
    	}
    }

    /**
     * TODO: Sort the list by username ASCENDING (A -> Z).
     *
     * Requirements:
     * - Sort IN PLACE (modify the given list)
     */
    
    /*
     * - This method sorts the list by username, in ascending order (A -> Z).
     * - The first for loop iterates over the entire array.
     * - The second for loop iterates over the array starting at where the first loop points.
     * - The second for loop uses the compareTo function to compare strings lexicographically.
     * - Using a temporary variable, the current element and the element that is smaller
     *   lexicographically is swapped.
     * - The first for loop continues until the end of the list. The list is now sorted.
     */
    public static void sortByUsernameAscending(ArrayList<ScoreEntry> list) {
    	int n = list.size();
    	
    	int minIndex = 0;
    	for (int i = 0; i < n - 1; i++) {
    		for (int j = i; j < n - 1; j++) {
    			String minName = list.get(minIndex).getUsername();
    			String currName = list.get(j).getUsername();
    			
    			if (currName.compareTo(minName) < 0) minIndex = j;
    		}
    		
    		ScoreEntry temp = list.get(i);
    		list.set(i, list.get(minIndex));
    		list.set(minIndex, temp);
    	}
    }

    /**
     * TODO: Binary search for an EXACT username match.
     *
     * Precondition: list must already be sorted by username ascending!
     *
     * @return index of the matching entry, or -1 if not found
     */
    
    /*
     * - This method uses binary search to find the inputted username in the list.
     * - The method continuously divides the list into halves to find the username.
     * - It makes use of the compareTo() function to compare the inputted username to the name found by dividing the list in
     *   half lexicographically.
     * - If the username is found in the list, then it returns the index of where the name was found.
     * - Otherwise, it returns -1.
     */
    public static int binarySearchByUsername(ArrayList<ScoreEntry> list, String username) {
    	int low = 0;
    	int high = list.size() - 1;
    	
    	while (low <= high) {
    		int mid = (low + high) / 2;
    		
    		if (list.get(mid).getUsername().equals(username)) return mid;
    		
    		if (list.get(mid).getUsername().compareTo(username) < 0) low = mid + 1;
    		else high = mid - 1;
    		
    	}
    	
    	return -1;
    }
}
