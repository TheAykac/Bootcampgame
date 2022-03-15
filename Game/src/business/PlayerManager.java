package business;

import abstracts.PlayerCheckSerivce;
import abstracts.PlayerService;
import entities.Player;

public class PlayerManager implements PlayerService{
	
	private PlayerCheckSerivce playerCheckSerivce;
	

	public PlayerManager(PlayerCheckSerivce playerCheckSerivce) {
		super();
		this.playerCheckSerivce = playerCheckSerivce;
	}

	@Override
	public void add(Player player) {
		if(playerCheckSerivce.PlayerCheck())
		{
			System.out.println("Oyuncu Kaydedildi: "+player.getFirstName());
		}
		else {
			System.out.println("Kullancý bilgileri hatalý");
		}
		
	}

	@Override
	public void delete(Player player) {

System.out.println("kullanýcý bilgileri silindir: "+player.getFirstName());
		
	}

	@Override
	public void update(Player player) {
		System.out.println("kullanýcý bilgileri güncellendi: "+player.getFirstName());
		
	}

}
