import java.util.*;

public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(perms("123"));

	}

	public static ArrayList<String> perms(String str){
		ArrayList<String> permutations = new ArrayList<String>();
		if(str.length() == 0){
			permutations.add(str);
			return permutations;
		}
		permsHelper("", str, permutations);
		return permutations;
	}

	public static void permsHelper(String usedLetters, String unusedLetters, ArrayList<String> permutations){
		if(unusedLetters.equals("")){
			permutations.add(usedLetters);
		}


		for(int i = 0; i < unusedLetters.length(); i++){
			permsHelper(usedLetters + unusedLetters.charAt(i), unusedLetters.substring(0, i) + unusedLetters.substring(i+1), permutations);
		}

	}
	
	public static ArrayList<String> permsUnique(String str){
		ArrayList<String> permutations = new ArrayList<String>();
		if(str.length() == 0){
			permutations.add(str);
			return permutations;
		}
		permsUniqueHelper("", str, permutations);
		return permutations;
	}

	public static void permsUniqueHelper(String usedLetters, String unusedLetters, ArrayList<String> permutations){
		if(unusedLetters.equals("") && !permutations.contains(usedLetters)){
			permutations.add(usedLetters);
		}


		for(int i = 0; i < unusedLetters.length(); i++){
			permsUniqueHelper(usedLetters + unusedLetters.charAt(i), unusedLetters.substring(0, i) + unusedLetters.substring(i+1), permutations);
		}

	}

}
