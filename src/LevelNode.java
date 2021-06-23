
public class LevelNode {
	private int value;
    private int level;
	public LevelNode(int value, int level) {
		
		this.value = value;
		this.level = level;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	public LevelNode() {}
	@Override
	public String toString() {
		return "LevelNode [value=" + value + ", level=" + level + "]";
	}
    
	
    
}
