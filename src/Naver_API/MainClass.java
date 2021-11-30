package Naver_API;

import java.util.ArrayList;
import java.util.Scanner;
import dto.NaverApiDTO;

// 메인에 있는 네이버 API 소스들을 클래스를 만들어서 다 옮기고
// 메인에서는 검색어만 전달하면 결과가 나오게 만들기

// 맛집을 찾아 주는 앱이라 생각하고 json 형식의 데이터로 받는데
// 너무 복잡하네..
// 제목, 링크, 날짜만 가져와서 보기 좋게 출력 해보자
// 제목: 여기 맞집
// 링크: https://sa;dfkjsajdf
// 날짜: 20211129
// 어렵지만 어떻게 해야 될지 고민 또는 검색을 통해서 할 수 있는 사람은 해보기

public class MainClass {

	public static void main(String[] args) {
		NaverAPI nv = new NaverAPI();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("****************************************");
			System.out.println("1.뉴스");
			System.out.println("2.블로그 검색");
			System.out.println("3.영화 검색");
			System.out.println("4.책 검색");
			System.out.println("0.Exit");
			System.out.println("*****************************************");
			System.out.print("입력(1~4,0) : ");
			int Ip = sc.nextInt();
			System.out.println("");
			if (Ip == 1) {
				System.out.print("검색어 입력 : ");
				String Ss = sc.next();
				String responseBody = nv.searchNews(Ss);
				ArrayList<NaverApiDTO> list = nv.getListJson(responseBody);
				for (NaverApiDTO d : list) {
					System.out.print("제목: ");
					System.out.println(d.getTitle());
					System.out.print("링크: ");
					System.out.println(d.getLink());
					System.out.print("날짜: ");
					System.out.println(d.getPubDate());
				}

			} else if (Ip == 2) {
				System.out.print("검색어 입력 : ");
				String Ss = sc.next();
				String responseBody = nv.searchBlog(Ss);
				ArrayList<NaverApiDTO> list = nv.getListJson(responseBody);
				for (NaverApiDTO d : list) {
					System.out.print("제목: ");
					System.out.println(d.getTitle());
					System.out.print("링크: ");
					System.out.println(d.getLink());
					System.out.print("날짜: ");
					System.out.println(d.getPubDate());
				}

			} else if (Ip == 3) {
				System.out.print("검색어 입력 : ");
				String Ss = sc.next();
				String responseBody = nv.searchNews(Ss);
				ArrayList<NaverApiDTO> list = nv.getListJson(responseBody);
				for (NaverApiDTO d : list) {
					System.out.print("제목: ");
					System.out.println(d.getTitle());
					System.out.print("링크: ");
					System.out.println(d.getLink());
					System.out.print("날짜: ");
					System.out.println(d.getPubDate());
				}

			} else if (Ip == 4) {
				System.out.print("검색어 입력 : ");
				String Ss = sc.next();
				String responseBody = nv.searchNews(Ss);
				ArrayList<NaverApiDTO> list = nv.getListJson(responseBody);
				for (NaverApiDTO d : list) {
					System.out.print("제목: ");
					System.out.println(d.getTitle());
					System.out.print("링크: ");
					System.out.println(d.getLink());
					System.out.print("날짜: ");
					System.out.println(d.getPubDate());
				}

			} else if (Ip == 0) {
				break;
			}
		}
//		String responseBody = nv.searchNews("코로나");
//		System.out.println(responseBody);

	}

}