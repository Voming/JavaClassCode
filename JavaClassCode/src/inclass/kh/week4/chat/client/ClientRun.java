package inclass.kh.week4.chat.client;

import javax.swing.JOptionPane;

public class ClientRun {
	public static void main(String[] args) {
		String nickName = JOptionPane.showInputDialog("닉네임을 입력하세요.");
		// cancel => null, 입력하지 않고 ok => ""
		System.out.println(nickName);
		if (nickName != null && !nickName.equals("")) { // 두개의 순서 바뀐다면 null예외 발생함
			new ClientGUI(nickName); // && 일때 null체크는 앞쪽에서
		} else {
			System.out.println("닉네임 없이는 채팅 입장이 불가합니다.");
		}
	}
}
