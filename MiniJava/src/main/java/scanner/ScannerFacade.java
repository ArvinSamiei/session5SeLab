package scanner;

import scanner.token.Token;

import java.util.Scanner;

public class ScannerFacade {
    private LexicalAnalyzer lexicalAnalyzer;

    public ScannerFacade(Scanner scanner) {
        this.lexicalAnalyzer = new LexicalAnalyzer(scanner);
    }

    public Token getNextToken() {
        return lexicalAnalyzer.getNextToken();
    }



}
