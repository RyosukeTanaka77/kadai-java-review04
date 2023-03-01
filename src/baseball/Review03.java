package baseball;

public class Review03 {

	public static void main(String[] args) {
		BaseBallTeam yakuruto =new BaseBallTeam();
		yakuruto.setName("東京ヤクルトスワローズ");
		yakuruto.setWin(80);
		yakuruto.setLose(59);
		yakuruto.setDraw(4);
		yakuruto.report();
		
		BaseBallTeam beisutazu =new BaseBallTeam();
		beisutazu.setName("横浜DeNAベイスターズ");
		beisutazu.setWin(73);
		beisutazu.setLose(68);
		beisutazu.setDraw(2);
		beisutazu.report();
		
		BaseBallTeam taigasu =new BaseBallTeam();
		taigasu.setName("阪神タイガース");
		taigasu.setWin(68);
		taigasu.setLose(71);
		taigasu.setDraw(4);
		taigasu.report();
		
		BaseBallTeam jyaiantsu =new BaseBallTeam();
		jyaiantsu.setName("読売ジャイアンツ");
		jyaiantsu.setWin(68);
		jyaiantsu.setLose(72);
		jyaiantsu.setDraw(3);
		jyaiantsu.report();
		
		BaseBallTeam kapu =new BaseBallTeam();
		kapu.setName("広島東洋カープ");
		kapu.setWin(66);
		kapu.setLose(74);
		kapu.setDraw(3);
		kapu.report();
		
		BaseBallTeam doragonzu =new BaseBallTeam();
		doragonzu.setName("中日ドラゴンズ");
		doragonzu.setWin(66);
		doragonzu.setLose(75);
		doragonzu.setDraw(2);
		doragonzu.report();
		
		// TODO 自動生成されたメソッド・スタブ

	}

}
