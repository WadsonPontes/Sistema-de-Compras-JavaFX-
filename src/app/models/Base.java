package app.models;

import java.util.Objects;

import app.utils.Serial;

public abstract class Base {
    public long id;
    
    public boolean equals(Base obj) {
		return this.id == obj.id;
	}
    
    public int hashCode() {
    	return Objects.hash(super.hashCode(), this.id);
    }
}
