package fr.ubordeaux.ao.domain;

public interface Repository {
    public Integer save(Aggregate aggregate);
    public Aggregate findAggregateById(Integer id);
}
