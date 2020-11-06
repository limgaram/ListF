//package main;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
//
//public class Sortor {
//	ArrayList<Article> articles = new ArrayList<Article>();
//	Article article1 = new Article();
//	Scanner sc = new Scanner(System.in);
//
//	public Sortor() {
//		
//		String method = sc.nextLine();
//
//		if (method.equals("asc")) {
//			
//			Sortor sortor = new Sortor();
//			Comparator com = new Comparator();
//			sortor.sort(articles, com);
//
//		} else if (method.equals("desc")) {
//			
//			Sortor sortor = new Sortor();
//			Comparator com = new Comparator();
//			sortor.sort(articles, com);
//			
//			Collections.sort(articles, Collections.reverseOrder());
//		}
//
//	}
//
//	void sort(List<Article> arr, Comparator com) {
//		for (int i = 0; i < arr.size() - 1; i++) { // n - 1 번
//			for (int j = 0; j < arr.size() - 1; j++) {
//				if (com.compare(arr.get(j), arr.get(j + 1)) > 0) {
//					Article tmp = arr.get(j);
//					arr.set(j, arr.get(j + 1));
//					arr.set(j + 1, tmp);
//				}
//			}
//		}
//	}
//}
//
//interface ComparatorInterface {
//	int compare(Article a1, Article a2);
//}
//
//class Comparator implements ComparatorInterface {
//	public int compare(Article a1, Article a2) {
//		if (a1.getId() < a2.getId()) {
//			return 1;
//		}
//		return -1;
//	}
//}