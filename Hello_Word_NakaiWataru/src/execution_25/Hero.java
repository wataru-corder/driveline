package execution_25;

public class Hero extends Human {
	private int hp;
	private int mp;
	private int attack;
	private int speed;
	private int defense;
	
	public Hero() {}
	
	public Hero(int hp, int mp, int attack, int speed, int defense) {
		this.hp = hp;
		this.mp = mp;
		this.attack = attack;
		this.speed = speed;
		this.defense = defense;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	
}
//HP：849
//MP：862
//攻撃力：375
//素早さ：937
//防御力：24