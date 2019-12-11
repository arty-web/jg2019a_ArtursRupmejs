import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {

	public static void main(String[] args) {

		Set<String> citrusVocabulary = new HashSet<>();
		addWords(citrusVocabulary);

		getUniqueWords(citrusVocabulary);
		printToConsole(citrusVocabulary);

	}

	private static void addWords(Set<String> word) {
		word.add("lemon");
		word.add("tangelo");
		word.add("pomelo");
		word.add("lemon");
		word.add("mandarin");
		word.add("orange");
		word.add("orange");
		word.add("clementine");
		word.add("lemon");
		word.add("clementine");
		word.add("lime");
	}

	private static void getUniqueWords(Set<String> vocabulary) {
		System.out.println("There are '" + vocabulary.size() + "' unique words in this vocabulary.");
	}

	private static void printToConsole(Set<String> vocabulary) {
		System.out.println("Vocabulary items: " + vocabulary);
	}

}
