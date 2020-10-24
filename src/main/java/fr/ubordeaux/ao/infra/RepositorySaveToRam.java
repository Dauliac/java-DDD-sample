package fr.ubordeaux.ao.infra;

import fr.ubordeaux.ao.domain.Repository;
import fr.ubordeaux.ao.domain.Aggregate;

import java.util.HashMap;

public class RepositorySaveToRam implements Repository {
    private HashMap<Integer, Aggregate> bucket;

    void RepositorySaveToRam() {
        HashMap<Integer, Aggregate> bucket = new HashMap<Integer, Aggregate>();
    }

    public Integer save(Aggregate aggregate) {
        this.bucket.put(aggregate.id(), aggregate);
        return aggregate.id();
    }
 
    public Aggregate findAggregateById(Integer id) {
        final Aggregate aggregate = this.bucket.get(id);
        return aggregate;
    }
}
