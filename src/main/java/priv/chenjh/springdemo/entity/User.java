package priv.chenjh.springdemo.entity;

public class User {
    private Integer id;
    private String name;
    private String address;
    private String sex;
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getSex() {
		return sex;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
    
}