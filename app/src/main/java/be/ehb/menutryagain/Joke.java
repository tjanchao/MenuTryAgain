package be.ehb.menutryagain;

import java.io.Serializable;

/**
 * Created by Q on 19-2-2018.
 */

public class Joke implements Serializable {

    private String joke;
    private String punchline;



    public Joke(String joke, String punchline) {
        this.joke = joke;
        this.punchline = punchline;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public String getPunchline() {
        return punchline;
    }

    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }

    @Override
    public String toString() {
        return this.joke;
    }
}
