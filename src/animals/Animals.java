package animals;

public class Animals {
	private String 名前;
	private int 年齢;
	
	public Animals(String 名前, int 年齢) {
		this.名前 = 名前;
		this.年齢 = 年齢;
		}
	
	public void say() {
		System.out.println(名前 + "です。" + 年齢 + "歳です。");
	}

}

interface Thinkable {
	public void think();
}

class Human extends Animals implements Thinkable {
	private String 趣味;
	public Human(String 名前, int 年齢, String 趣味) {
		super(名前, 年齢);
		this.趣味 = 趣味;
	}
	public void think() {
		System.out.println("私は" + 趣味 + "について考えています。");
	}
}

