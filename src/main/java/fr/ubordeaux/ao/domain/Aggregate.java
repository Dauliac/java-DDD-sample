package fr.ubordeaux.ao.domain;

public class Aggregate {
    private int _id;

    public void Aggregate(int id) {
        this._id = id;
    }

    public int id() {
        return this._id;
    }
}
