package pl.nauka.tictactoe.controller.dto;

import lombok.Data;
import pl.nauka.tictactoe.model.Player;

@Data
public class ConnectRequest {
    private Player player;
    private String gameId;
}
