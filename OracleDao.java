package javaproject;

public class OracleDao implements DataAccessObject{
	//dataAccessObject 's abstract method should be overrode

	@Override
	public void insert() {
		System.out.println("Oracle DB���� ����");
		
	}

	@Override
	public void update() {
		System.out.println("Oracle DB�� ����");
		
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB���� ����");
		
	}

	@Override
	public void select() {
		System.out.println("Oracle DB���� �˻�");
		
	}
}
