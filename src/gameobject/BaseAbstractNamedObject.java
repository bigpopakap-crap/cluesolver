package gameobject;

import misc.NamedObject;




public abstract class BaseAbstractNamedObject implements NamedObject {
	
	private String name;
	
	public BaseAbstractNamedObject(String name) {
		if (name == null) throw new IllegalArgumentException();
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return getName();
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null || !(o instanceof NamedObject)) {
			return false;
		}
		
		NamedObject namedObj = (NamedObject) o;
		
		return getName() != null
					? getName().equals(namedObj.getName())
					: namedObj.getName() == null;
	}
	
	@Override
	public int hashCode() {
		return toString().hashCode();
	}
	
	@Override
	public int compareTo(NamedObject namedObj) {
		if (namedObj == null) {
			return -1;
		}
		return getName().compareTo(namedObj.getName());
	}
	
}
