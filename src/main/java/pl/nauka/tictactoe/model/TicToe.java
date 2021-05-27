package pl.nauka.tictactoe.model;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TicToe {

    X(1), O(2);

    private Integer value;


}
