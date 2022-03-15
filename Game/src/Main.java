import abstracts.PlayerService;
import business.GameManager;
import entities.Campaign;
import entities.Game;
import entities.Player;

public class Main {

	public static void main(String[] args) {
		
		Game game = new Game(1,"GTA Vice City",15);
        Player player = new Player(1,"Ömer","Dilara","123132123","1997");
        Campaign campaign1 = new Campaign(1,"Nostaljik Oyun Ýndirimi",20);
        PlayerService gamerService = new GamerManager(new PlayerService());
        GameManager gameManager = new GameManager();
        gameManager.newGame(game);
        gamerService.register(gamer1);
       
	}

}
