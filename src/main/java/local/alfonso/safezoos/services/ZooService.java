package local.alfonso.safezoos.services;

import local.alfonso.safezoos.models.Zoo;
import local.alfonso.zoo.views.CountAnimalsInZoo;

import java.util.ArrayList;

public interface ZooService
{
    ArrayList<Zoo> findAll();

    void delete(long id);

    ArrayList<CountAnimalsInZoo> getCountAnimalsInZoos();

    Zoo save(Zoo zoo);

    Zoo update(Zoo zoo, long id);
}
