package Constructerinjection;

public class Constructerinject {
	private Integer id;
	private  String name;
	public Constructerinject(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Constructerinject [id=" + id + ", name=" + name + "]";
	}
	

}