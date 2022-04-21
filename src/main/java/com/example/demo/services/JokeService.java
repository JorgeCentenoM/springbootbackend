package com.example.demo.services;

import java.util.ArrayList;

import com.example.demo.models.Joke;
import com.example.demo.repositories.JokeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeService {
   @Autowired
   JokeRepository jokeRepository;
   
   public Joke saveJoke(Joke joke){
   //insert into joke(text) values('el chiste')
    return jokeRepository.save(joke);


   }  


   public ArrayList<Joke> getALLJokes(){
    //select * from joke
    ArrayList<Joke> jokes = (ArrayList<Joke>) jokeRepository.findAll();

    return jokes;
   }
}
