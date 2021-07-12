package co.yedam;

import java.util.Scanner;

public class MainApp {

	static MainApp app = new MainApp();

	private MainApp() {
	}

	public static MainApp getInstance() {
		return app;
	}

	Member[] members = new Member[10];
	Scanner s = new Scanner(System.in);

	public void showMenu() {
		System.out.println("------------------------:");
		System.out.println("1.입력 2.수정 3.삭제 4.리스트 5.단건조회 6.분석 7.종료");
		System.out.println("------------------------:");
		System.out.print("선택>>");

	}

	public void add() {
		String studentNo = Utils.scanString("학번입력>>>");
		String name = Utils.scanString("이름입력 >>>");
		String escore = Utils.scanString("영어점수입력>>>");
		String mscore = Utils.scanString("수학점수입력>>>");

		Member member = new Member(studentNo, name, escore, mscore);

		for (int i = 0; i < members.length; i++) {
			if (members[i] == null) {
				members[i] = member;
				break;
			}
		}
	}// add 완료

	public void update() {
		String num = Utils.scanString("수정할 학번 입력>>");
		String e = Utils.scanString("수정할 영어점수 입력>>");
		String m = Utils.scanString("수정할 수학점수 입력>>");
		
		
	}// update

	public void del() {
		String del = Utils.scanString("삭제할 학번입력>>");
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].getStudentNo().equals(del)) {
				members[i] = null;
				System.out.println("1건이 삭제 되었습니다.");
				break;
			}
		}
	}// del완료

	public void search() {
		String num = Utils.scanString("조회할 학번입력>>");
		boolean exist = false;
		for(int i =0; i<members.length; i++) {
			if(members[i] != null && members[i].getStudentNo().equals(num)) {
				System.out.println(members[i].showInfo());
				exist = true;
			}
		}
		if(!exist)
			System.out.println("존재하지 않는 학번입니다.");

	}// search 완료

	public void list() {
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {
				System.out.println("학생정보" + members[i].getStudentNo() + "," + members[i].getStudentname() + ","
						+ members[i].geteScore() + "," + members[i].getmScore());
			}
		}
	}// list 완료

	public void compare() {
		int maxvalue =0;
		Member maxStudent = null;
		
		for(int i=0; i<members.length; i++) {
			
		}
			
	}
	
	public void exe() {

		boolean run = true;
		while (run) {
			showMenu();
			int menu = s.nextInt();
			s.nextLine();
			if (menu == 1) {
				add();
			} else if (menu == 2) {
				update();
			} else if (menu == 3) {
				del();
			} else if (menu == 4) {
				list();
			} else if (menu == 5) {
				search();
			} else if (menu == 6) {
				compare();
			} else
				run = false;

			
		}
		System.out.println("프로그램종료");
	} //exe



}