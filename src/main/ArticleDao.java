package main;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ArticleDao {
	private ArrayList<Article> articles;
	private int no = 6;

	public ArticleDao() {
		articles = new ArrayList<>();
		
		Article a1 = new Article(1, "안녕하세요", "내용1", 1, Util.getCurrentDate() , 100 , 20);
		Article a2 = new Article(2, "반갑습니다.", "내용2", 2, Util.getCurrentDate(), 20, 17);
		Article a3 = new Article(3, "안녕", "내용3", 3, Util.getCurrentDate(), 17, 31);
		Article a4 = new Article(4, "이름", "내용4", 4, Util.getCurrentDate(), 90, 100);
		Article a5 = new Article(5, "아니", "내용5", 5, Util.getCurrentDate(), 70, 50);

		articles.add(a1);
		articles.add(a2);
		articles.add(a3);
		articles.add(a4);
		articles.add(a5);
		
		for(int i = 6; i <= 50 ; i++) {
			Article a6 = new Article();
			a6.setId(i);
			a6.setTitle("제목" + i);
			a6.setBody("내용" + i);
			a6.setMid(1);
			
			articles.add(a6);
		}
	}

	public void insertArticle(Article a) {
		a.setId(no);
		no++;
		a.setRegDate(Util.getCurrentDate());

		articles.add(a);
	}

	public void removeArticle(Article a) {
		articles.remove(a);
	}



	public ArrayList<Article> getSearchedArticlesByFlag(int flag, String keyword) {

		ArrayList<Article> searchedArticles = new ArrayList<>();

		for (int i = 0; i < articles.size(); i++) {
			Article article = articles.get(i);
			String str = article.getPropertiesByFlag(flag);
			if (str.contains(keyword)) {
				searchedArticles.add(article);
			}
		}

		return searchedArticles;

	}

	// Article 버전
	public Article getArticleById(int targetId) {
		for (int i = 0; i < articles.size(); i++) {
			int id = articles.get(i).getId();
			if (id == targetId) {
				return articles.get(i);
			}
		}

		return null;
	}

	public ArrayList<Article> getArticles() {
		return articles;
	}

	public ArrayList<Article> getSearchedArticlesByBody(String keyword) {
		ArrayList<Article> searchedArticles = new ArrayList<>();
		
		for (int i = 0; i < articles.size(); i++) {
			Article article = articles.get(i);
			String str = article.getBody(); // 각 게시물 제목
			if (str.contains(keyword)) {
				searchedArticles.add(article);
			}
		}

		return searchedArticles;
	}
}
