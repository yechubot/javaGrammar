package javaproject;

public class SMSSender extends MessageSender{
	String returnPhoneNo;
	String message;
	
	public SMSSender(String title, String senderName, String returnPhoneNo, String message) {
		super(title, senderName);
		this.returnPhoneNo = returnPhoneNo;
		this.message = message;
	}

	@Override
	void sendMessage(String recipient) {
		System.out.println("------------------------------");
		System.out.println("����: "+title);
		System.out.println("������ ���: "+senderName);
		System.out.println("��ȭ��ȣ: "+recipient);
		System.out.println("ȸ�� ��ȭ��ȣ: "+returnPhoneNo);
		System.out.println("����: "+message);
	}
	

}
