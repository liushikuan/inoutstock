package entity;

/*
 * @author liushikuan
 * @date   2017��10��3��12:02:57
 * ������ʷʵ����
 *  table in_stock_history
 */
public class InStockHistory {
	private String id;//id
	private String goodnum;//�������
	private String num;//��������
	private String date;//����ʱ��
	private String size;//����
	private String attribute1;
	private String attribute2;
	private String attribute3;//����
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGoodnum() {
		return goodnum;
	}
	public void setGoodnum(String goodnum) {
		this.goodnum = goodnum;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getAttribute1() {
		return attribute1;
	}
	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}
	public String getAttribute2() {
		return attribute2;
	}
	public void setAttribute2(String attribute2) {
		this.attribute2 = attribute2;
	}
	public String getAttribute3() {
		return attribute3;
	}
	public void setAttribute3(String attribute3) {
		this.attribute3 = attribute3;
	}
	public InStockHistory(String id, String goodnum, String num, String date, String size, String attribute1,
			String attribute2, String attribute3) {
		super();
		this.id = id;
		this.goodnum = goodnum;
		this.num = num;
		this.date = date;
		this.size = size;
		this.attribute1 = attribute1;
		this.attribute2 = attribute2;
		this.attribute3 = attribute3;
	}
}
