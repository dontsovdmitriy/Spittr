package com.dontsov.spittr.data;

import com.dontsov.spittr.Spittle;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SpittleRepositoryImpl implements SpittleRepository {
    @Override
    public List<Spittle> findSpittles(long max, int count) {
        return null;
    }
}
