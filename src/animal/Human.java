package animal;



class Human extends Animal implements Thinkable {
	private String 趣味;
	public Human(String 名前, int 年齢, String 趣味) {
		super(名前, 年齢);
		this.趣味 = 趣味;
	}
	public void think() {
		System.out.println("私は" + 趣味 + "について考えています。");
	}
}