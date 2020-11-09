//package test;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//import main.Article;
//
//public class page {
//
//	public static void main(String[] args) {
//		
//		ArrayList<Article> articles = new ArrayList<>();
//		
//		for(int i =0; i <= 50; i++) {
//			Article a1 = new Article();
//			a1.setId(i);
//			a1.setTitle("제목" + i);
//			a1.setBody("내용" + i);
//			articles.add(a1);
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int currentPageNo = Integer.parseInt(sc.nextLine());
//		int totalCntOfItems = articles.size(); //전체 게시물 개수
//		int startPageNo =1; //시작 페이지 번호
//		int itemCntPerPage = 3; // 페이지당 출력 게시물 개수
//		int pageCntPerBlock = 5; // 한 페이지 블럭 당 페이지 개수
//		int endPageNo = (int)Math.ceil((double)totalCntOfItems / itemCntPerPage); // 마지막 페이지 번호
//		int currentPageBlock = (int)Math.ceil((double)currentPageNo / pageCntPerBlock);  // 현재 페이지 블럭
//		
//		int startPageNoInBlock = ((currentPageBlock -1) * pageCntPerBlock) + 1;
//		int endPageNoInBlock = startPageNoInBlock + pageCntPerBlock - 1; 
//		
//		
//		
//		if(startPageNoInBlock < startPageNo) {
//			startPageNoInBlock = startPageNo;
//		}
//		if(endPageNoInBlock > endPageNo) {
//			endPageNoInBlock = endPageNo;
//		}
//		
//		int startIndex = (currentPageNo - 1) * itemCntPerPage;
//		int endIndex = startIndex + itemCntPerPage; 
//		
//		if(endIndex > totalCntOfItems) {
//			endIndex = totalCntOfItems;
//		}
//		
//		for(int i = startIndex; i < endIndex; i++) {
//			System.out.println("번호 : " + articles.get(i).getId());
//			System.out.println("제목 : " + articles.get(i).getTitle());
//			System.out.println("내용 : " + articles.get(i).getBody());
//			System.out.println("=============================");
//		}
//		
//		for (int i = startPageNoInBlock; i <= endPageNoInBlock; i++) {
//			if (i == currentPageNo) {
//				System.out.print("[" + i + "]");
//			} else {
//				System.out.print(i + " ");
//			}
//
//		}
//
//	}
//
//}
