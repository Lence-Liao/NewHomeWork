package Model;

public class adopDog {
	private int id;
	private String kind;
	private int year;
    private String sex;
    private String per;
	private String vac;
    private String waf;
    
	public adopDog(String kind, int year, String sex, String per, String vac, String waf ) {
		super();
		this.kind = kind;
		this.year = year;
		this.sex = sex;
		this.per = per;
		this.vac = vac;
		this.waf = waf;
		
	}
	public adopDog(String kind, int year, String sex, String per, String vac, String waf ,int id) {
		super();
		this.kind = kind;
		this.year = year;
		this.sex = sex;
		this.per = per;
		this.vac = vac;
		this.waf = waf;
		this.id=id;
		
	}
	public adopDog() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPer() {
		return per;
	}

	public void setPer(String per) {
		this.per = per;
	}

	public String getVac() {
		return vac;
	}

	public void setVac(String vac) {
		this.vac = vac;
	}

	public String getWaf() {
		return waf;
	}

	public void setWaf(String waf) {
		this.waf = waf;
	}

	public static void main(String[] args) {
		
	}
    public String ak(adopDog b) {
		
		return "ID: "+b.getId()+"\t品種: "+b.getKind()+"\t年齡"+
		b.getYear()+"\t性別"+b.getSex()+"\t個性"+b.getPer()+"\t疫苗"+b.getVac()+"\t晶片"+b.getWaf();
						
	}

}
