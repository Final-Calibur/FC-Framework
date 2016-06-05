package scripts.fc.framework.mission;

public interface TeslaMission extends Mission
{
	public boolean needsToMule();
	
	public void resetOrder();
	
	public int[] getOrderItems();
}
