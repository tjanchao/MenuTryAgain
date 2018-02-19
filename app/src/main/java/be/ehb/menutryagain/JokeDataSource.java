package be.ehb.menutryagain;

import java.util.ArrayList;

/**
 * Created by Q on 19-2-2018.
 */

public class JokeDataSource {

    private static ArrayList<Joke>jokeList;

    private static final JokeDataSource INSTANCE = new JokeDataSource();

    private JokeDataSource(){
        jokeList = new ArrayList<>();
        jokeList.add(new Joke("dsfsdfsdfdf","sdfdfsdf"));
        jokeList.add(new Joke("sdfsdfjk","dsfsdfksjd"));
        jokeList.add(new Joke("sdfsdfdsf","sdfsdfdf"));
    }

    public ArrayList<Joke> getJokeList() {
        return jokeList;
    }

    public static JokeDataSource getINSTANCE() {
        return INSTANCE;
    }
}
