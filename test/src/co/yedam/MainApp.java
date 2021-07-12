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

	public void contadd() {
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

	public void contMo() {
		String studenNo = Utils.scanString("수정할 학번 입력>>");
		for (int i = 0; i < members.length; i++) {
			if (members[i].getStudentNo() == studenNo) {
				String name = Utils.scanString("이름 입력>>");
				if (!name.equals("")) {
					members[i].setStudentname(name);
				}
				String escore = Utils.scanString("영어점수입력");
				if (!escore.equals("")) {
					members[i].seteScore(escore);
				}
				String mscore = Utils.scanString("수학점수입력");
				if (!mscore.equals("")) {
					members[i].seteScore(mscore);
				}
			}
		}

	}// mo

	public void contdel() {
		String del = Utils.scanString("삭제할 학번입력>>");
		for(int i=0; i<members.length; i++) {
			if(members[i] != null && members[i].getStudentNo() == del) {
				members[i] = null;
				System.out.println("1건이 삭제 되었습니다.");
				break;
			}
		}
	}//del
	
	public void search() {
		String list = Utils.scanString("조회할 학번입력>>");
		boolean exist = false;
		for(int i =0; i<members.length; i++) {
			if(members[i] !=null && members[i].getStudentNo().eq) {
				System.out.println(members[i].showInfo());
				exist=true;
			}
		}
			
	}//search 완료
	
	public void list() {
		for(int i=0; i<members.length; i++) {
			if(members[i] !=null) {
				System.out.println("학생정보"+members[i].getStudentNo()+","+members[i].getStudentname()+","+members[i].geteScore()+","+members[i].getmScore());
			}
		}
	}
	

	public void main() {
		boolean run = true;
		while (true) {
			showMenu();
			int menu = s.nextInt();
			s.nextLine();
			if (menu == 1) {
				contadd();
			} else if (menu == 2) {
				contMo();
			} else if (menu == 3) {
				contdel();
			} else if (menu == 4) {
				list();
			} else if (menu == 5) {
				search();
			} else if (menu == 6) {

			} else if (menu == 7) {
				run = false;
			}
			System.out.println("프로그램종료");
		}

	} // main

}