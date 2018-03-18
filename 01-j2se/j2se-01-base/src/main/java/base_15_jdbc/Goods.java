package base_15_jdbc;

public class Goods {
	String goodsName;
	int userId;
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Goods [goodsName=" + goodsName + ", userId=" + userId + "]";
	}
	
}
