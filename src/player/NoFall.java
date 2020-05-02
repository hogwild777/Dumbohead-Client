package player;

import org.lwjgl.input.Keyboard;
import event.EventTarget;
import events.EventUpdate;
import module.Category;
import module.Module;
import net.minecraft.network.play.client.CPacketPlayer;

public class NoFall extends Module {
	public NoFall() {
		super(name = "NoFall", Keyboard.KEY_B, Category.PLAYER);
	}
	
	@EventTarget
	public void onUpdate(EventUpdate event) {
		if(mc.player.fallDistance > 2F)
			mc.player.connection.sendPacket(new CPacketPlayer(true));
	}
}
