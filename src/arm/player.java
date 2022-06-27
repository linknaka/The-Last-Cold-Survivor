package arm;

public class player {
	
	private int hp;
	private int hipotermia;
	private int fome;
	private int[] cartasEquip=new int[50];
	private int indexequip=0;
	private int maxfome;
	private int maxhipotermia;
	private int maxhp;
	
	public player(int maxfome, int maxhipotermia,int hpInicial) {
		this.maxfome=maxfome;
		this.maxhipotermia=maxhipotermia;
		this.fome=maxfome;
		this.hipotermia=maxhipotermia;
		this.maxhp=hpInicial;
		this.hp=hpInicial;
	}
	
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getHipotermia() {
		return hipotermia;
	}
	public void setHipotermia(int hipotermia) {
		this.hipotermia = hipotermia;
	}
	public int getFome() {
		return fome;
	}
	public void setFome(int fome) {
		this.fome = fome;
	}
	public int[] getCartasEquip() {
		return cartasEquip;
	}
	public void addCartasEquip(int cartasEquip) {
		this.cartasEquip[indexequip] = cartasEquip;
		indexequip++;
	}
	public int getMaxfome() {
		return maxfome;
	}
	public void setMaxfome(int maxfome) {
		this.maxfome = maxfome;
	}
	public int getMaxhipotermia() {
		return maxhipotermia;
	}
	public void setMaxhipotermia(int maxhipotermia) {
		this.maxhipotermia = maxhipotermia;
	}





	
	
}
