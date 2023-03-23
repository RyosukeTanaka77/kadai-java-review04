package animal;

public class Animal {
	private String 名前;
	private int 年齢;
	
	public Animal(String 名前, int 年齢) {
		this.名前 = 名前;
		this.年齢 = 年齢;
		}
	
	public void say() {
		System.out.println(名前 + "です。" + 年齢 + "歳です。");
	}

}



