package movement;

import org.lwjgl.input.Keyboard;
import event.EventTarget;
import events.EventUpdate;
import module.Category;
import module.Module;

public class Fly extends Module {
	public Fly() {
		super(name = "Fly", Keyboard.KEY_F, Category.MOVEMENT);
	}
	
	@EventTarget
	public void onUpdate(EventUpdate event) {
		this.setDisplayName("Fly §7Normal");
		
		mc.player.capabilities.isFlying = true;
	}
	
	@Override
	public void onDisable() {
		super.onDisable();
		
		mc.player.capabilities.isFlying = false;
	}
}
