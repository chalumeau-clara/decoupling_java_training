package main.java.fr.lernejo.guessgame;

import main.java.fr.lernejo.logger.*;

import java.util.Scanner;

public class HumanPlayer implements Player{
    public final Logger logger = LoggerFactory.getLogger("Player");
    public Scanner console = new Scanner(System.in);

    @Override
    public long askNextGuess() {
        return 0;
    }

    @Override
    public void respond(boolean lowerOrGreater) {

    }
}
