package pattern;
class Address {
	private String city;
	private String state;
	
	public Address(String city, String state) {
		this.city = city;
		this.state = state;
	}
	public Address(Address address) {
		this(address.city, address.state);
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	static Address getAddress(Address address) {
	return	new Address(address.city,address.state);
	}

}
public final class ImmutableStudent {
	private final int id;
	private final String name;
	private Address address;
	public ImmutableStudent(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Address getAddress() {
		//return address;
		//return new Address(address);
		return Address.getAddress(address);
	}
	
	@Override
	public String toString() {
		return "ImmutableStudent [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	public static void main(String[] args) {
		Address addr = new Address("Pune", "Maharashtra");
		ImmutableStudent student = new ImmutableStudent(1, "Ram", addr);
		
		System.out.println(student+" hashcode :"+student.hashCode());
		
		student.getAddress().setCity("Mumbai");
		System.out.println(student+" hashcode :"+student.hashCode());
	}
}