package fr.ubordeaux.ao.domain;

public class Value {
    public Integer _id;
    private String _name;

    void Value(Integer id, String name) {
        this._id = id;
        this._name = name;
    }

    public Boolean equals(Value value) {
        if(
            value.id() == this._id
            && value.name() == this._name
        ) {
            return true;
        }
        return false;
    }
    public Integer id() { return this._id; }
    public String name() { return this._name; }
}